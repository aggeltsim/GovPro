import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Entity;

public class AmendmentEntities {
  public static void handleAmountInput() {
    int number3 = 0;
    int number4 = 0;
    boolean valid3 = false;
    ArrayList<Entity> ent = ObjectsEntities.createObjectsEnt(); 
    Scanner input = new Scanner(System.in);
    while (!valid3) {

      System.out.println("Which entity would you be interested in modifying?");
      System.out.println();

      System.out.println("1. Presidency of the Republic");
      System.out.println("2. Hellenic Parliament");
      System.out.println("3. Presidency of the Government");
      System.out.println("4. Ministry of Interior");
      System.out.println("5. Ministry of Foreign Affairs");
      System.out.println("6. Ministry of National Defense");
      System.out.println("7. Ministry of Health");
      System.out.println("8. Ministry of Justice");
      System.out.println("9. Ministry of Education, Religious Affairs and Sports");
      System.out.println("10. Ministry of Culture");
      System.out.println("11. Ministry of National Economy and Finance");
      System.out.println("12. Ministry of Rural Development and Food");
      System.out.println("13. Ministry of Environment and Energy");
      System.out.println("14. Ministry of Labor and Social Security");
      System.out.println("15. Ministry of Social Cohesion and Family");
      System.out.println("16. Ministry of Development");
      System.out.println("17. Ministry of Infrastructure and Transport");
      System.out.println("18. Ministry of Shipping and Island Policy");
      System.out.println("19. Ministry of Tourism");
      System.out.println("20. Ministry of Digital Governance");
      System.out.println("21. Ministry of Immigration and Asylum");
      System.out.println("22. Ministry of Civil Protection");
      System.out.println("23. Ministry of Climate Crisis and Civil Protection");
      System.out.println("24. Decentralized Administration of Attica");
      System.out.println("25. Decentralized Administration of Thessaly - Central Greece");
      System.out.println("26. Decentralized Administration of Epirus - Western Macedonia");
      System.out.println("27. Decentralized Administration of "
          + "Peloponnese - Western Greece and Ionian");
      System.out.println("28. Decentralized administration of the Aegean");
      System.out.println("29. Decentralized administration of Crete");
      System.out.println("30. Decentralized administration of Macedonia - Thrace");
      try {
        number3 = input.nextInt();
        System.out.println("Please change the account with the number " + number3);
        number4 = input.nextInt();
        if (number4 == 1) {
          ent.get(0).setAmount(new BigDecimal(number4));
        } else if (number4 == 2) {
          ent.get(1).setAmount(new BigDecimal(number4));
        } else if (number4 == 3) {
          ent.get(2).setAmount(new BigDecimal(number4));
        } else if (number4 == 4) {
          ent.get(3).setAmount(new BigDecimal(number4));
        } else if (number4 == 5) {
          ent.get(4).setAmount(new BigDecimal(number4));
        } else if (number4 == 6) {
          ent.get(5).setAmount(new BigDecimal(number4));
        } else if (number4 == 7) {
          ent.get(6).setAmount(new BigDecimal(number4));
        } else if (number4 == 8) {
          ent.get(7).setAmount(new BigDecimal(number4));
        } else if (number4 == 9) {
          ent.get(8).setAmount(new BigDecimal(number4));
        } else if (number4 == 10) {
          ent.get(9).setAmount(new BigDecimal(number4));
        } else if (number4 == 11) {
          ent.get(10).setAmount(new BigDecimal(number4));
        } else if (number4 == 12) {
          ent.get(11).setAmount(new BigDecimal(number4));
        } else if (number4 == 13) {
          ent.get(12).setAmount(new BigDecimal(number4));
        } else if (number4 == 14) {
          ent.get(13).setAmount(new BigDecimal(number4));
        } else if (number4 == 15) {
          ent.get(14).setAmount(new BigDecimal(number4));
        } else if (number4 == 16) {
          ent.get(15).setAmount(new BigDecimal(number4));
        } else if (number4 == 17) {
          ent.get(16).setAmount(new BigDecimal(number4));
        } else if (number4 == 18) {
          ent.get(17).setAmount(new BigDecimal(number4));
        } else if (number4 == 19) {
          ent.get(18).setAmount(new BigDecimal(number4));
        } else if (number4 == 20) {
          ent.get(19).setAmount(new BigDecimal(number4));
        } else if (number4 == 21) {
          ent.get(20).setAmount(new BigDecimal(number4));
        } else if (number4 == 22) {
          ent.get(21).setAmount(new BigDecimal(number4));
        } else if (number4 == 23) {
          ent.get(22).setAmount(new BigDecimal(number4));
        } else if (number4 == 24) {
          ent.get(23).setAmount(new BigDecimal(number4));
        } else if (number4 == 25) {
          ent.get(24).setAmount(new BigDecimal(number4));
        } else if (number4 == 26) {
          ent.get(25).setAmount(new BigDecimal(number4));
        } else if (number4 == 27) {
          ent.get(26).setAmount(new BigDecimal(number4));
        } else if (number4 == 28) {
          ent.get(27).setAmount(new BigDecimal(number4));
        } else if (number4 == 29) {
          ent.get(28).setAmount(new BigDecimal(number4));
        } else {
          ent.get(29).setAmount(new BigDecimal(number4));
        }
        System.out.println("You succesfully "
            + "changed the account with the amount " + number4 + " euro.");
        valid3 = true;
      } catch (InputMismatchException e) {
        System.out.println("Please choose as an answer a number from 1 to 30");
        input.next();
      }
    }
    input.close();
  }
    
}
