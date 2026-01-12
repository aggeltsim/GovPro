import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Provides high-precision statistical analysis of the 2024 Greek State Budget.
 * This class calculates the percentage distribution of fixed historical expenses 
 * and incomes, representing each category as a ratio (0.0 to 1.0) relative to 
 * the annual totals (1.108T for expenses and 1.107T for incomes). 
 * All calculations use {@link BigDecimal} with 8-decimal precision and 
 * {@link RoundingMode#HALF_UP} for financial accuracy.
 */
public class Budget2024 {
    public static BigDecimal[] staticsExp() {
       BigDecimal expenses2024[] = {new BigDecimal("14849625000"), new BigDecimal("410540000"), new BigDecimal("33228722000"), 
                                    new BigDecimal("1792020000"), new BigDecimal("80600000"), new BigDecimal("7701105000"), 
                                    new BigDecimal("111364000"), new BigDecimal("14835189000"), new BigDecimal("2727126000"), 
                                    new BigDecimal("81000"), new BigDecimal("2031000000"), new BigDecimal("1557768000"), 
                                    new BigDecimal("26610000000"), new BigDecimal("1002253130000"), new BigDecimal("0")};
            final BigDecimal totalExp = new BigDecimal("1108188270000");
            BigDecimal[] statics2024 = new BigDecimal[15];
            for (int i = 0; i < expenses2024.length; i++) {
               statics2024[i] = BigDecimal.ZERO;
            }
            for (int i = 0; i < expenses2024.length; i++) {
                statics2024[i] = expenses2024[i].divide(totalExp, 8, RoundingMode.HALF_UP); 
            }
            return statics2024;
        
        }
        public static BigDecimal[] staticsInc() {
            BigDecimal expenses2024[] = {new BigDecimal("56597000000"), new BigDecimal("56000000"), new BigDecimal("7960000000"), 
                                    new BigDecimal("5547000000"), new BigDecimal("2555000000"), new BigDecimal("23000000"), 
                                    new BigDecimal("11000000"), new BigDecimal("1095000000"), new BigDecimal("55000000"), 
                                    new BigDecimal("28205000000"), new BigDecimal("1004195000000"), new BigDecimal("1350000000")};
            final BigDecimal totalExp = new BigDecimal("1107649000000");
            BigDecimal[] statics2024 = new BigDecimal[12];
            for (int i = 0; i < expenses2024.length; i++) {
               statics2024[i] = BigDecimal.ZERO;
            }
            for (int i = 0; i < expenses2024.length; i++) {
                statics2024[i] = expenses2024[i].divide(totalExp, 8, RoundingMode.HALF_UP); 
            }
            return statics2024;
        
        }
}

