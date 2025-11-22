import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        boolean valid1 = false;
        boolean valid2 = false;
        boolean valid3 = false;
        boolean valid4 = false;

        
        Scanner input = new Scanner(System.in);

        while (!valid1) {
            System.out.println("What do you want GovPro to do?"); //Επιλογές: Ανάγνωση, Τροποποίηση
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
            //αν επιλέξω τροποποίηση:
            if(number1 == 2) {
                while (!valid2) {
                    System.out.println("Which category would you be interested in modifying? Please choose one of the options below."); //κατηγορίες: 1. Έσοδα, 2. Έξοδα, 3. Φορείς
                    System.out.println();

                    System.out.println("1. Income");
                    System.out.println("2. Expences");
                    System.out.println("3. Entities");

                    try{
                        number2 = input.nextInt();
                        valid2 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Please choose as an answer 1, 2 or 3");
                        input.next();
                    }
                }
                

               //αν επιλέξω έσοδα
               if(number2 == 1) {
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
                        System.out.println("8. Loans");
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
                    if(number3 == 1){
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
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose as an answer a number from 1 to 7");
                                input.next();
                            }
                        }

                    } else if(number3 == 2) { 
                        while (!valid4) {
                
                            System.out.println("Please choose the option below.");
                            System.out.println(); 
                    
                            System.out.println("1. Other social contributions");
                            try {
                                number4 = input.nextInt();
                                System.out.println("Please change the account with the number " + number4);
                                valid4 = true;
                            } catch(InputMismatchException e) {
                                System.out.println("Please put as an answer the number 1");
                                input.next();
                            }
                        }
            
            
                    } else if(number3 == 3) {
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
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose as an answer a number from 1 to 6");
                                input.next();
                            }
                        }

                    } else if(number3 == 4) {
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
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose as an answer a number from 1 to 6");
                                input.next();
                            }
                        }

                    } else if(number3 == 5) {
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
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose as an answer a number from 1 to 5");
                                input.next();
                            }
                        }
                    } else if(number3 == 6) {
                        while (!valid4) {

                            System.out.println("Please choose one of the options below.");
                            System.out.println();
                    
                            System.out.println("1. Buildings and related infrastructure");
                            try {
                                number4 = input.nextInt();
                                System.out.println("Please change the account with the number " + number4);
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please put as an answer the number 1");
                                input.next();
                            }
                        }
                    } else if(number3 == 7) {
                        while (!valid4) {
                
                            System.out.println("Please choose one of the options below.");
                            System.out.println();
        
                            System.out.println("1. Long-term debt securities");
                            try {
                                number4 = input.nextInt();
                                System.out.println("Please change the account with the number " + number4);
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please put as an answer the number 1");
                                input.next();
                            }
                        }
                    } else if(number3 == 8) {
                        while (!valid4) {
                
                            System.out.println("Please choose one of the options below.");
                            System.out.println();
                
                            System.out.println("1. Long-term loans");
                            try {
                                number4 = input.nextInt();
                                System.out.println("Please change the account with the number " + number4);
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please put as an answer the number 1");
                                input.next();
                            }
                        }
                    } else if(number3 == 9) {
                        while (!valid4) {

                            System.out.println("Please choose one of the options below.");
                            System.out.println();

                            System.out.println("1. Listed shares");
                            System.out.println("2. Unlisted shares");
                            try {
                                number4 = input.nextInt();
                                System.out.println("Please change the account with the number " + number4);
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose as an answer 1 or 2");
                                input.next();
                            }
                        }
                    } else if(number3 == 10) {
                        while (!valid4) {
                
                            System.out.println("Please choose one of the options below.");
                            System.out.println();
            
                            System.out.println("1. Currency liabilities in circulation");
                            try {
                                number4 = input.nextInt();
                                System.out.println("Please change the account with the number " + number4);
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please put as an answer the number 1");
                                input.next();
                            }
                        }
                    } else if(number3 == 11) {
                        while (!valid4) {
                
                            System.out.println("Please choose one of the options below.");
                            System.out.println();
            
                            System.out.println("1. Short-term debt securities");
                            System.out.println("2. Long-term debt securities");
                            try {
                                number4 = input.nextInt();
                                System.out.println("Please change the account with the number " + number4);
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please choose as an answer 1 or 2");
                                input.next();
                            }
                        }
                    } else if(number3 == 12) {
                        while (!valid4) {

                            System.out.println("Please choose one of the options below.");
                            System.out.println();
                
                            System.out.println("1. Short-term loans");
                            System.out.println("2. Long-term loans");
                            try {
                                number4 = input.nextInt();
                                System.out.println("Please change the account with the number " + number4);
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
                                valid4 = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Please put the number 1");
                                input.next();
                            }
                        }
                    }
                //αν επιλέξω έξοδα
               } else if(number2 == 2) {
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
                            valid3 = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Please choose as an answer a number from 1 to 13");
                            input.next();
                        }
                    }
                //αν επιλέξω φορείς
               } else {
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
                        System.out.println("27. Decentralized Administration of Peloponnese - Western Greece and Ionian");
                        System.out.println("28. Decentralized administration of the Aegean");
                        System.out.println("29. Decentralized administration of Crete");
                        System.out.println("30. Decentralized administration of Macedonia - Thrace");
                        try {
                            number3 = input.nextInt();
                            System.out.println("Please change the account with the number " + number3);
                            valid3 = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Please choose as an answer a number from 1 to 30");
                            input.next();
                        }
                    }
               }
            }
            if(valid1 == true) {
                System.out.println("You succesfully changed the account you wanted!");
            }
            input.close();

        }
    }

