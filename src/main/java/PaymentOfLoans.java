import javax.swing.JOptionPane;

public class PaymentOfLoans {

    public Double yearsToPayOf(Double loanAmount, Double annualInterestRate, Double monthlyPayment) {

        if (annualInterestRate <= 0 || monthlyPayment <= 0 || loanAmount <= 0) {
            throw new IllegalArgumentException("All input values must be greater than zero.");
        }

        Double monthlyInterestRate = annualInterestRate / 12 / 100;
        Double balance = loanAmount;
        int months = 0;

        while (balance > 0) {
            Double interestForThisMonth = balance * monthlyInterestRate;
            balance = balance + interestForThisMonth - monthlyPayment;
            months++;

            if (balance < 0) {
                balance = 0.0;
            }

            if (months > 1000 * 12) {
                throw new IllegalArgumentException("Monthly payment is too low to ever pay off the loan.");
            }
        }

        return (double) months; // επιστρέφει συνολικούς μήνες
    }

    public static void main(String[] args) {

        PaymentOfLoans ex1 = new PaymentOfLoans();

        try {
            Double loanAmount = Double.parseDouble(
                JOptionPane.showInputDialog("Loan Amount (in Euros):")
            );

            Double annualInterestRate = Double.parseDouble(
                JOptionPane.showInputDialog("Annual Interest Rate (in %):")
            );

            Double monthlyPayment = Double.parseDouble(
                JOptionPane.showInputDialog("Monthly Payment (in Euros):")
            );

            Double totalMonths = ex1.yearsToPayOf(
                loanAmount, annualInterestRate, monthlyPayment
            );

            int years = totalMonths.intValue() / 12;
            int months = totalMonths.intValue() % 12;

            JOptionPane.showMessageDialog(
                null,
                "It will take approximately " + years +
                " year(s) and " + months +
                " month(s) to pay off the loan."
            );

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(
                null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE
            );
        }
    }
}


