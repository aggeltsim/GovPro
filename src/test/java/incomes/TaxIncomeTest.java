package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TaxIncomeTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("15000.00");
        TaxIncome tax = new TaxIncome("TI001", "Income Tax", amount, "Percentage");

        assertEquals("TI001", tax.getCode());
        assertEquals("Income Tax", tax.getName());
        assertEquals(amount, tax.getAmount());
        assertEquals("Percentage", tax.getForm());
    }

    @Test
    void testSetAmount() {
        TaxIncome tax = new TaxIncome("TI002", "Personal Income Tax", new BigDecimal("8000"), "Fixed");
        BigDecimal newAmount = new BigDecimal("8500.75");
        tax.setAmount(newAmount);
        assertEquals(newAmount, tax.getAmount());
    }

    @Test
    void testToString() {
        TaxIncome tax = new TaxIncome("TI003", "Business Tax", new BigDecimal("9000"), "Fixed");
        String expected = "Account: Business Tax\nAmount: 9000";
        assertEquals(expected, tax.toString());
    }

    @Test
    void testToExplain() {
        TaxIncome tax = new TaxIncome("TI004", "Corporate Income Tax", new BigDecimal("10000"), "Percentage");
        String explanation = tax.toExplain();
        assertTrue(explanation.contains("Corporate Income Tax") || explanation.contains("form of Taxes"));
    }
}

