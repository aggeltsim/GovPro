package Percentage.percentage;

import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class GUI2 {
    private GUI1 gui;

    public GUI2(GUI1 gui) { this.gui = gui; }

    public void setupContextMenu() {
        ContextMenu menu = new ContextMenu();
        MenuItem itemA = new MenuItem("Προσθήκη στον Αριθμητή (Α)");
        MenuItem itemB = new MenuItem("Προσθήκη στη Βάση (Β)");
        itemA.setOnAction(e -> addSelectedToField(gui.codeAField));
        itemB.setOnAction(e -> addSelectedToField(gui.codeBField));
        menu.getItems().addAll(itemA, itemB);
        gui.csvDisplayArea.setContextMenu(menu);
    }

    private void addSelectedToField(TextField field) {
        String selected = gui.csvDisplayArea.getSelectedText();
        if (selected == null || selected.isEmpty()) return;
        String codes = Arrays.stream(selected.split("\n")).map(line -> line.split(",")[0].trim()).collect(Collectors.joining(", "));
        field.setText(field.getText().isEmpty() ? codes : field.getText() + ", " + codes);
    }

    public void setupKeyboardEvents() {
        gui.codeAField.setOnKeyPressed(e -> { if(e.getCode() == KeyCode.ENTER) processCalculation(); });
        gui.codeBField.setOnKeyPressed(e -> { if(e.getCode() == KeyCode.ENTER) processCalculation(); });
    }

    public void showVividInstructions() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Οδηγός Χρήσης Προϋπολογισμού");
        alert.setHeaderText("Καλώς ήρθατε στον 'Ποσοστιαίο' Αναλυτή του Κράτους!");
        
        TextArea area = new TextArea(
            "Εδώ μπορείτε να δείτε πως κατανέμονται τα λεφτά της Ελλάδας για το 2025!\n\n" +
            "ΠΩΣ ΔΟΥΛΕΥΕΙ:\n" +
            "1. Δείτε τη λίστα: Κάθε γραμμή είναι ένα μέρος της κρατικής αλυσίδας (π.χ. Φόροι, Υγεία, Άμυνα).\n" +
            "2. Διαλέξτε 'συστατικά': Με το ποντίκι σας, επιλέξτε κωδικούς από το κείμενο, κάντε δεξί κλικ και αυτόματα εισάγονται στο πεδίο που επιλέξατε.\n" +
            "3. Συγκρίνετε: Στο πεδίο (Α) βάλτε το κομμάτι της αλυσίδας που σας ενδιαφέρει και στο (Β) το 'μεγάλο σύνολο' με το οποίο θέλετε να το συγκρίνετε.\n\n" +
            "💡 ΠΑΡΑΔΕΙΓΜΑ:\n" +
            "Αν βάλετε στον Αριθμητή (Α) τον κωδικό της Υγείας (1015) και στη Βάση (Β) τον κωδικό των συνολικών Φόρων (11), " +
            "θα μάθετε τι ποσοστό των φόρων μας ξοδεύεται στα νοσοκομεία.\n\n" +
            "Πατήστε ENTER και η εφαρμογή θα σας εξηγήσει τα πάντα σαν παιχνίδι!"
        );
        area.setWrapText(true); area.setEditable(false);
        alert.getDialogPane().setContent(area);
        alert.showAndWait();
    }

    public void processCalculation() {
    try {
        String rawA = gui.codeAField.getText().trim();
        String rawB = gui.codeBField.getText().trim();

        // 1. check for empty fields
        if (rawA.isEmpty() || rawB.isEmpty()) {
            throw new IllegalArgumentException("Παρακαλώ εισάγετε κωδικούς για να γίνει ο υπολογισμός!");
        }

        List<String> codesA = parse(rawA);
        List<String> codesB = parse(rawB);

        // 2. check for duplicates (e.g. 11, 11)
        checkForDuplicates(codesA, "Αριθμητή (Α)");
        checkForDuplicates(codesB, "Βάσης (Β)");

        // 3. check for Identity (A and B are identical)
        if (new HashSet<>(codesA).equals(new HashSet<>(codesB))) {
            throw new IllegalArgumentException("Τα πεδία Α και Β περιέχουν τους ίδιους κωδικούς. Το αποτέλεσμα θα είναι 100%, κάτι που δεν έχει νόημα για ανάλυση.");
        }

        // 4. check for Sub-codes
        // Prevents double counting e.g. 11 and 111
        checkForSubCodes(codesA, "Αριθμητή (Α)");
        checkForSubCodes(codesB, "Βάσης (Β)");

        // 5. check for existence of codes in CSV
        validateCodesExist(codesA);
        validateCodesExist(codesB);

        BigDecimal sumA = codesA.stream().map(gui.amounts::get).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal sumB = codesB.stream().map(gui.amounts::get).reduce(BigDecimal.ZERO, BigDecimal::add);

        // 6. check for Division by Zero
        if (sumB.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Το ποσό στη Βάση (Β) είναι μηδέν. Η διαίρεση είναι αδύνατη!");
        }

        // 7. check for A > B (Confirmation)
        if (sumA.compareTo(sumB) > 0) {
            Alert confirm = new Alert(Alert.AlertType.CONFIRMATION, 
                "Προσοχή: Ο Αριθμητής είναι μεγαλύτερος από τη Βάση. Το ποσοστό θα υπερβεί το 100%. Συνέχεια;", 
                ButtonType.YES, ButtonType.NO);
            if (confirm.showAndWait().get() == ButtonType.NO) return;
        }

        // 8. Calculate and Show Percentage
        BigDecimal perc = gui.calculator.calculatePercentage(
            codesA.stream().map(gui.amounts::get).collect(Collectors.toList()),
            codesB.stream().map(gui.amounts::get).collect(Collectors.toList())
        );

        String formatted = String.format("%.2f", perc) + " %";
        gui.resultLabel.setText("Αποτέλεσμα: " + formatted);
        gui.historyItems.add(0, formatted + " (" + rawA + " / " + rawB + ")");

        showSimpleExplanation(codesA, sumA, codesB, sumB, formatted);

    } catch (Exception ex) {
        showErrorDialog("Σφάλμα", ex.getMessage());
    }
}

