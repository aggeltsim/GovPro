import java.util.Scanner;
    
/**
 * The {@code Prediction} class provides statistical tools for financial forecasting 
 * based on historical budget data (2021-2026).
 * 
 * <p>It implements <b>Simple Linear Regression</b> using the Ordinary Least Squares (OLS) 
 * method to estimate future trends and calculate the time required to reach specific 
 * financial targets.
 * </p>
 * 
 * <p><b>Key Features:</b></p>
 *  <ul>
 *   <li>Calculation of future budget values for a given year.</li>
 *   <li>Estimation of the timeline (Month/Year) to achieve a desired budget goal.</li>
 *   <li>Contains legacy console-based prediction methods for testing.</li>
 *  </ul>
 */
public class Prediction {

  /**
   * Entry point of the program.
   * 
   * <p>This method initializes an array of government expenditures for various entities 
   * from 2021 to 2026 and prompts the user for input to make predictions. 
   * It demonstrates the use of the {@link #predict(double[], double[], double)} method 
   * by asking the user for:
   * <ul>
   *     <li>a year to predict values for,</li>
   *     <li>a target value for the Republic Presidency to make a prediction.</li>
   * </ul>
   * The method reads user input using a {@link java.util.Scanner} and then calls 
   * the {@code predict} method with the provided inputs.
   *</p>
   *
   *  @param args command-line arguments (not used)
   * @see #predict(double[], double[], double)
   */
  public static void main(String[] args) {
    double[][] dapanes = { // this an array with values
      // of main entities from 2021 up until 2026 without inflation 
      {3766000, 4097337, 3811641, 4059900, 3974293, 4146883}, // republic presidency
      {143500000, 134251607, 134030043, 140477275, 147343837, 156551972}, // hellenic parliament 
      {34251000, 40536272, 36372937, 37886945, 35723136, 38447884}, // governance presidency
      {2986769000L, 2973891093L, 3172953535L, 3245029336L, 3282162880L, 3487669947L}, // interior
      {288237000, 246668455, 252308235, 357219091, 359936589, 404757288}, // exterior
      {5495900000L, 5937190083L, 5103551488L, 5362408267L, 5252784805L, 5916035799L}, // defence
      {4256596000L, 4276649036L, 4651583743L, 5278434922L, 6150311996L, 6568225405L}, // health
      {533261000, 531100091, 506425467, 547747086, 557774970, 569191096}, // justice
      {5605100000L, 5363728191L, 5436589608L, 5733987212L, 5660668349L, 5665485468L}, // education
      {359100000, 383427915, 409992485, 350395832, 493075321, 546993897}, // sport
      {747475497000L, 690153192000L, 669349030000L, 919467234000L,
        1068139883000L, 1438513680000L} // finance
    };
    double[] years = {2021, 2022, 2023, 2024, 2025, 2026};
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Give me the year you want a prediction for!");
    int a = sc.nextInt();
    predict(years, dapanes[0], a);
    System.out.println("Give me the value you want the republic presidency to have!");
    double b = sc.nextDouble();
    predict(years, dapanes[0], b);
  }

  /**
   * Performs a linear prediction using least squares regression.
   * 
   * <p>Calculates the linear equation y = a + b·x from the given data, prints the equation,
   * predicts y for a target year, and estimates the time period corresponding to a given y-value.
   *</p>
   *
   * @param x array of independent values (e.g., years)
   * @param y array of dependent values (e.g., expenditures)
   * @param targetYear year to predict the value for
   * @param desiredY target y-value to find the corresponding time period
   */
  public static void predict(double[] x, double[] y, int targetYear, double desiredY) {
    int n = x.length;

    // Finding a and b
    double sumX = 0;
    double sumY = 0;
    double sumXy = 0;
    double sumX2 = 0;
    for (int i = 0; i < n; i++) {
      sumX += x[i];
      sumY += y[i];
      sumXy += x[i] * y[i];
      sumX2 += x[i] * x[i];
    }

    double b = (n * sumXy - sumX * sumY) / (n * sumX2 - sumX * sumX);
    double a = (sumY - b * sumX) / n;

    System.out.printf("The equation used for the prediction is"
        + ": y = %.4f + %.4f·x\n", a, b);

    // Prediction for the year marked as targeted
    double predictedY = Math.floor(a + b * targetYear);
    System.out.println("Prediction for the year " + targetYear);
    System.out.printf("%,.0f euro%n", predictedY);
    // Find x for given y
    double estimatedX = (desiredY - a) / b;

    // Transform in year + month
    int yearPart = (int) estimatedX;
    double decimalPart = estimatedX - yearPart;
    int monthPart = (int) Math.round(decimalPart * 12);
    if (monthPart == 0) {
      monthPart = 1;
    }
    if (monthPart > 12) {
      monthPart = 12;
    }

    System.out.printf("For the given value"
        + ", the corresponding time period in (MM/YYYY form) is:" 
        + "  " + monthPart + "/" + yearPart);
  }
  
