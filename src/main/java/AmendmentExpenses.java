import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import expenses.Expenses;

public class AmendmentExpenses {
  public static void handleAmountInput() {
    int number3 = 0;
    int number4 = 0;
    boolean valid3 = false;
    ArrayList<Expenses> exp = ObjectsExpenses.createObjectsExp();
    Scanner input = new Scanner(System.in);
    while (!valid3) {

      System.out.println("Which expence category would you be interested in modifying?");
      System.out.println();

      System.out.println("1. Employee Benefits");
      System.out.println("2. Social Benefits");
      System.out.println("3. Transfers");
      System.out.println("4. Purchases of goods and services");
      System.out.println("5. Subsidies");
      System.out.println("6. Interest");
      System.out.println("7. Other expenses");
      System.out.println("8. Credits under distribution");
      System.out.println("9. Fixed assets");
      System.out.println("10. Valuables");
      System.out.println("11. Loans");
      System.out.println("12. Equity securities and investment fund shares");
      System.out.println("13. Debt securities (liabilities)");
      System.out.println("14. Loans");
      try {
        number3 = input.nextInt();
        System.out.println("Please change the account with the number " + number3);
        number4 = input.nextInt();
        if (number4 == 1) {
          exp.get(0).setAmount(new BigDecimal(number4));
        } else if (number4 == 2) {
          exp.get(1).setAmount(new BigDecimal(number4));
        } else if (number4 == 3) {
          exp.get(2).setAmount(new BigDecimal(number4));
        } else if (number4 == 4) {
          exp.get(3).setAmount(new BigDecimal(number4));
        } else if (number4 == 5) {
          exp.get(4).setAmount(new BigDecimal(number4));
        } else if (number4 == 6) {
          exp.get(5).setAmount(new BigDecimal(number4));
        } else if (number4 == 7) {
          exp.get(6).setAmount(new BigDecimal(number4));
        } else if (number4 == 8) {
          exp.get(7).setAmount(new BigDecimal(number4));
        } else if (number4 == 9) {
          exp.get(8).setAmount(new BigDecimal(number4));
        } else if (number4 == 10) {
          exp.get(9).setAmount(new BigDecimal(number4));
        } else if (number4 == 11) {
          exp.get(10).setAmount(new BigDecimal(number4));
        } else if (number4 == 12) {
          exp.get(11).setAmount(new BigDecimal(number4));
        } else if (number4 == 13) {
          exp.get(12).setAmount(new BigDecimal(number4));
        } else {
          exp.get(13).setAmount(new BigDecimal(number4));
        }
        System.out.println("You succesfully "
            + "changed the account with the amount " + number4 + " euro.");
        valid3 = true;
      } catch (InputMismatchException e) {
      System.out.println("Please choose as an answer a number from 1 to 13");
      input.next();
      }
    }
    input.close();
    
  }
}
