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
        MenuItem itemA = new MenuItem("Add to Numerator (A)");
        MenuItem itemB = new MenuItem("Add to Base (B)");
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

    public void showInstructions() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Budget User Guide");
        alert.setHeaderText("Welcome to the State 'Percentage' Analyzer!");
        
        TextArea area = new TextArea(
            "Here you can see how Greece's money is distributed for 2025!\n\n" +
            "HOW IT WORKS:\n" +
            "1. View the list: Each line is a part of the state chain (e.g., Taxes, Health, Defense).\n" +
            "2. Pick 'ingredients': Select codes from the text with your mouse, right-click, and they are automatically entered into the field you chose.\n" +
            "3. Compare: In field (A) put the part of the chain you are interested in and in (B) the 'grand total' you want to compare it with.\n\n" +
            "💡 EXAMPLE:\n" +
            "If you put the Health code (1015) in the Numerator (A) and the total Taxes code (11) in the Base (B), " +
            "you will find out what percentage of our taxes is spent on hospitals.\n\n" +
            "Press ENTER and the application will explain everything like a game!"
        );
        area.setWrapText(true);
        area.setEditable(false);
        area.setPrefSize(700, 420);
        alert.getDialogPane().setContent(area);
        alert.getDialogPane().setMinWidth(700);
        alert.getDialogPane().setMinHeight(420);
        alert.showAndWait();
    }

    public void processCalculation() {
    try {
        String rawA = gui.codeAField.getText().trim();
        String rawB = gui.codeBField.getText().trim();

        // 1. check for empty fields
        if (rawA.isEmpty() || rawB.isEmpty()) {
            throw new IllegalArgumentException("Please enter codes to perform the calculation!");
        }

        List<String> codesA = parse(rawA);
        List<String> codesB = parse(rawB);

        // 2. check for duplicates (e.g. 11, 11)
        checkForDuplicates(codesA, "Numerator (A)");
        checkForDuplicates(codesB, "Base (B)");

        // 3. check for Identity (A and B are identical)
        if (new HashSet<>(codesA).equals(new HashSet<>(codesB))) {
            throw new IllegalArgumentException("Fields A and B contain the same codes. The result will be 100%, which doesn't make sense for analysis.");
        }

        // 4. check for Sub-codes
        checkForSubCodes(codesA, "Numerator (A)");
        checkForSubCodes(codesB, "Base (B)");

        // 5. check for existence of codes in CSV
        validateCodesExist(codesA);
        validateCodesExist(codesB);

        BigDecimal sumA = codesA.stream().map(gui.amounts::get).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal sumB = codesB.stream().map(gui.amounts::get).reduce(BigDecimal.ZERO, BigDecimal::add);

        // 6. check for Division by Zero
        if (sumB.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("The amount in the Base (B) is zero. Division is impossible!");
        }

        // 7. check for A > B (Confirmation)
        if (sumA.compareTo(sumB) > 0) {
            Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
            confirm.setTitle("Confirmation");
            confirm.setHeaderText(null);
            TextArea confirmArea = new TextArea(
                "Attention: The Numerator is larger than the Base. The percentage will exceed 100%. Continue?");
            confirmArea.setWrapText(true);
            confirmArea.setEditable(false);
            confirmArea.setPrefSize(560, 120);
            confirm.getDialogPane().setContent(confirmArea);
            confirm.getDialogPane().setMinWidth(560);
            confirm.getDialogPane().setMinHeight(140);
            confirm.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
            if (confirm.showAndWait().get() == ButtonType.NO) return;
        }

        // 8. Calculate and Show Percentage
        BigDecimal perc = gui.calculator.calculatePercentage(
            codesA.stream().map(gui.amounts::get).collect(Collectors.toList()),
            codesB.stream().map(gui.amounts::get).collect(Collectors.toList())
        );

        String formatted = String.format("%.2f", perc) + " %";
        gui.resultLabel.setText("Result: " + formatted);
        gui.historyItems.add(0, formatted + " (" + rawA + " / " + rawB + ")");

        showSimpleExplanation(codesA, sumA, codesB, sumB, formatted);

    } catch (Exception ex) {
        showErrorDialog("Error", ex);
    }
}

// --- Additional Check Methods ---
private void showErrorDialog(String title, Exception ex) {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle(title);
    alert.setHeaderText(null);

    String content = (ex.getMessage() != null) ? ex.getMessage() : "An unknown error occurred.";

    TextArea area = new TextArea(content);
    area.setWrapText(true);
    area.setEditable(false);
    
    area.setPrefSize(450, 150); 

    alert.getDialogPane().setContent(area);
    alert.showAndWait();
}
    
private void checkForDuplicates(List<String> codes, String fieldName) {
    Set<String> set = new HashSet<>();
    for (String c : codes) {
        if (!set.add(c)) {
            throw new IllegalArgumentException("The code '" + c + "' appears twice in the " + fieldName + " field.");
        }
    }
}

private void checkForSubCodes(List<String> codes, String fieldName) {
    for (String c1 : codes) {
        for (String c2 : codes) {
            if (!c1.equals(c2) && (c1.startsWith(c2) || c2.startsWith(c1))) {
                String parent = c1.length() < c2.length() ? c1 : c2;
                String child = c1.length() < c2.length() ? c2 : c1;
                throw new IllegalArgumentException("Logic Error in " + fieldName + " field:\n" +
                    "The code '" + child + "' is already included within code '" + parent + "'.\n" +
                    "If you add both, the amount will be double-counted!");
            }
        }
    }
}

private void validateCodesExist(List<String> codes) {
    for (String c : codes) {
        if (!gui.amounts.containsKey(c)) {
            throw new NoSuchElementException("The code '" + c + "' does not exist in the 2025 data.");
        }
    }
}

private void showSimpleExplanation(List<String> cA, BigDecimal sA, List<String> cB, BigDecimal sB, String res) {
    String namesA = cA.stream().map(gui.loader::getName).collect(Collectors.joining(" and "));
    String namesB = cB.stream().map(gui.loader::getName).collect(Collectors.joining(" and "));

    // Reformat numbers using English locale
    java.text.NumberFormat formatter = java.text.NumberFormat.getInstance(java.util.Locale.ENGLISH);
    String formattedSumA = formatter.format(sA);
    String formattedSumB = formatter.format(sB);

    Alert info = new Alert(Alert.AlertType.INFORMATION);
    info.setTitle("What does this number mean?");
    info.setHeaderText(null);

     TextArea text = new TextArea(
        "Let's see what we discovered about the 2025 Budget:\n\n" +
        "Imagine that all the money the state collects from the items [" + namesB + "] " +
        "is a big pie worth " + formattedSumB + " €.\n\n" +
        "You chose to look at a slice of this pie, which are the items [" + namesA + "], " +
        "with a value of " + formattedSumA + " €.\n\n" +
        "The verdict:\n" +
        "The slice you chose takes up " + res + " of the total pie. " +
        "To put it simply, if the pie had 100 equal slices, the items you are examining " +
        "would be approximately " + String.format("%.1f", Double.parseDouble(res.replace("%","").replace(",",".").trim())) + " slices.\n\n" +
        "It's like saying that for every 100€ in the 'denominator basket', " +
        "the " + String.format("%.2f", sA.divide(sB, 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100))) + "€ goes to the numerator."
    );
    
    text.setWrapText(true); 
    text.setEditable(false); 
    text.setPrefSize(600, 320);
    info.getDialogPane().setContent(text);
    info.getDialogPane().setMinWidth(600);
    info.getDialogPane().setMinHeight(320);
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
