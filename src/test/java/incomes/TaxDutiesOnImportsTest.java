package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TaxDutiesOnImportsTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("9000.00");
        TaxDutiesOnImports tax = new TaxDutiesOnImports("TDI001", "Import Duties", amount, "Fixed");

        assertEquals("TDI001", tax.getCode());
        assertEquals("Import Duties", tax.getName());
        assertEquals(amount, tax.getAmount());
        assertEquals("Fixed", tax.getForm());
    }

    @Test
    void testSetAmount() {
        TaxDutiesOnImports tax = new TaxDutiesOnImports("TDI002", "Custom Duties", new BigDecimal("4000"), "Variable");
        BigDecimal newAmount = new BigDecimal("4500.75");
        tax.setAmount(newAmount);
        assertEquals(newAmount, tax.getAmount());
    }

    @Test
    void testToString() {
        TaxDutiesOnImports tax = new TaxDutiesOnImports("TDI003", "Import Tax", new BigDecimal("6000"), "Fixed");
        String expected = "Account: Import Tax\nAmount: 6000";
        assertEquals(expected, tax.toString());
    }

    @Test
    void testToExplain() {
        TaxDutiesOnImports tax = new TaxDutiesOnImports("TDI004", "Duties on Imports", new BigDecimal("7000"), "Fixed");
        String explanation = tax.toExplain();
        assertTrue(explanation.contains("Duties on Imports") || explanation.contains("form of Taxes"));
    }
}

