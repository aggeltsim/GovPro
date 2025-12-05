package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SalOtherTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("400.00");
        SalOther sale = new SalOther("SALO001", "Miscellaneous Sales", amount, "Fixed");

        assertEquals("SALO001", sale.getCode());
        assertEquals("Miscellaneous Sales", sale.getName());
        assertEquals(amount, sale.getAmount());
        assertEquals("Fixed", sale.getForm());
    }

    @Test
    void testSetAmount() {
        SalOther sale = new SalOther("SALO002", "Other Fees", new BigDecimal("250"), "Variable");
        BigDecimal newAmount = new BigDecimal("375.50");
        sale.setAmount(newAmount);
        assertEquals(newAmount, sale.getAmount());
    }

    @Test
    void testToString() {
        SalOther sale = new SalOther("SALO003", "Small Sales", new BigDecimal("600"), "Fixed");
        String expected = "Account: Small Sales\nAmount: 600";
        assertEquals(expected, sale.toString());
    }

    @Test
    void testToExplain() {
        SalOther sale = new SalOther("SALO004", "Minor Sales", new BigDecimal("500"), "Fixed");
        String explanation = sale.toExplain();
        assertTrue(explanation.contains("Minor Sales") || explanation.contains("revenue from various other small sales activities"));
    }
}

