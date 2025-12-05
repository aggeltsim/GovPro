import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import incomes.Income;

public class AmendmentIncomes {
  public static void handleAmountInput() {
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    boolean valid3 = false;
    boolean valid4 = false;
    ArrayList<Income> inc = ObjectsIncomes.createObjectsInc();
    Scanner input = new Scanner(System.in);
    while (!valid3) {
      System.out.println("Which income category would you be interested in modifying?");
      System.out.println();
        
      System.out.println("1. Taxes");
      System.out.println("2. Social contributions");
      System.out.println("3. Transfers");
      System.out.println("4. Sales of goods and services");
      System.out.println("5. Other current income");
      System.out.println("6. Fixed assets");
      System.out.println("7. Debt securities");
      System.out.println("8. Loans (repay older debt)");
      System.out.println("9. Equity securities and investment fund shares");
      System.out.println("10. Currency liabilities and deposits");
      System.out.println("11. Debt Securities (Liabilities)");
      System.out.println("12. Loans");
      System.out.println("13. Financial derivatives");
      try {
        number3 = input.nextInt();
        valid3 = true;
      } catch (InputMismatchException e) {
        System.out.println("Please choose as an answer a number from 1 to 13");
        input.next();
      }
    }
    if (number3 == 1) {
      while (!valid4) {

        System.out.println("Please choose one of the options below.");
        System.out.println();

        System.out.println("1. Taxes on goods and services");
        System.out.println("2. Taxes and duties on imports");
        System.out.println("3. Regular taxes on real estate");
        System.out.println("4. Other taxes on production");
        System.out.println("5. Income tax");
        System.out.println("6. Capital taxes");
        System.out.println("7. Other current taxes");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          if (number5 == 1) {
            inc.get(0).setAmount(new BigDecimal(number5));
          } else if (number5 == 2) {
            inc.get(1).setAmount(new BigDecimal(number5));
          } else if (number5 == 3) {
            inc.get(2).setAmount(new BigDecimal(number5));
          } else if (number5 == 4) {
            inc.get(3).setAmount(new BigDecimal(number5));
          } else if (number5 == 5) {
            inc.get(4).setAmount(new BigDecimal(number5));
          } else if (number5 == 6) {
            inc.get(5).setAmount(new BigDecimal(number5));
          } else {
            inc.get(6).setAmount(new BigDecimal(number5));
          }
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please choose as an answer a number from 1 to 7");
          input.next();
        }
      }
    } else if (number3 == 2) { 
      while (!valid4) {
                
        System.out.println("Please choose the option below.");
        System.out.println(); 
                    
        System.out.println("1. Other social contributions");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          inc.get(7).setAmount(new BigDecimal(number5));
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please put as an answer the number 1");
          input.next();
        }
      }
    } else if (number3 == 3) {
      while (!valid4) {

        System.out.println("Please choose one of the options below.");
        System.out.println();
                    
        System.out.println("1. Current domestic transfers");
        System.out.println("2. Current transfers from EU organizations and member states");
        System.out.println("3. Current transfers from foreign entities");
        System.out.println("4. Domestic investment grants");
        System.out.println("5. EU investment grants");
        System.out.println("6. Other capital transfers");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          if (number5 == 1) {
            inc.get(8).setAmount(new BigDecimal(number5));
          } else if (number5 == 2) {
            inc.get(9).setAmount(new BigDecimal(number5));
          } else if (number5 == 3) {
            inc.get(10).setAmount(new BigDecimal(number5));
          } else if (number5 == 4) {
            inc.get(11).setAmount(new BigDecimal(number5));
          } else if (number5 == 5) {
            inc.get(12).setAmount(new BigDecimal(number5));
          } else {
            inc.get(13).setAmount(new BigDecimal(number5));
          } 
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please choose as an answer a number from 1 to 6");
          input.next();
        }
      }
    } else if (number3 == 4) {
      while (!valid4) {
                
        System.out.println("Please choose one of the options below.");
        System.out.println();
                
        System.out.println("1. Sales of goods");
        System.out.println("2. Provision of services");
        System.out.println("3. Rents");
        System.out.println("4. Commissions");
        System.out.println("5. Administrative fees");
        System.out.println("6. Other sales");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          if (number5 == 1) {
            inc.get(14).setAmount(new BigDecimal(number5));
          } else if (number5 == 2) {
            inc.get(15).setAmount(new BigDecimal(number5));
          } else if (number5 == 3) {
            inc.get(16).setAmount(new BigDecimal(number5));
          } else if (number5 == 4) {
            inc.get(17).setAmount(new BigDecimal(number5));
          } else if (number5 == 5) {
            inc.get(18).setAmount(new BigDecimal(number5));
          } else {
            inc.get(19).setAmount(new BigDecimal(number5));
          }
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please choose as an answer a number from 1 to 6");
          input.next();
        }
      }   
    } else if (number3 == 5) {
      while (!valid4) {
        
        System.out.println("Please choose one of the options below.");
        System.out.println();
                
        System.out.println("1. Interest");
        System.out.println("2. Distributed corporate income");
        System.out.println("3. Rents of natural resources");
        System.out.println("4. Fines, penalties and assessments");
        System.out.println("5. Reimbursements of expenses");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          if (number5 == 1) {
            inc.get(20).setAmount(new BigDecimal(number5));
          } else if (number5 == 2) {
            inc.get(21).setAmount(new BigDecimal(number5));
          } else if (number5 == 3) {
            inc.get(22).setAmount(new BigDecimal(number5));
          } else if (number5 == 4) {
            inc.get(23).setAmount(new BigDecimal(number5));                                
          } else {
            inc.get(24).setAmount(new BigDecimal(number5));
          }
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please choose as an answer a number from 1 to 5");
          input.next();
        }
      }
    } else if (number3 == 6) {
      while (!valid4) {

        System.out.println("Please choose one of the options below.");
        System.out.println();
                    
        System.out.println("1. Buildings and related infrastructure");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          inc.get(25).setAmount(new BigDecimal(number5));
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please put as an answer the number 1");
          input.next();
        }
      }  
    } else if (number3 == 7) {
      while (!valid4) {
                
        System.out.println("Please choose one of the options below.");
        System.out.println();
        
        System.out.println("1. Long-term debt securities");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          inc.get(26).setAmount(new BigDecimal(number5));
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please put as an answer the number 1");
          input.next();
        }
      }   
    } else if (number3 == 8) {
      while (!valid4) {
                
        System.out.println("Please choose one of the options below.");
        System.out.println();
                
        System.out.println("1. Long-term loans");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          inc.get(27).setAmount(new BigDecimal(number5));
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please put as an answer the number 1");
          input.next();
        }
      }  
    } else if (number3 == 9) {
      while (!valid4) {

        System.out.println("Please choose one of the options below.");
        System.out.println();

        System.out.println("1. Listed shares");
        System.out.println("2. Unlisted shares");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          if (number5 == 1) {
            inc.get(28).setAmount(new BigDecimal(number5));
          } else {
            inc.get(29).setAmount(new BigDecimal(number5));
          }
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please choose as an answer 1 or 2");
          input.next();
        }
      }    
    } else if (number3 == 10) {
      while (!valid4) {
                
        System.out.println("Please choose one of the options below.");
        System.out.println();
            
        System.out.println("1. Currency liabilities in circulation");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          inc.get(30).setAmount(new BigDecimal(number5));
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please put as an answer the number 1");
          input.next();
        }
      }
    } else if (number3 == 11) {
      while (!valid4) {
                
        System.out.println("Please choose one of the options below.");
        System.out.println();
            
        System.out.println("1. Short-term debt securities");
        System.out.println("2. Long-term debt securities");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          if (number5 == 1) {
            inc.get(31).setAmount(new BigDecimal(number5));
          } else {
            inc.get(32).setAmount(new BigDecimal(number5));
          }
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please choose as an answer 1 or 2");
          input.next();
        }
      }
    } else if (number3 == 12) {
      while (!valid4) {

        System.out.println("Please choose one of the options below.");
        System.out.println();
                
        System.out.println("1. Short-term loans");
        System.out.println("2. Long-term loans");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          if (number5 == 1) {
            inc.get(33).setAmount(new BigDecimal(number5));
          } else {
            inc.get(34).setAmount(new BigDecimal(number5));
          }
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please choose as an answer 1 or 2");
          input.next();
        }
      }
    } else {
      while (!valid4) {
                
        System.out.println("Please choose one of the options below.");
        System.out.println();  
            
        System.out.println("1. Financial derivatives");
        try {
          number4 = input.nextInt();
          System.out.println("Please change the account with the number " + number4);
          number5 = input.nextInt();
          inc.get(35).setAmount(new BigDecimal(number5));
          System.out.println("You succesfully "
              + "changed the account with the amount " + number5 + " euro.");
          valid4 = true;
        } catch (InputMismatchException e) {
          System.out.println("Please put the number 1");
          input.next();
        }
      }
      input.close();
    }
  }
    
}
