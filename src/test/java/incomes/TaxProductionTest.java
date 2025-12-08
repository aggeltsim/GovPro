package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TaxProductionTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("4000.00");
        TaxProduction tax = new TaxProduction("TP001", "Production Tax", amount, "Variable");

        assertEquals("TP001", tax.getCode());
        assertEquals("Production Tax", tax.getName());
        assertEquals(amount, tax.getAmount());
        assertEquals("Variable", tax.getForm());
    }

    @Test
    void testSetAmount() {
        TaxProduction tax = new TaxProduction("TP002", "Manufacturing Tax", new BigDecimal("2000"), "Fixed");
        BigDecimal newAmount = new BigDecimal("2500.75");
        tax.setAmount(newAmount);
        assertEquals(newAmount, tax.getAmount());
    }

    @Test
    void testToString() {
        TaxProduction tax = new TaxProduction("TP003", "Industry Tax", new BigDecimal("3000"), "Fixed");
        String expected = "Account: Industry Tax\nAmount: 3000";
        assertEquals(expected, tax.toString());
    }

    @Test
    void testToExplain() {
        TaxProduction tax = new TaxProduction("TP004", "Goods Production Tax", new BigDecimal("3500"), "Variable");
        String explanation = tax.toExplain();
        assertTrue(explanation.contains("Goods Production Tax") || explanation.contains("form of Taxes"));
    }
}

