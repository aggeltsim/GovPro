package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TaxGoodsServicesTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("12000.00");
        TaxGoodsServices tax = new TaxGoodsServices("TGS001", "VAT", amount, "Percentage");

        assertEquals("TGS001", tax.getCode());
        assertEquals("VAT", tax.getName());
        assertEquals(amount, tax.getAmount());
        assertEquals("Percentage", tax.getForm());
    }

    @Test
    void testSetAmount() {
        TaxGoodsServices tax = new TaxGoodsServices("TGS002", "Sales Tax", new BigDecimal("5000"), "Fixed");
        BigDecimal newAmount = new BigDecimal("5500.50");
        tax.setAmount(newAmount);
        assertEquals(newAmount, tax.getAmount());
    }

    @Test
    void testToString() {
        TaxGoodsServices tax = new TaxGoodsServices("TGS003", "Service Tax", new BigDecimal("6000"), "Fixed");
        String expected = "Account: Service Tax\nAmount: 6000";
        assertEquals(expected, tax.toString());
    }

    @Test
    void testToExplain() {
        TaxGoodsServices tax = new TaxGoodsServices("TGS004", "VAT Tax", new BigDecimal("7000"), "Percentage");
        String explanation = tax.toExplain();
        assertTrue(explanation.contains("VAT Tax") || explanation.contains("form of Taxes"));
    }
}

