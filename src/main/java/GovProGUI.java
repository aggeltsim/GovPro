import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GovProGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GovProGUI::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("GovPro Budget System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JLabel mainLabel = new JLabel("What do you want GovPro to do?");
        mainLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        frame.add(mainLabel);

        String[] options1 = {
                "1. Reading of the 2025 State Budget",
                "2. Amendment of the 2025 State Budget",
                "3. Prediction of an account",
                "4. Budget Statistics for years 2022, 2023, 2024."
        };
        JComboBox<String> mainMenu = new JComboBox<>(options1);
        mainMenu.setMaximumSize(new Dimension(400, 30));
        frame.add(mainMenu);

        JButton nextButton = new JButton("Next");
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        frame.add(nextButton);

        JTextArea outputArea = new JTextArea(10, 50);
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea));

        JPanel statsPanel = new JPanel();
        statsPanel.setLayout(new BoxLayout(statsPanel, BoxLayout.Y_AXIS));
        statsPanel.setVisible(false); // αρχικά κρυφό

        nextButton.addActionListener(e -> {
            int choice = mainMenu.getSelectedIndex() + 1;

            switch (choice) {
                case 1 -> {
    // 1. Ορισμός Monospaced γραμματοσειράς για να ευθυγραμμίζονται οι στήλες
    outputArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
    
    StringBuilder sb = new StringBuilder();
    // Formatter για χιλιάδες με κόμμα και 2 δεκαδικά (π.χ. 1.234.567,00)
    java.text.NumberFormat nf = java.text.NumberFormat.getInstance(java.util.Locale.GERMANY);

    // Ορισμός "καλουπιού" για τις γραμμές: 
    // %-6s  -> Code (6 χαρακτήρες, αριστερή στοίχιση)
    // %-55s -> Name (55 χαρακτήρες, αριστερή στοίχιση)
    // %20s  -> Amount (20 χαρακτήρες, δεξιά στοίχιση)
    String headerFormat = "%-6s | %-55s | %20s%n";
    String lineFormat   = "%-6s | %-55s | %20s%n";
    String divider      = "=".repeat(87) + "\n";
    String subDivider   = "-".repeat(87) + "\n";

    sb.append(divider);
    sb.append(String.format(headerFormat, "CODE", "ACCOUNT DESCRIPTION", "AMOUNT (€)"));
    sb.append(divider);

    for (int i = 1; i < data.length; i++) {
        String code = (String) data[i][0];
        String name = (String) data[i][1];
        java.math.BigDecimal amount = (java.math.BigDecimal) data[i][2];

        // Μορφοποίηση του ποσού
        String formattedAmount = nf.format(amount);

        // Προσθήκη ενδιάμεσων τίτλων για να ξέρουμε τι βλέπουμε
        if (code.equals("21")) {
            sb.append("\n").append(divider).append("   EXPENSES\n").append(divider);
        } else if (code.equals("1001")) {
            sb.append("\n").append(divider).append("   ENTITIES / MINISTRIES\n").append(divider);
        } else if (i == 1) {
            sb.append("   INCOMES\n").append(subDivider);
        }

        // Αν το όνομα είναι πολύ μεγάλο, το κόβουμε για να μην χαλάσει η στήλη
        if (name.length() > 52) {
            name = name.substring(0, 52) + "...";
        }

        sb.append(String.format(lineFormat, code, name, formattedAmount));
    }

    outputArea.setText(sb.toString());
    outputArea.setCaretPosition(0); // Επιστροφή στην κορυφή
}
                case 2 -> {
    // 1. Δημιουργούμε ένα Panel για το παράθυρο διαλόγου
    JPanel panel = new JPanel(new GridLayout(0, 1, 5, 5));
    
    // Dropdown για να διαλέξει ο χρήστης τον κωδικό (παίρνουμε τους κωδικούς από το data[][])
    String[] codes = new String[data.length - 1];
    for (int i = 1; i < data.length; i++) {
        codes[i - 1] = (String) data[i][0] + " - " + data[i][1];
    }
    JComboBox<String> codeCombo = new JComboBox<>(codes);
    
    JTextField newValueField = new JTextField();
    
    panel.add(new JLabel("Choose an account to ammend:"));
    panel.add(codeCombo);
    panel.add(new JLabel("New amount:"));
    panel.add(newValueField);

    // 2. Εμφάνιση του διαλόγου
    int result = JOptionPane.showConfirmDialog(frame, panel, 
            "Τροποποίηση Προϋπολογισμού", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

    if (result == JOptionPane.OK_OPTION) {
        try {
            int selectedIndex = codeCombo.getSelectedIndex() + 1; // +1 γιατί το data[0] είναι το header
            String input = newValueField.getText().replace(",", "."); // Μετατροπή κόμματος σε τελεία για το BigDecimal
            java.math.BigDecimal newVal = new java.math.BigDecimal(input);

            // 3. Ενημέρωση του πίνακα data
            java.math.BigDecimal oldVal = (java.math.BigDecimal) data[selectedIndex][2];
            data[selectedIndex][2] = newVal;

            // 4. Ενημέρωση του Output Area για επιβεβαίωση
            outputArea.setFont(new Font("Consolas", Font.PLAIN, 13));
            outputArea.setText(" Change registered successfully!\n");
            outputArea.append("──────────────────────────────────────────────────\n");
            outputArea.append(String.format("Account: %s\n", data[selectedIndex][1]));
            outputArea.append(String.format("Old Value:  %,.2f €\n", oldVal));
            outputArea.append(String.format("New Value:    %,.2f €\n", newVal));
            outputArea.append("──────────────────────────────────────────────────\n");
            outputArea.append(" Choose '1.Reading' to see the new budget table.");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Error: Please give a valid number.", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
                case 3 -> {
                    // Prediction GUI
                    PredictionGUI.createAndShowPredGUI();
                }
                case 4 -> {
                    //Statistics GUI
                    JFrame statsframe = new JFrame("Budget Statistics Reviewer");
                    statsframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    statsframe.setSize(650, 500);
                    statsframe.setLayout(new BorderLayout());

                    // Panel επιλογών
                    JPanel panel = new JPanel();
                    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                    JLabel title = new JLabel("Government Budget Statistics");
                    title.setAlignmentX(Component.CENTER_ALIGNMENT);
                    title.setFont(new Font("Arial", Font.BOLD, 18));
                    panel.add(title);
                    panel.add(Box.createRigidArea(new Dimension(0, 15)));

                    // Row: Year Buttons
                    JPanel yearPanel = new JPanel();
                    JButton y2022 = new JButton("2022");
                    JButton y2023 = new JButton("2023");
                    JButton y2024 = new JButton("2024");
                    yearPanel.add(y2022);
                    yearPanel.add(y2023);
                    yearPanel.add(y2024);
                    panel.add(yearPanel);

                    // Row: Income/Expense Buttons
                    JPanel typePanel = new JPanel();
                    JButton incButton = new JButton("Show Incomes");
                    JButton expButton = new JButton("Show Expenses");
                    JButton clearButton = new JButton("Clear Output");
                    typePanel.add(incButton);
                    typePanel.add(expButton);
                    typePanel.add(clearButton);
                    panel.add(typePanel);

                    statsframe.add(panel, BorderLayout.NORTH);

                    // ----------- TEXT AREA -------------
                    JTextArea output = new JTextArea(15, 50);
                    output.setEditable(false);
                    output.setFont(new Font("Consolas", Font.PLAIN, 14));
                    JScrollPane scroll = new JScrollPane(output);
                    statsframe.add(scroll, BorderLayout.CENTER);

                    // ----------- STATE VARIABLES ---------
                    final int[] selectedYear = {2022};

                    // ----------- BUTTON ACTIONS -----------

                   // Year selection
                   y2022.addActionListener(ev -> {
                    selectedYear[0] = 2022;
                    output.append("Selected year: 2022\n");
                   });
        y2023.addActionListener(ev -> {
            selectedYear[0] = 2023;
            output.append("Selected year: 2023\n");
        });
        y2024.addActionListener(ev -> {
            selectedYear[0] = 2024;
            output.append("Selected year: 2024\n");
        });

        // Show Incomes
        incButton.addActionListener(ev -> {
            displayBudget(selectedYear[0], BudgetDataManager.BudgetType.INCOME, output);
        });

        // Show Expenses
        expButton.addActionListener(ev -> {
            displayBudget(selectedYear[0], BudgetDataManager.BudgetType.EXPENSE, output);
        });

        // Εμφάνιση παραθύρου
    statsframe.setLocationRelativeTo(null);
    statsframe.setVisible(true);

        // Clear output
        clearButton.addActionListener(ev -> output.setText(""));

        
                }
            }
        });
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }

    private static final String[] incomeCategories = { "Taxes", "Social Contributions", "Transfers", 
        "Sales of goods and services", "Other Current Income", "Fixed Assets",
        "Debt Securities", "Equity securities and investment fund shares",
        "Currency Liabilities and deposits", "Debt Securities (Liabilities)", 
        "Loans", "Financial Derivatives"};

    private static final String[] expenseCategories = { "Employee Benefits", "Social Benefits", "Transfers",
        "Purchases of goods and services", "Subsidies", "Interest", "Other expenses",
        "Credits under distribution", "Fixed Assets", "Valuables", "Loans",
        "Equity securities and investments fund shares", "Debt Securities (Liabilities)", 
        "Loans", "Financial Derivatives"};

    // ----------- DISPLAY FUNCTION ----------
    private static void displayBudget(int year, BudgetDataManager.BudgetType type, JTextArea output) {
        BigDecimal[] data = BudgetDataManager.getBudgetData(year, type);
        if (data == null) {
            output.append("No data for year " + year + "\n");
            return;
        }

        output.append("\n--- " + year + " " + (type == BudgetDataManager.BudgetType.INCOME ? "INCOMES" : "EXPENSES") + " ---\n");

        String[] categories = (type == BudgetDataManager.BudgetType.INCOME) ? incomeCategories : expenseCategories;

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
            String name = (i < categories.length) ? categories[i] : "Category " + (i + 1);
            output.append( name + ": " + formatPercent(data[i]) + "%\n");
            }
        }

        output.append("\n");
    }

    private static String formatPercent(BigDecimal val) {
        BigDecimal percent = val.multiply(new BigDecimal("100"));
        return percent.setScale(4, RoundingMode.HALF_UP).toString();
    }

    private static void predictionGUI(JTextArea outputArea) {
        JFrame predFrame = new JFrame("Prediction");
        predFrame.setSize(500, 400);
        predFrame.setLayout(new BoxLayout(predFrame.getContentPane(), BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Choose account for prediction:");
        predFrame.add(label);

        String[] accounts = {
                "Republic Presidency", "Hellenic Parliament", "Governmental Presidency",
                "Ministry of Interior", "Ministry of Exterior", "Ministry of Health",
                "Ministry of Justice", "Ministry of Education", "Ministry of Sport",
                "Ministry of Finance"
        };
        JComboBox<String> accountBox = new JComboBox<>(accounts);
        accountBox.setMaximumSize(new Dimension(400, 30));
        predFrame.add(accountBox);

        JLabel choiceLabel = new JLabel("1. Predict by Year  2. Predict by Value");
        predFrame.add(choiceLabel);

        JTextField choiceField = new JTextField();
        choiceField.setMaximumSize(new Dimension(200, 30));
        predFrame.add(choiceField);

        JLabel inputLabel = new JLabel("Enter the year or value:");
        predFrame.add(inputLabel);

        JTextField inputField = new JTextField();
        inputField.setMaximumSize(new Dimension(200, 30));
        predFrame.add(inputField);

        JButton predictButton = new JButton("Predict");
        predFrame.add(predictButton);

        predictButton.addActionListener(e -> {
            try {
                int choice = Integer.parseInt(choiceField.getText());
                double inputVal = Double.parseDouble(inputField.getText());
                // TODO: call your Prediction class method
                outputArea.append("Prediction result for account " +
                        (accountBox.getSelectedIndex() + 1) + ": " + inputVal + "\n");
                JOptionPane.showMessageDialog(predFrame, "Prediction completed!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(predFrame, "Please enter valid numbers!");
            }
        });

        predFrame.setVisible(true);
    }
     static Object[][] data = {
        {"Code", "Name", "Amount"}, // 0
        {"11", "Taxes", new BigDecimal("62055000000")}, // 1
        {"111", "Taxes on Services and Products", new BigDecimal("33667000000")},
        {"112", "Taxes and Duties on Imports", new BigDecimal("362000000")},
        {"113", "Regular Property Taxes", new BigDecimal("2353000000")},
        {"114", "Other Production Taxes", new BigDecimal("355000000")},
        {"115", "Income Tax", new BigDecimal("23719000000")},
        {"116", "Capital Taxes", new BigDecimal("232000000")},
        {"119", "Other Current Taxes", new BigDecimal("1367000000")},
        {"12", "Social Contributions", new BigDecimal("60000000")},
        {"122", "Other Social Contributions", new BigDecimal("60000000")},
        {"13", "Transfers", new BigDecimal("8131000000")},
        {"131", "Current Domestic Transfers", new BigDecimal("322000000")},
        {"132", "Current Transfers from Organizations and Member States", 
        new BigDecimal("15000000")},
        {"133", "Current Transfers from Foreign Entities", new BigDecimal("8000000")},
        {"134", "Domestic Investment Grants", new BigDecimal("35000000")},
        {"135", "Investment Grants from the EU", new BigDecimal("7645000000")},
        {"139", "Other Capital Transfers", new BigDecimal("106000000")},
        {"14", "Sales of Goods and Services", new BigDecimal("2405000000")},
        {"141", "Goods Sales", new BigDecimal("2000000")},
        {"142", "Provision of Services", new BigDecimal("338000000")},
        {"143", "Rents", new BigDecimal("1418000000")},
        {"144", "Supplies", new BigDecimal("445000000")},
        {"145", "Administrative Fees", new BigDecimal("199000000")},
        {"149", "Other Sales", new BigDecimal("3000000")},
        {"15", "Other Current Income", new BigDecimal("2775000000")},
        {"151", "Interest Income", new BigDecimal("588000000")},
        {"152", "Distributed Corporate Income", new BigDecimal("356000000")},
        {"153", "Natural Resource Rents", new BigDecimal("75000000")},
        {"156", "Fines, Penalties and Assessments", new BigDecimal("1102000000")},
        {"159", "Expense Reimbursements", new BigDecimal("654000000")},
        {"31", "Fixed Assets", new BigDecimal("37000000")},
        {"311", "Buildings and Related Infrastructure", new BigDecimal("37000000")},
        {"43", "Debt Securities", new BigDecimal("11000000")},
        {"432", "Long-term Debt Securities", new BigDecimal("11000000")},
        {"44", "Loans", new BigDecimal("20000000")},
        {"442", "Long-term Loans", new BigDecimal("20000000")},
        {"45", "Equity and Investment Fund Shares", new BigDecimal("467000000")},
        {"451", "Listed Shares", new BigDecimal("239000000")},
        {"452", "Unlisted Shares", new BigDecimal("228000000")},
        {"52", "Currency and Deposit Liabilities", new BigDecimal("66000000")},
        {"521", "Currency in Circulation Liabilities", new BigDecimal("66000000")},
        {"53", "Debt Securities (Liabilities)", new BigDecimal("25973000000")},
        {"531", "Short-term Debt Securities", new BigDecimal("17000000000")},
        {"532", "Long-term Debt Securities", new BigDecimal("8973000000")},
        {"54", "Loans", new BigDecimal("1202027000000")},
        {"541", "Short-term Loans", new BigDecimal("1200000000000")},
        {"542", "Long-term Loans", new BigDecimal("2027000000")},
        {"57", "Financial Derivatives", new BigDecimal("800000000")},
        {"571", "Financial Derivatives", new BigDecimal("800000000")},
        {"21", "Employee Benefits", new BigDecimal("14889199000")},
        {"22", "Social Benefits", new BigDecimal("425136000")},
        {"23", "Transfers", new BigDecimal("34741365000")},
        {"24", "Purchases of Goods and Services", new BigDecimal("2039542000")},
        {"25", "Subsidies", new BigDecimal("80630000")},
        {"26", "Interest", new BigDecimal("7701101000")},
        {"27", "Other Expenses", new BigDecimal("101553000")},
        {"29", "Credits Under Allocation", new BigDecimal("17283053000")},
        {"31", "Fixed Assets", new BigDecimal("2609600000")},
        {"33", "Valuables", new BigDecimal("85000")},
        {"44", "Long-Term Loans", new BigDecimal("3741000000")},
        {"45", "Equity and Investment Fund Shares", new BigDecimal("1755112000")},
        {"53", "Debt Securities (Liabilities)", new BigDecimal("19375000000")},
        {"54", "Short-Term Loans", new BigDecimal("1203165130000")},
        {"1001", "Presidency of the Republic", new BigDecimal("4638000")},
        {"1003", "Hellenic Parliament", new BigDecimal("171950000")},
        {"1004", "Presidency of the Government", new BigDecimal("41689000")},
        {"1007", "Ministry of Interior", new BigDecimal("3830276000")},
        {"1009", "Ministry of Foreign Affairs", new BigDecimal("420237000")},
        {"1011", "Ministry of National Defense", new BigDecimal("6130000000")},
        {"1015", "Ministry of Health", new BigDecimal("7177424000")},
        {"1017", "Ministry of Justice", new BigDecimal("650803000")},
        {"1020", "Ministry of Education, Religious Affairs and", new BigDecimal("6606000000")},
        {"1022", "Ministry of Culture", new BigDecimal("575419000")},
        {"1024", "Ministry of National Economy and", new BigDecimal("1246518464000")},
        {"1029", "Ministry of Rural Development and Food", new BigDecimal("1281403000")},
        {"1031", "Ministry of Environment and Energy", new BigDecimal("2341227000")},
        {"1032", "Ministry of Labor and Social Security", new BigDecimal("18678084000")},
        {"1034", "Ministry of Social Cohesion and", new BigDecimal("3989553000")},
        {"1036", "Ministry of Development", new BigDecimal("818045000")},
        {"1039", "Ministry of Infrastructure and Transport", new BigDecimal("2694810000")},
        {"1041", "Ministry of Shipping and Island Policy", new BigDecimal("651864000")},
        {"1045", "Ministry of Tourism", new BigDecimal("189293000")},
        {"1053", "Ministry of Digital Governance", new BigDecimal("1073928000")},
        {"1055", "Ministry of Migration and Asylum", new BigDecimal("475871000")},
        {"1057", "Ministry of Citizen Protection", new BigDecimal("2285820000")},
        {"1060", "Ministry of Climate Crisis and Civil Protection", new BigDecimal("1221116000")},
        {"1901", "Decentralized Administration of Attica", new BigDecimal("13091000")},
        {"1902", "Decentralized Administration of Thessaly-Central Greece", 
        new BigDecimal("10579000")},
        {"1903", "Decentralized Administration of Epirus-Western Greece", 
        new BigDecimal("9943000")},
        {"1904", "Decentralized Administration of Peloponnese -", new BigDecimal("14918000")},
        {"1905", "Decentralized Administration of the Aegean", new BigDecimal("6188000")},
        {"1906", "Decentralized Administration of Crete", new BigDecimal("6497000")},
        {"1907", "Decentralized Administration of Macedonia - Thrace", new BigDecimal("18376000")}
    };
}
