import java.math.BigDecimal;
import java.math.RoundingMode;

public class Budget2022 {
    public static BigDecimal[] staticsExp() {
        BigDecimal expenses2022[] = {new BigDecimal("13610168000"), new BigDecimal("220643000"), new BigDecimal("30583382000"), 
                                    new BigDecimal("1355222000"), new BigDecimal("80060000"), new BigDecimal("4600450000"), 
                                    new BigDecimal("101387000"), new BigDecimal("13921510000"), new BigDecimal("3455707000"), 
                                    new BigDecimal("56000"), new BigDecimal("3509500000"), new BigDecimal("1062480000"), 
                                    new BigDecimal("29153000000"), new BigDecimal("703687130000"), new BigDecimal("1400000000")};
        final BigDecimal totalExp = new BigDecimal("806740695000");
        BigDecimal[] statics2022 = new BigDecimal[15];
        for (int i = 0; i < expenses2022.length; i++) {
            statics2022[i] = BigDecimal.ZERO;
        }
        for (int i = 0; i < expenses2022.length; i++) {
            statics2022[i] = expenses2022[i].divide(totalExp, 8, RoundingMode.HALF_UP); 
        }
        return statics2022;
        
    }

        public static BigDecimal[] staticsInc() { 
             BigDecimal incomes2022[] = {new BigDecimal("45654498000"), new BigDecimal("55000000"), new BigDecimal("7376000000"), 
                                    new BigDecimal("2092000000"), new BigDecimal("1911000000"), new BigDecimal("13000000"), 
                                    new BigDecimal("31000000"), new BigDecimal("687000000"), new BigDecimal("6000000"), 
                                    new BigDecimal("36954000000"), new BigDecimal("701846000000"), new BigDecimal("0")};
            final BigDecimal totalInc = new BigDecimal("796625498000");
            BigDecimal[] statics2022 = new BigDecimal[12];
            for (int i = 0; i < incomes2022.length; i++) {
               statics2022[i] = BigDecimal.ZERO;
            }
            for (int i = 0; i < incomes2022.length; i++) {
                statics2022[i] = incomes2022[i].divide(totalInc, 8, RoundingMode.HALF_UP); 
            }
            return statics2022;
        }
}
        
        


