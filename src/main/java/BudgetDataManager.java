import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class BudgetDataManager {

    public enum BudgetType { INCOME, EXPENSE }

    private static final Map<Integer, BigDecimal[]> incomeMap = new HashMap<>();
    private static final Map<Integer, BigDecimal[]> expenseMap = new HashMap<>();

    static {
        // Load year 2022
        incomeMap.put(2022, Budget2022.staticsInc());
        expenseMap.put(2022, Budget2022.staticsExp());

        // Load year 2023
        incomeMap.put(2023, Budget2023.staticsInc());
        expenseMap.put(2023, Budget2023.staticsExp());

        // Load year 2024
        incomeMap.put(2024, Budget2024.staticsInc());
        expenseMap.put(2024, Budget2024.staticsExp());
    }

    private static BigDecimal[] computeStatics(BigDecimal[] values, BigDecimal total) {
        BigDecimal[] stats = new BigDecimal[values.length];
        for (int i = 0; i < values.length; i++) {
            stats[i] = values[i].divide(total, 8, RoundingMode.HALF_UP); // υπολογισμός μόνο μια φορά
        }
        return stats;
    }

    public static BigDecimal[] getBudgetData(int year, BudgetType type) {
        if (type == BudgetType.INCOME) {
            return incomeMap.get(year);
        } else {
            return expenseMap.get(year);
        }
    }
}

