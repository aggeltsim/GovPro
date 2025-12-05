import entities.*;
import expenses.*;
import incomes.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/** 
 * The Main class serves as the entry 
 * point of application GovPro that
 * manages and analyzes data related to 
 * the 2025 Greek State Budget.
 * The {@code main} method initializes
 * the data and starts the analysis processes.
 */

public class Main {

  /**
   * Entry point of the 2025 Greek State Budget
   *  analysis application.
   * 
   * @param args command-line arguments 
   */
  public static void main(String[] args) {


    /*The below section of our code provides a menu where each user
     choice triggers a specific category of functionality.
      At first, the user has two options, read the 2025 State Budget
      or change the 2025 State Budget. Depending on the choice, 
      our code continue in the according way.
     */



    int number1 = 0;
    int number2 = 0;
    boolean valid1 = false;
    boolean valid2 = false;

    ArrayList<Income> inc = ObjectsIncomes.createObjectsInc();
    ArrayList<Expenses> exp = ObjectsExpenses.createObjectsExp();
    ArrayList<Entity> ent = ObjectsEntities.createObjectsEnt(); 

        
    Scanner input = new Scanner(System.in);

    while (!valid1) {
      System.out.println("What do you want GovPro to do?"); 
      System.out.println();
        
      System.out.println("1. Reading of the 2025 State Budget.");
      System.out.println("2. Amendment of the 2025 State Budget.");
        
      try {
        number1 = input.nextInt();
        valid1 = true;
      } catch (InputMismatchException e) {
        System.out.println("Please choose as an answer 1 or 2");
        input.next();
      }
    }
    // The case where the user chooses to read the budget. 
    String blue = "\u001B[34m";
    String reset = "\u001B[0m";  
    if (number1 == 1) {
      System.out.println(blue + "--------------Incomes-------------" + reset);
      System.out.println();
      for (Income object : inc) {
        System.out.println(object.toString());
        System.out.println();
      }
      System.out.println();
      System.out.println(blue + "--------------Expenses--------------" + reset);
      System.out.println();
      for (Expenses object : exp) {
        System.out.println(object.toString());
        System.out.println();
      }
      System.out.println();
      System.out.println(blue + "--------------Entities---------------" + reset);
      System.out.println();
      for (Entity object : ent) {
        System.out.println(object.toString());
        System.out.println();
      }
        
    /*The case where the user chooses the amendment of the 
     2025 State Budget. 
     */
    } else {
      while (!valid2) {
        System.out.println("Which category would you be interested in modifying?");
        System.out.println(" Please choose one of the options below."); 
        System.out.println();

        System.out.println("1. Income");
        System.out.println("2. Expences");
        System.out.println("3. Entities");

        try {
          number2 = input.nextInt();
          valid2 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please choose as an answer 1, 2 or 3");
          input.next();
        }
      }
                
      if (number2 == 1) {
        AmendmentIncomes.handleAmountInput();
      // the case where the user chooses the expenses.
      } else if (number2 == 2) {
        AmendmentExpenses.handleAmountInput();
      // the case where the user chooses the entities.
      } else {
        AmendmentEntities.handleAmountInput();
      }
    }
    input.close();
  }
}
