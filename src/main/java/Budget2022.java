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
        }
}
