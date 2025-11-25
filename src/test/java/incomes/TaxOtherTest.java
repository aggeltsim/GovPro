package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TaxOtherTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("3000.00");
        TaxOther tax = new TaxOther("TO001", "Other Tax", amount, "Variable");

        assertEquals("TO001", tax.getCode());
        assertEquals("Other Tax", tax.getName());
        assertEquals(amount, tax.getAmount());
        assertEquals("Variable", tax.getForm());
    }

    @Test
    void testSetAmount() {
        TaxOther tax = new TaxOther("TO002", "Misc Tax", new BigDecimal("1500"), "Fixed");
        BigDecimal newAmount = new BigDecimal("1800.50");
        tax.setAmount(newAmount);
        assertEquals(newAmount, tax.getAmount());
    }

    @Test
    void testToString() {
        TaxOther tax = new TaxOther("TO003", "Special Tax", new BigDecimal("2500"), "Fixed");
        String expected = "Account: Special Tax\nAmount: 2500";
        assertEquals(expected, tax.toString());
    }

    @Test
    void testToExplain() {
        TaxOther tax = new TaxOther("TO004", "Extra Tax", new BigDecimal("3500"), "Variable");
        String explanation = tax.toExplain();
        assertTrue(explanation.contains("Extra Tax") || explanation.contains("form of Taxes"));
    }
}