  /**
   * Estimates the independent variable corresponding to a given dependent value
   * using linear regression (least squares method) and prints it in month/year format.
   * Calculates the linear equation y = a + b·x from the provided data arrays,
   * prints the equation, and computes the x-value corresponding to {@code desiredY}.
   * 
   * @param x array of independent values (e.g., years)
   * @param y array of dependent values (e.g., expenditures)
   * @param desiredY the y-value for which the corresponding time period is estimated
   */
  public static void predict(double[] x, double[] y, double desiredY) {
    int n = x.length;

    // Find a and b through minimum squares formula
    double sumX = 0;
    double sumY = 0;
    double sumXy = 0;
    double sumX2 = 0;
    for (int i = 0; i < n; i++) {
      sumX += x[i];
      sumY += y[i];
      sumXy += x[i] * y[i];
      sumX2 += x[i] * x[i];
    }

    double b = (n * sumXy - sumX * sumY) / (n * sumX2 - sumX * sumX);
    double a = (sumY - b * sumX) / n;

    System.out.printf("The equation used is: y = %.4f + %.4f·x\n", a, b);

    // Find x for given y
    double estimatedX = (desiredY - a) / b;

    // Transform in year + month
    int yearPart = (int) estimatedX;
    double decimalPart = estimatedX - yearPart;
    int monthPart = (int) Math.round(decimalPart * 12);
    if (monthPart == 0) {
      monthPart = 1;
    }
    if (monthPart > 12) {
      monthPart = 12;
    }

    System.out.printf("For y = %.4f, the corresponding time period"
        + " (in MM/YYYY form) is: %d/%d\n", desiredY, monthPart, yearPart);
  }
  /**
   * Predicts the dependent value for a given target year using linear regression.
   * Calculates the linear equation y = a + b·x from the provided data arrays,
   * prints the equation, and predicts the y-value for the specified target year.
   *
   * @param x array of independent values (e.g., years)
   * @param y array of dependent values (e.g., expenditures)
   * @param targetYear the year for which the prediction is made
   */

  public static void predict(double[] x, double[] y, int targetYear) {
    int n = x.length;

    // Find a and b through minimum squares formula
    double sumX = 0;
    double sumY = 0;
    double sumXy = 0;
    double sumX2 = 0;
    for (int i = 0; i < n; i++) {
      sumX += x[i];
      sumY += y[i];
      sumXy += x[i] * y[i];
      sumX2 += x[i] * x[i];
    }

    double b = (n * sumXy - sumX * sumY) / (n * sumX2 - sumX * sumX);
    double a = (sumY - b * sumX) / n;

    System.out.printf("The used equation is: y = %.4f + %.4f·x\n", a, b);

    // Predict for the year marked as targeted
    double predictedY = Math.floor(a + b * targetYear);
        
    System.out.println("Prediction for the year: " + targetYear);
    System.out.printf("%,.0f euro%n", predictedY);
  }
    
  /**
   * Calculates the predicted financial value for a specific future year.
   *
   *  <p>This method uses the <b>Least Squares Linear Regression</b> algorithm 
   * ($y = a + bx$) to find the trend line of the provided historical data.
   * </p>
   * 
   * @param x          An array of historical years (independent variable).
   * @param y          An array of historical financial values (dependent variable).
   * @param targetYear The year for which the prediction is requested.
   * @return The predicted amount for the target year, rounded down to the nearest integer.
   */
  
  public static double getValueForGivenYear(double[] x, double[] y, int targetYear) {
    int n = x.length;

    // Find a and b through minimum squares formula
    double sumX = 0;
    double sumY = 0;
    double sumXy = 0;
    double sumX2 = 0;
    for (int i = 0; i < n; i++) {
      sumX += x[i];
      sumY += y[i];
      sumXy += x[i] * y[i];
      sumX2 += x[i] * x[i];
    }

    double b = (n * sumXy - sumX * sumY) / (n * sumX2 - sumX * sumX);
    double a = (sumY - b * sumX) / n;
    // Predict for the year marked as targeted
    double predictedY = Math.floor(a + b * targetYear);
    return predictedY;
  }
    
  /**
   * Estimates the exact time (Month and Year) when a specific financial target 
   * will be reached.
   *
   *  <p>The method normalizes the year data to increase calculation accuracy and 
   * then solves the linear regression equation for $x$ given a value $y$.
   * </p>
   * 
   * @param x        An array of historical years.
   * @param y        An array of historical financial values.
   * @param desiredY The target financial value (budget amount) to reach.
   * @return A string representation of the estimated date in <b>MM/YYYY</b> format.
   */
  public static String getYearandMonthforGivenValue(double[] x, double[] y, double desiredY) {
    int n = x.length;

    // normalize years to start from 0 (2021 -> 0, 2022 -> 1, ...)
    double[] relX = new double[n];
    double base = x[0];
    for (int i = 0; i < n; i++) {
      relX[i] = x[i] - base;
    }

    // least squares
    double sumX = 0;
    double sumY = 0;
    double sumXy = 0;
    double sumX2 = 0;
    for (int i = 0; i < n; i++) {
      sumX += relX[i];
      sumY += y[i];
      sumXy += relX[i] * y[i];
      sumX2 += relX[i] * relX[i];
    }

    double b = (n * sumXy - sumX * sumY) / (n * sumX2 - sumX * sumX);
    double a = (sumY - b * sumX) / n;

    // estimate relative year (starting from 0)
    double estimatedRelX = (desiredY - a) / b;

    // convert back to actual year
    double estimatedX = base + estimatedRelX;

    // transform decimal part into month
    int yearPart = (int) estimatedX;
    double decimalPart = estimatedX - yearPart;
    int monthPart = (int) Math.round(decimalPart * 12);
    if (monthPart == 0) {
      monthPart = 1;
    }
    if (monthPart > 12) {
      monthPart = 12;
    }

    return monthPart + "/" + yearPart;
  }
}
