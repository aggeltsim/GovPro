import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/**
 * The {@code BudgetDataManager} class is responsible for managing
 * and providing access to government budget statistics.
 *
 * <p>It stores pre-calculated budget data for multiple years and
 * distinguishes between income and expense statistics.
 * </p>
 *
 * <p>Budget data is represented as percentages of total amounts
 * using {@link BigDecimal} for high-precision financial calculations.
 * </p>
 */
public class BudgetDataManager {

  /**
   * Defines the type of budget data requested.
   */
  public enum BudgetType { INCOME, EXPENSE }
    
  /**
   * Stores income statistics mapped by year.
   *
   * <p>Each entry contains an array of {@link BigDecimal} values
   * representing percentage contributions per income category.
   * </p>
   */
  private static final Map<Integer, BigDecimal[]> incomeMap = new HashMap<>();
    
  /**
   * Stores expense statistics mapped by year.
   *
   * <p>Each entry contains an array of {@link BigDecimal} values
   * representing percentage contributions per expense category.
   * </p>
   */
  private static final Map<Integer, BigDecimal[]> expenseMap = new HashMap<>();

  /*
   * Loads and initializes budget statistics for supported years.
   *
   * Data is retrieved from year-specific budget classes
   * such as Budget2022, Budget2023 and Budget2024.
   */
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

  /**
   * Computes normalized budget statistics.
   *
   * <p>Each value is divided by the total amount to produce
   * a percentage-based representation.
   * </p>
   *
   * @param values array of raw budget values
   * @param total  total amount used for normalization
   * @return an array of percentage values with scale 8
   */
  private static BigDecimal[] computeStatics(BigDecimal[] values, BigDecimal total) {
    BigDecimal[] stats = new BigDecimal[values.length];
    for (int i = 0; i < values.length; i++) {
      stats[i] = values[i].divide(total, 8, RoundingMode.HALF_UP); // υπολογισμός μόνο μια φορά
    }
    return stats;
  }

  /**
   * Returns budget statistics for a given year and budget type.
   *
   * @param year the requested budget year
   * @param type the type of budget data (income or expense)
   * @return an array of {@link BigDecimal} percentage values,
   *         or {@code null} if no data exists for the given year
   */
  public static BigDecimal[] getBudgetData(int year, BudgetType type) {
    if (type == BudgetType.INCOME) {
      return incomeMap.get(year);
    } else {
      return expenseMap.get(year);
    }
  }
}

