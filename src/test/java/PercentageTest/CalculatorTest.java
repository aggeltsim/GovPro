package PercentageTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import Percentage.percentage.Calculator;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

   private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Έλεγχος σωστού υπολογισμού ποσοστού")
    void testCalculatePercentageSuccess() {
        // Δεδομένα: A = [20, 30] (Σύνολο 50), B = [100, 100] (Σύνολο 200)
        // Αναμενόμενο: (50 / 200) * 100 = 25%
        List<BigDecimal> amountsA = Arrays.asList(new BigDecimal("20"), new BigDecimal("30"));
        List<BigDecimal> amountsB = Arrays.asList(new BigDecimal("100"), new BigDecimal("100"));

        BigDecimal result = calculator.calculatePercentage(amountsA, amountsB);

        // Χρησιμοποιούμε compareTo για BigDecimal γιατί το equals ελέγχει και τα δεκαδικά ψηφία (scale)
        assertEquals(0, new BigDecimal("25").compareTo(result), "Το ποσοστό θα έπρεπε να είναι 25");
    }

    @Test
    @DisplayName("Έλεγχος με δεκαδικά νούμερα")
    void testCalculatePercentageWithDecimals() {
        // A = [2.5], B = [10] -> (2.5 / 10) * 100 = 25%
        List<BigDecimal> amountsA = Collections.singletonList(new BigDecimal("2.5"));
        List<BigDecimal> amountsB = Collections.singletonList(new BigDecimal("10"));

        BigDecimal result = calculator.calculatePercentage(amountsA, amountsB);

        assertEquals(0, new BigDecimal("25").compareTo(result));
    }

    @Test
    @DisplayName("Έλεγχος εξαίρεσης όταν το άθροισμα του Β είναι μηδέν")
    void testCalculatePercentageDivisionByZero() {
        List<BigDecimal> amountsA = Collections.singletonList(new BigDecimal("10"));
        List<BigDecimal> amountsB = Arrays.asList(new BigDecimal("0"), new BigDecimal("0"));

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.calculatePercentage(amountsA, amountsB);
        });

        assertTrue(exception.getMessage().contains("μηδέν"));
    }
}