// --- Additional Check Methods ---
private void showErrorDialog(String title, String message) {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle(title);
    alert.setHeaderText(null);
    TextArea area = new TextArea(message == null ? "" : message);
    area.setWrapText(true);
    area.setEditable(false);
    area.setPrefSize(600, 220);
    alert.getDialogPane().setContent(area);
    alert.getDialogPane().setMinWidth(600);
    alert.getDialogPane().setMinHeight(220);
    alert.showAndWait();
}

private void checkForDuplicates(List<String> codes, String fieldName) {
    Set<String> set = new HashSet<>();
    for (String c : codes) {
        if (!set.add(c)) {
            throw new IllegalArgumentException("Ο κωδικός '" + c + "' εμφανίζεται δύο φορές στο πεδίο του " + fieldName + ".");
        }
    }
}

private void checkForSubCodes(List<String> codes, String fieldName) {
    for (String c1 : codes) {
        for (String c2 : codes) {
            if (!c1.equals(c2) && (c1.startsWith(c2) || c2.startsWith(c1))) {
                String parent = c1.length() < c2.length() ? c1 : c2;
                String child = c1.length() < c2.length() ? c2 : c1;
                throw new IllegalArgumentException("Λογικό Σφάλμα στο πεδίο " + fieldName + ":\n" +
                    "Ο κωδικός '" + child + "' περιλαμβάνεται ήδη μέσα στον κωδικό '" + parent + "'.\n" +
                    "Αν τους προσθέσετε και τους δύο, το ποσό θα μετρηθεί διπλά!");
            }
        }
    }
}

private void validateCodesExist(List<String> codes) {
    for (String c : codes) {
        if (!gui.amounts.containsKey(c)) {
            throw new NoSuchElementException("Ο κωδικός '" + c + "' δεν υπάρχει στα δεδομένα του 2025.");
        }
    }
}

private void showSimpleExplanation(List<String> cA, BigDecimal sA, List<String> cB, BigDecimal sB, String res) {
    String namesA = cA.stream().map(gui.loader::getName).collect(Collectors.joining(" και "));
    String namesB = cB.stream().map(gui.loader::getName).collect(Collectors.joining(" και "));

    // Reformat numbers for Greek model
    java.text.NumberFormat formatter = java.text.NumberFormat.getInstance(new java.util.Locale("el", "GR"));
    String formattedSumA = formatter.format(sA);
    String formattedSumB = formatter.format(sB);

    Alert info = new Alert(Alert.AlertType.INFORMATION);
    info.setTitle("Τι σημαίνει αυτό το νούμερο;");
    info.setHeaderText(null);

     TextArea text = new TextArea(
        "Ας δούμε τι ανακαλύψαμε για τον Προϋπολογισμό του 2025:\n\n" +
        "Φανταστείτε ότι όλα τα χρήματα που μαζεύει το κράτος από τα στοιχεία [" + namesB + "] " +
        "είναι μια μεγάλη πίτα που αξίζει " + formattedSumB + " €.\n\n" +
        "Εσείς διαλέξατε να δείτε ένα κομμάτι αυτής της πίτας, που είναι τα στοιχεία [" + namesA + "], " +
        "με αξία " + formattedSumA + " €.\n\n" +
        "Η ετυμηγορία:\n" +
        "Το κομμάτι που διαλέξατε πιάνει το " + res + " της συνολικής πίτας. " +
        "Για να το καταλάβετε πιο απλά, αν η πίτα είχε 100 ίσα κομμάτια, τα στοιχεία που εξετάζετε " +
        "θα ήταν περίπου " + String.format("%.1f", Double.parseDouble(res.replace("%","").replace(",",".").trim())) + " κομμάτια.\n\n" +
        "Είναι σαν να λέμε ότι για κάθε 100€ που υπάρχουν στο 'καλάθι' του παρονομαστή, " +
        "τα " + String.format("%.2f", sA.divide(sB, 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100))) + "€ πηγαίνουν στον αριθμητή."
    );
    
    text.setWrapText(true); 
    text.setEditable(false); 
    text.setPrefSize(550, 300);
    info.getDialogPane().setContent(text);
    info.showAndWait();
}
    private List<String> parse(String s) {
        return Arrays.stream(s.split(",")).map(String::trim).filter(i -> !i.isEmpty()).collect(Collectors.toList());
    }

    public void loadCsvToDisplay() {
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(
                getClass().getClassLoader().getResourceAsStream(Loader.CSV_FILE), java.nio.charset.StandardCharsets.UTF_8))) {
            br.readLine(); StringBuilder sb = new StringBuilder(); String line;
            while ((line = br.readLine()) != null) sb.append(line).append("\n");
            gui.resultLabel.setWrapText(true);
            gui.csvDisplayArea.setText(sb.toString());
        } catch (Exception e) { e.printStackTrace(); }
    }
}
