package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TaxCapitalTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("8000.00");
        TaxCapital tax = new TaxCapital("TC001", "Capital Gains Tax", amount, "Fixed");

        assertEquals("TC001", tax.getCode());
        assertEquals("Capital Gains Tax", tax.getName());
        assertEquals(amount, tax.getAmount());
        assertEquals("Fixed", tax.getForm());
    }

    @Test
    void testSetAmount() {
        TaxCapital tax = new TaxCapital("TC002", "Wealth Tax", new BigDecimal("5000"), "Variable");
        BigDecimal newAmount = new BigDecimal("5500.75");
        tax.setAmount(newAmount);
        assertEquals(newAmount, tax.getAmount());
    }

    @Test
    void testToString() {
        TaxCapital tax = new TaxCapital("TC003", "Asset Tax", new BigDecimal("6000"), "Fixed");
        String expected = "Account: Asset Tax\nAmount: 6000";
        assertEquals(expected, tax.toString());
    }

    @Test
    void testToExplain() {
        TaxCapital tax = new TaxCapital("TC004", "Capital Tax", new BigDecimal("7000"), "Fixed");
        String explanation = tax.toExplain();
        assertTrue(explanation.contains("Capital Tax") || explanation.contains("form of Taxes"));
    }
}

