package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SalAdministFeesTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("800.00");
        SalAdministFees sale = new SalAdministFees("SAL001", "Administrative Fees", amount, "Fixed");

        assertEquals("SAL001", sale.getCode());
        assertEquals("Administrative Fees", sale.getName());
        assertEquals(amount, sale.getAmount());
        assertEquals("Fixed", sale.getForm());
    }

    @Test
    void testSetAmount() {
        SalAdministFees sale = new SalAdministFees("SAL002", "Document Fees", new BigDecimal("500"), "Variable");
        BigDecimal newAmount = new BigDecimal("750.50");
        sale.setAmount(newAmount);
        assertEquals(newAmount, sale.getAmount());
    }

    @Test
    void testToString() {
        SalAdministFees sale = new SalAdministFees("SAL003", "Permit Fees", new BigDecimal("1200"), "Fixed");
        String expected = "Account: Permit Fees\nAmount : 1200";
        assertEquals(expected, sale.toString());
    }

    @Test
    void testToExplain() {
        SalAdministFees sale = new SalAdministFees("SAL004", "Licensing Fees", new BigDecimal("1500"), "Fixed");
        String explanation = sale.toExplain();
        assertTrue(explanation.contains("Licensing Fees") || explanation.contains("state receives for issuing documents"));
    }
}

