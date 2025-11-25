package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SalServicesTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("1800.00");
        SalServices sale = new SalServices("SALS001", "Consulting Services", amount, "Fixed");

        assertEquals("SALS001", sale.getCode());
        assertEquals("Consulting Services", sale.getName());
        assertEquals(amount, sale.getAmount());
        assertEquals("Fixed", sale.getForm());
    }

    @Test
    void testSetAmount() {
        SalServices sale = new SalServices("SALS002", "Maintenance Services", new BigDecimal("900"), "Variable");
        BigDecimal newAmount = new BigDecimal("1200.50");
        sale.setAmount(newAmount);
        assertEquals(newAmount, sale.getAmount());
    }

    @Test
    void testToString() {
        SalServices sale = new SalServices("SALS003", "IT Services", new BigDecimal("2500"), "Fixed");
        String expected = "Account : IT Services\nAmount : 2500";
        assertEquals(expected, sale.toString());
    }

    @Test
    void testToExplain() {
        SalServices sale = new SalServices("SALS004", "Business Services", new BigDecimal("1300"), "Fixed");
        String explanation = sale.toExplain();
        assertTrue(explanation.contains("Business Services") || explanation.contains("revenue the government earns from providing services"));
    }
}

