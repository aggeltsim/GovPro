import java.math.BigDecimal;

public class Budget2024 {
    public static BigDecimal[] staticsExp() {
       BigDecimal expenses2024[] = {new BigDecimal("14849625000"), new BigDecimal("410540000"), new BigDecimal("33228722000"), 
                                    new BigDecimal("1792020000"), new BigDecimal("80600000"), new BigDecimal("7701105000"), 
                                    new BigDecimal("111364000"), new BigDecimal("14835189000"), new BigDecimal("2727126000"), 
                                    new BigDecimal("81000"), new BigDecimal("2031000000"), new BigDecimal("1557768000"), 
                                    new BigDecimal("26610000000"), new BigDecimal("1002253130000")};
            final BigDecimal totalExp = new BigDecimal("1108188270000");
            BigDecimal[] statics2024 = new BigDecimal[14];
            for (int i = 0; i < expenses2024.length; i++) {
               statics2024[i] = BigDecimal.ZERO;
            }
            for (int i = 0; i < expenses2024.length; i++) {
                statics2024[i] = expenses2024[i].divide(totalExp); 
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
                statics2024[i] = expenses2024[i].divide(totalExp); 
            }
            return statics2024;
        
        }
}

