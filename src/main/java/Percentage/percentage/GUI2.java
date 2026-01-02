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
            List<String> codesA = parse(gui.codeAField.getText());
            List<String> codesB = parse(gui.codeBField.getText());

            BigDecimal sumA = codesA.stream().map(gui.amounts::get).reduce(BigDecimal.ZERO, BigDecimal::add);
            BigDecimal sumB = codesB.stream().map(gui.amounts::get).reduce(BigDecimal.ZERO, BigDecimal::add);

            BigDecimal perc = gui.calculator.calculatePercentage(
                codesA.stream().map(gui.amounts::get).collect(Collectors.toList()),
                codesB.stream().map(gui.amounts::get).collect(Collectors.toList())
            );

            String res = String.format("%.2f", perc) + " %";
            gui.resultLabel.setText("Αποτέλεσμα: " + res);
            gui.historyItems.add(0, res + " (Σύγκριση " + codesA.size() + " προς " + codesB.size() + " στοιχεία)");

            showSimpleExplanation(codesA, sumA, codesB, sumB, res);

        } catch (Exception ex) {
            new Alert(Alert.AlertType.ERROR, "Κάτι δεν πήγε καλά: " + ex.getMessage()).showAndWait();
        }
    }

    private void showSimpleExplanation(List<String> cA, BigDecimal sA, List<String> cB, BigDecimal sB, String res) {
        String namesA = cA.stream().map(gui.loader::getName).collect(Collectors.joining(" και "));
        String namesB = cB.stream().map(gui.loader::getName).collect(Collectors.joining(" και "));

        Alert info = new Alert(Alert.AlertType.INFORMATION);
        info.setTitle("Τι σημαίνει αυτό το νούμερο;");
        info.setHeaderText(null);

        TextArea text = new TextArea(
            "Ας δούμε τι ανακαλύψατε για τον Προϋπολογισμό του 2025:\n\n" +
            "Φανταστείτε ότι όλα τα χρήματα που μαζεύει το κράτος από τα στοιχεία [" + namesB + "] " +
            "είναι μια μεγάλη πίτα που αξίζει " + sB.toPlainString() + " €.\n\n" +
            "Εσείς διαλέξατε να συγκρίνετε συστατικά (ή και όχι) αυτής της πίτας, δηλαδή τα στοιχεία [" + namesA + "], " +
            "με συνολικη αξία " + sA.toPlainString() + " €, με το σύνολο όλης της πίτας που μπορεί να ανάγεται ακόμη και στο σύνολο του προϋπολογισμού!\n\n" +
            "Η ετυμηγορία:\n" +
            "Το κομμάτι που διαλέξατε πιάνει το " + res + " της συνολικής πίτας. " +
            "Για να το καταλάβετε πιο απλά, αν η πίτα είχε 100 ίσα κομμάτια, τα στοιχεία που εξετάζετε " +
            "θα ισοδυναμούσαν περίπου σε " + String.format("%.1f", res.replace("%","").trim().isEmpty() ? 0 : Double.parseDouble(res.replace("%","").replace(",","."))) + " κομμάτια.\n\n" +
            "Είναι σαν να λέμε ότι για κάθε 100€ που υπάρχουν στο 'καλάθι' του παρονομαστή, " +
            "τα " + String.format("%.2f", sA.divide(sB, 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100))) + "€ πηγαίνουν στον αριθμητή."
        );
        text.setWrapText(true); text.setEditable(false); text.setPrefSize(550, 300);
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
            gui.csvDisplayArea.setText(sb.toString());
        } catch (Exception e) { e.printStackTrace(); }
    }
}
