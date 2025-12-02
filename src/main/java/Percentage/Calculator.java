package Percentage;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Calculator: Handles the core business logic (percentage calculation).
 * Separated for cleaner code structure.
 */
public class Calculator {

    /**
     * Calculates the percentage (A / B) * 100 with 4 decimal places.
     * * @param amountA The numerator (Amount A).
     * @param amountB The denominator (Amount B).
     * @return The calculated percentage as a BigDecimal.
     * @throws ArithmeticException if Amount B is zero.
     */
    public BigDecimal calculatePercentage(BigDecimal amountA, BigDecimal amountB) {
        // Check for division by zero before calculation
        if (amountB.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Division by zero error: The denominator amount is zero.");
        }
        
        // Calculate Percentage: (A / B) * 100
        // Using BigDecimal for precision and HALF_UP rounding.
        return amountA.multiply(BigDecimal.valueOf(100))
                      .divide(amountB, 4, RoundingMode.HALF_UP);
    }
}