package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TaxRegularRealEstateTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("10000.00");
        TaxRegularRealEstate tax = new TaxRegularRealEstate("TRRE001", "Property Tax", amount, "Fixed");

        assertEquals("TRRE001", tax.getCode());
        assertEquals("Property Tax", tax.getName());
        assertEquals(amount, tax.getAmount());
        assertEquals("Fixed", tax.getForm());
    }

    @Test
    void testSetAmount() {
        TaxRegularRealEstate tax = new TaxRegularRealEstate("TRRE002", "Land Tax", new BigDecimal("5000"), "Variable");
        BigDecimal newAmount = new BigDecimal("5500.50");
        tax.setAmount(newAmount);
        assertEquals(newAmount, tax.getAmount());
    }

    @Test
    void testToString() {
        TaxRegularRealEstate tax = new TaxRegularRealEstate("TRRE003", "Building Tax", new BigDecimal("7500"), "Fixed");
        String expected = "Account: Building Tax\nAmount: 7500";
        assertEquals(expected, tax.toString());
    }

    @Test
    void testToExplain() {
        TaxRegularRealEstate tax = new TaxRegularRealEstate("TRRE004", "Municipal Property Tax", new BigDecimal("8500"), "Fixed");
        String explanation = tax.toExplain();
        assertTrue(explanation.contains("Municipal Property Tax") || explanation.contains("form of Taxes"));
    }
}

