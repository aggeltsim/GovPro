package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TrEUTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("15000.00");
        TrEU tr = new TrEU("TEU001", "EU Support", amount, "Fixed");

        assertEquals("TEU001", tr.getCode());
        assertEquals("EU Support", tr.getName());
        assertEquals(amount, tr.getAmount());
        assertEquals("Fixed", tr.getForm());
    }

    @Test
    void testSetAmount() {
        TrEU tr = new TrEU("TEU002", "EU Grant", new BigDecimal("20000"), "Variable");
        BigDecimal newAmount = new BigDecimal("25000.75");
        tr.setAmount(newAmount);
        assertEquals(newAmount, tr.getAmount());
    }

    @Test
    void testToString() {
        TrEU tr = new TrEU("TEU003", "EU Project", new BigDecimal("30000"), "Fixed");
        String expected = "Account: EU Project\nAmount: 30000";
        assertEquals(expected, tr.toString());
    }

    @Test
    void testToExplain() {
        TrEU tr = new TrEU("TEU004", "EU Fund", new BigDecimal("35000"), "Variable");
        String explanation = tr.toExplain();
        assertTrue(explanation.contains("EU Fund") || explanation.contains("form of Transfers"));
    }
}

