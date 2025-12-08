import java.math.BigDecimal;

public class Budget2022 {
    public static BigDecimal[] staticsExp() {
       BigDecimal expenses2022[] = {new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), 
                                    new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), 
                                    new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), 
                                    new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), 
                                    new BigDecimal("0"), new BigDecimal("0")};
            final BigDecimal totalExp = new BigDecimal("0");
            BigDecimal[] statics2022 = new BigDecimal[14];
            for (int i = 0; i < expenses2022.length; i++) {
               statics2022[i] = BigDecimal.ZERO;
            }
            for (int i = 0; i < expenses2022.length; i++) {
                statics2022[i] = expenses2022[i].divide(totalExp); 
            }
            return statics2022;
        
        }

        public static BigDecimal[] staticsInc() { 
            //Anastasia
             BigDecimal incomes2022[] = {new BigDecimal("45654498000"), new BigDecimal("55000000"), new BigDecimal("7376000000"), 
                                    new BigDecimal("2092000000"), new BigDecimal("1911000000"), new BigDecimal("13000000"), 
                                    new BigDecimal("31000000"), new BigDecimal("687000000"), new BigDecimal("6000000"), 
                                    new BigDecimal("36954000000"), new BigDecimal("701846000000")};
            final BigDecimal totalInc = new BigDecimal("796625498000");
            BigDecimal[] statics2022 = new BigDecimal[11];
            for (int i = 0; i < incomes2022.length; i++) {
               statics2022[i] = BigDecimal.ZERO;
            }
            for (int i = 0; i < incomes2022.length; i++) {
                statics2022[i] = incomes2022[i].divide(totalInc); 
            }
            return statics2022;
        }
}
        
        


