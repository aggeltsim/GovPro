import java.math.BigDecimal;

public class Budget2023 {
    
    public static BigDecimal[] staticsExp() {
       BigDecimal expenses2023[] = {new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), 
                                    new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), 
                                    new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), 
                                    new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), 
                                    new BigDecimal("0"), new BigDecimal("0")};
            final BigDecimal totalExp = new BigDecimal("0");
            BigDecimal[] statics2023 = new BigDecimal[14];
            for (int i = 0; i < expenses2023.length; i++) {
               statics2023[i] = BigDecimal.ZERO;
            }
            for (int i = 0; i < expenses2023.length; i++) {
                statics2023[i] = expenses2023[i].divide(totalExp); 
            }
            return statics2023;
        
        }

        public static BigDecimal[] staticsInc() { 
            //Anastasia
        }
}
