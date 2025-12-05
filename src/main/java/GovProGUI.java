import java.awt.Component;
import java.awt.Dimension;
import java.math.BigDecimal;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
                "3. Prediction of an account"
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
                }
                case 2 -> {
                    // Amendment GUI
                    amendBudgetGUI(outputArea);
                }
                case 3 -> {
                    // Prediction GUI
                    PredictionGUI.createAndShowPredGUI();
                }
            }
        });

        frame.setVisible(true);
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
