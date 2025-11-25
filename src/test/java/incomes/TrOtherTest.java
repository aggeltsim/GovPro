package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TrOtherTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("20000.00");
        TrOther tr = new TrOther("TO001", "Miscellaneous", amount, "Fixed");

        assertEquals("TO001", tr.getCode());
        assertEquals("Miscellaneous", tr.getName());
        assertEquals(amount, tr.getAmount());
        assertEquals("Fixed", tr.getForm());
    }

    @Test
    void testSetAmount() {
        TrOther tr = new TrOther("TO002", "Donations", new BigDecimal("15000"), "Variable");
        BigDecimal newAmount = new BigDecimal("17500.50");
        tr.setAmount(newAmount);
        assertEquals(newAmount, tr.getAmount());
    }

    @Test
    void testToString() {
        TrOther tr = new TrOther("TO003", "Other Fees", new BigDecimal("10000"), "Fixed");
        String expected = "Account: Other Fees\nAmount: 10000";
        assertEquals(expected, tr.toString());
    }

    @Test
    void testToExplain() {
        TrOther tr = new TrOther("TO004", "Misc Fees", new BigDecimal("5000"), "Variable");
        String explanation = tr.toExplain();
        assertTrue(explanation.contains("Misc Fees") || explanation.contains("form of Transfers"));
    }
}
