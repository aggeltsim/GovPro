package Percentage.percentage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Calculator {

    /**
     * Υπολογίζει το ποσοστό: (Άθροισμα Λίστας Α / Άθροισμα Λίστας Β) * 100
     */
    public BigDecimal calculatePercentage(List<BigDecimal> amountsA, List<BigDecimal> amountsB) {
        BigDecimal sumA = amountsA.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal sumB = amountsB.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

        if (sumB.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Το άθροισμα των ποσών βάσης (Β) είναι μηδέν.");
        }

        // Διαίρεση με ακρίβεια 6 δεκαδικών και μετά πολλαπλασιασμός επί 100
        return sumA.divide(sumB, 6, RoundingMode.HALF_UP)
                   .multiply(new BigDecimal("100"))
                   .stripTrailingZeros();
    }
}