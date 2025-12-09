import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
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
                    // Reading the budget
                    outputArea.setText("--------------Incomes-------------\n");
                    // Example: loop through your Income objects
                    // for (Income i : inc) outputArea.append(i.toString() + "\n");
                    outputArea.append("...Income objects...\n\n");
                    outputArea.append("--------------Expenses-------------\n");
                    outputArea.append("...Expense objects...\n\n");
                    outputArea.append("--------------Entities-------------\n");
                    outputArea.append("...Entity objects...\n\n");

                    outputArea.setCaretPosition(outputArea.getDocument().getLength());
                }
                case 2 -> {
                    // Amendment GUI
                    amendBudgetGUI(outputArea);
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


    private static void amendBudgetGUI(JTextArea outputArea) {
        JFrame amendFrame = new JFrame("Amend Budget");
        amendFrame.setSize(500, 400);
        amendFrame.setLayout(new BoxLayout(amendFrame.getContentPane(), BoxLayout.Y_AXIS));

        JLabel categoryLabel = new JLabel("Select a category to amend:");
        amendFrame.add(categoryLabel);

        String[] categories = {"Income", "Expenses", "Entities"};
        JComboBox<String> categoryBox = new JComboBox<>(categories);
        categoryBox.setMaximumSize(new Dimension(400, 30));
        amendFrame.add(categoryBox);

        JLabel itemLabel = new JLabel("Select item to amend:");
        amendFrame.add(itemLabel);

        JTextField itemField = new JTextField();
        itemField.setMaximumSize(new Dimension(200, 30));
        amendFrame.add(itemField);

        JLabel amountLabel = new JLabel("Enter new amount:");
        amendFrame.add(amountLabel);

        JTextField amountField = new JTextField();
        amountField.setMaximumSize(new Dimension(200, 30));
        amendFrame.add(amountField);

        JButton saveButton = new JButton("Save");
        amendFrame.add(saveButton);

        saveButton.addActionListener(e -> {
            try {
                int itemNum = Integer.parseInt(itemField.getText());
                BigDecimal newAmount = new BigDecimal(amountField.getText());
                // TODO: Based on categoryBox selection, update the corresponding object
                outputArea.append("Updated item " + itemNum + " to " + newAmount + "€\n");
                JOptionPane.showMessageDialog(amendFrame, "Successfully updated!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(amendFrame, "Please enter valid numbers!");
            }
        });

        amendFrame.setVisible(true);
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
}
