import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.DecimalFormat;

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


/**
 * The {@code PredictionGUI} class provides a Swing-based
 * graphical user interface for budget prediction.
 *
 * <p>
 * The application allows users to:
 * <ul>
 *   <li>Select a government account</li>
 *   <li>Choose a prediction mode (by year or by value)</li>
 *   <li>Display forecast results using historical data</li>
 * </ul>
 * </p>
 *
 * <p>
 * The predictions are computed using the {@link Prediction} class
 * and are based on historical spending data from 2021 to 2026.
 * </p>
 *
 * <p>
 * This class uses Java Swing components such as {@link JFrame},
 * {@link JComboBox}, {@link JTextField}, and {@link JTextArea}.
 * </p>
 *
 * @version 1.0
 */
public class PredictionGUI {

    /**
     * Sample historical spending data for government entities.
     *
     * <p>
     * Each row represents an entity, while each column corresponds
     * to a year from 2021 to 2026 (without inflation adjustment).
     * </p>
     */
    static double[][] dapanes = { //this an array with values of main entities from 2021 up until 2026 without inflation 
            {3766000, 4097337, 3811641, 4059900, 3974293, 4146883}, //republic presidency
            {143500000, 134251607, 134030043, 140477275, 147343837, 156551972}, //hellenic parliament 
            {34251000, 40536272, 36372937, 37886945, 35723136, 38447884}, //governance presidency
            {2986769000L, 2973891093L, 3172953535L, 3245029336L, 3282162880L, 3487669947L},//interior
            {288237000, 246668455, 252308235, 357219091, 359936589, 404757288},//exterior
            {5495900000L, 5937190083L, 5103551488L, 5362408267L, 5252784805L, 5916035799L},//defence
            {4256596000L, 4276649036L, 4651583743L, 5278434922L, 6150311996L, 6568225405L},//health
            {533261000, 531100091, 506425467, 547747086, 557774970, 569191096},//justice
            {5605100000L, 5363728191L, 5436589608L, 5733987212L, 5660668349L, 5665485468L},//education
            {359100000, 383427915, 409992485, 350395832, 493075321, 546993897},//sport
            {747475497000L, 690153192000L, 669349030000L, 919467234000L, 1068139883000L, 1438513680000L}//finance
        };

    /**
    * Array of years corresponding to the historical data.
    */    
    static double[] years={2021,2022,2023,2024,2025,2026};

    /**
     * Application entry point.
     *
     * <p>
     * Launches the Swing GUI on the Event Dispatch Thread (EDT)
     * using {@link SwingUtilities#invokeLater(Runnable)}.
     * </p>
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowPredGUI());
    }

    /**
     * Creates and displays the Prediction graphical user interface.
     *
     * <p>
     * Initializes all Swing components, layouts, and event listeners.
     * </p>
     */
    public static void createAndShowPredGUI() {
        JFrame frame = new JFrame("Prediction App");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 450);
        frame.setLayout(new BorderLayout());

        //Options panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        //Account selection
        panel.add(new JLabel("Choose an account:"));
        String[] accounts = {
            "1.Republic Presidency", "2.Hellenic Parliament", "3.Governmental Presidency",
            "4.Ministry of Interior", "5.Ministry of Exterior", "6.Ministry of Health",
            "7.Ministry of Justice", "8.Ministry of Education", "9.Ministry of Sport", 
            "10.Ministry of Finance"
        };

        /**
         * JComboBox allowing the user to select a government account.
         */
        JComboBox<String> accountBox = new JComboBox<>(accounts);
        panel.add(accountBox);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Επιλογή τύπου πρόβλεψης
        panel.add(new JLabel("Choose prediction type:"));
        String[] options = { "1.Prediction for a year", "2.Prediction for a value" };
        
        /**
        * JComboBox allowing the user to select a government account.
        */
        JComboBox<String> optionBox = new JComboBox<>(options);
        panel.add(optionBox);


        panel.add(new JLabel("Enter year or value:"));

            // Create a panel for the field
            JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));

            // Add some space (shift right)
            inputPanel.add(Box.createRigidArea(new Dimension(110, 0))); // 30px απόσταση από αριστερά

            /**
            * Text field used for user input (year or target value).
            */
            JTextField inputField = new JTextField();
            inputField.setMaximumSize(new Dimension(90, 30));
            inputPanel.add(inputField);

            // Add to thw main panel
            panel.add(inputPanel);
        // Prediction button
            JPanel buttonPanel = new JPanel();
            JButton predictButton = new JButton("Predict");
            JButton clearButton = new JButton("Clear Results"); // clear button
            buttonPanel.add(predictButton);
            buttonPanel.add(clearButton); // add to panel
            panel.add(buttonPanel);

            frame.add(panel, BorderLayout.NORTH);

            /**
             * Text area displaying prediction results.
             */
            JTextArea resultArea = new JTextArea(10, 50);
            resultArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(resultArea);
            frame.add(scrollPane, BorderLayout.CENTER);

            /**
             * Handles prediction execution based on user input.
             *
             * <p>
             * If prediction type is:
             * <ul>
             *   <li><b>Year-based</b>: predicts the budget value for a given year</li>
             *   <li><b>Value-based</b>: estimates when a target value will be reached</li>
             * </ul>
             * </p>
             *
             * <p>
             * Displays formatted results or error messages accordingly.
             * </p>
             */
            predictButton.addActionListener(e -> {
                int accountIndex = accountBox.getSelectedIndex();
                int optionIndex = optionBox.getSelectedIndex();
                String userInput = inputField.getText();

            Prediction p = new Prediction(); // your class

            try {
                if (optionIndex == 0) {
                    // Prediction for the year
                    int year = Integer.parseInt(userInput);
                    double predictionValue = p.getValueForGivenYear(years, dapanes[accountIndex], year);
                    DecimalFormat df = new DecimalFormat("#,###.00 €");
                    String formatted = df.format(predictionValue);

                    resultArea.append("Prediction for account '" + accounts[accountIndex] +
                                      "' in year " + year + ": " + formatted + "\n");
                } else {
                    // Prediction for the value
                    double value = Double.parseDouble(userInput);
                    DecimalFormat df = new DecimalFormat("#,###.##");

                    String predictedYearandMonth = p.getYearandMonthforGivenValue
                    (years, dapanes[accountIndex], value);
                    resultArea.append("Prediction for account "
                                    + accounts[accountIndex] 
                                    + " to have value:" 
                                    + df.format(value) 
                                    + " is "+ predictedYearandMonth 
                                    + "\n");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        });
        /**
         * Clears all displayed prediction results.
         */
         clearButton.addActionListener(e -> {
            resultArea.setText(""); // Clears all results
        });

        frame.setVisible(true);
    }
}
