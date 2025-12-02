package Percentage;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * PercentageGUI: The main GUI application class.
 * It coordinates data loading (CsvLoader) and calculations (Calculator).
 */
public class GUI extends JFrame {

    // GUI components
    private JTextField codeAField;
    private JTextField codeBField;
    private JTextArea csvDisplayArea;
    private JLabel resultLabel;
    
    // Dependencies
    private final Loader loader;
    private final Calculator calculator;
    
    private Map<String, BigDecimal> amounts;

    public GUI() {
        super("Υπολογισμός Ποσοστού από CSV");
        
        // Initialize dependencies
        this.loader = new Loader();
        this.calculator = new Calculator();

        try {
            // Use CsvLoader to preprocess the data
            this.amounts = loader.loadAmounts(); 
        } catch (Exception e) {
            // Simple student-like error handling
            JOptionPane.showMessageDialog(this, "Σφάλμα φόρτωσης αρχείου: " + e.getMessage(), "Fatal Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
        setupGUI();
        loadCsvToDisplay();
    }

    private void setupGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // --- Central Panel: CSV Display (Read-only) ---
        csvDisplayArea = new JTextArea("Φόρτωση δεδομένων...");
        csvDisplayArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        csvDisplayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(csvDisplayArea);
        add(scrollPane, BorderLayout.CENTER);

        // --- Bottom Panel: Input and Results ---
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        
        codeAField = new JTextField(5);
        codeBField = new JTextField(5);
        
        JButton calculateButton = new JButton("Υπολογισμός Ποσοστού"); 
        resultLabel = new JLabel("Αποτέλεσμα: ");
        
        inputPanel.add(new JLabel("Κωδικός A:"));
        inputPanel.add(codeAField);
        inputPanel.add(new JLabel("Κωδικός B:"));
        inputPanel.add(codeBField);
        inputPanel.add(calculateButton);
        inputPanel.add(resultLabel);
        
        add(inputPanel, BorderLayout.SOUTH);

        // --- Button Action Listener ---
        calculateButton.addActionListener(e -> calculatePercentage());
        
        setVisible(true);
    }
    
    /**
     * Reads the raw CSV content to display it to the user in the text area.
     * Must use resource loading logic again.
     */
    private void loadCsvToDisplay() {
        InputStream is = getClass().getClassLoader().getResourceAsStream(Loader.CSV_FILE);
        if (is == null) {
            csvDisplayArea.setText("Δεν βρέθηκε ο πόρος CSV για προβολή. Ελέγξτε τη διαδρομή.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            csvDisplayArea.setText(sb.toString());
            csvDisplayArea.setCaretPosition(0); 
        } catch (IOException e) {
            csvDisplayArea.setText("Αδυναμία φόρτωσης του αρχείου CSV για προβολή.");
        }
    }

    /**
     * Retrieves codes, fetches amounts from the map, and calls the Calculator.
     */
    private void calculatePercentage() {
        String codeA = codeAField.getText().trim();
        String codeB = codeBField.getText().trim();
        
        if (codeA.isEmpty() || codeB.isEmpty()) {
            resultLabel.setText("Αποτέλεσμα: Παρακαλώ εισάγετε και τους δύο κωδικούς.");
            return;
        }

        BigDecimal amountA = amounts.getOrDefault(codeA, BigDecimal.ZERO);
        BigDecimal amountB = amounts.getOrDefault(codeB, BigDecimal.ZERO);

        try {
            // Use the Calculator dependency to get the result
            BigDecimal result = calculator.calculatePercentage(amountA, amountB); 
            
            resultLabel.setText("Αποτέλεσμα: (" + codeA + "/" + codeB + ") = " + result + " %");
            
            // Pop-up summary
            JOptionPane.showMessageDialog(this, 
                "Amount A (" + codeA + ") = " + amountA + "\n" +
                "Amount B (" + codeB + ") = " + amountB + "\n" +
                "Percentage = " + result + " %", 
                "Αποτέλεσμα Υπολογισμού", JOptionPane.INFORMATION_MESSAGE);

        } catch (ArithmeticException e) {
            // Display error from Calculator (division by zero)
            resultLabel.setText("Αποτέλεσμα: Δεν είναι δυνατή η διαίρεση. Το ποσό για τον κωδικό " + codeB + " είναι 0.");
        }
    }
}