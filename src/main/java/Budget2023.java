import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Provides high-precision statistical analysis of the 2023 Greek State Budget.
 * This class calculates the percentage distribution of fixed historical expenses 
 * and incomes, representing each category as a ratio (0.0 to 1.0) relative to 
 * the annual totals (806.88B for expenses and 798.04B for incomes). 
 * All calculations use {@link BigDecimal} with 8-decimal precision and 
 * {@link RoundingMode#HALF_UP} for financial accuracy.
 */
public class Budget2023 {
    
    public static BigDecimal[] staticsExp() {
       BigDecimal expenses2023[] = {new BigDecimal("13795795000"), new BigDecimal("397439000"), new BigDecimal("32475557000"), 
                                    new BigDecimal("1540686000"), new BigDecimal("80300000"), new BigDecimal("5851155000"), 
                                    new BigDecimal("81257000"), new BigDecimal("15117638000"), new BigDecimal("2530934000"), 
                                    new BigDecimal("62000"), new BigDecimal("3394000000"), new BigDecimal("1058240000"), 
                                    new BigDecimal("27924000000"), new BigDecimal("702631130000"), new BigDecimal("0")};
            final BigDecimal totalExp = new BigDecimal("806878193000");
            BigDecimal[] statics2023 = new BigDecimal[15];
            for (int i = 0; i < expenses2023.length; i++) {
               statics2023[i] = BigDecimal.ZERO;
            }
            for (int i = 0; i < expenses2023.length; i++) {
                statics2023[i] = expenses2023[i].divide(totalExp, 8, RoundingMode.HALF_UP); 
            }
            return statics2023;
        }

        public static BigDecimal[] staticsInc() { 
            BigDecimal incomes2023[] = {new BigDecimal("51579000000"), new BigDecimal("55000000"), new BigDecimal("7953000000"), 
                                    new BigDecimal("2405000000"), new BigDecimal("1869000000"), new BigDecimal("24000000"), 
                                    new BigDecimal("23000000"), new BigDecimal("387000000"), new BigDecimal("44000000"), 
                                    new BigDecimal("31554000000"), new BigDecimal("701846000000"), new BigDecimal("300000000")};
            final BigDecimal totalInc = new BigDecimal("798039000000");
            BigDecimal[] statics2023 = new BigDecimal[12];
            for (int i = 0; i < incomes2023.length; i++) {
               statics2023[i] = BigDecimal.ZERO;
            }
            for (int i = 0; i < incomes2023.length; i++) {
                statics2023[i] = incomes2023[i].divide(totalInc, 8, RoundingMode.HALF_UP); 
            }
            return statics2023;
        
        }
        
}
