package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SsUnlistedTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("7000.00");
        SsUnlisted ss = new SsUnlisted("SSU001", "State Private Shares", amount, "Private");

        assertEquals("SSU001", ss.getCode());
        assertEquals("State Private Shares", ss.getName());
        assertEquals(amount, ss.getAmount());
        assertEquals("Private", ss.getForm());
    }

    @Test
    void testSetAmount() {
        SsUnlisted ss = new SsUnlisted("SSU002", "Unlisted Shares", new BigDecimal("3500"), "Private");
        BigDecimal newAmount = new BigDecimal("4000.50");
        ss.setAmount(newAmount);
        assertEquals(newAmount, ss.getAmount());
    }

    @Test
    void testToString() {
        SsUnlisted ss = new SsUnlisted("SSU003", "Unlisted Equity", new BigDecimal("5000"), "Private");
        String expected = "Account : Unlisted Equity\nAmount : 5000";
        assertEquals(expected, ss.toString());
    }

    @Test
    void testToExplain() {
        SsUnlisted ss = new SsUnlisted("SSU004", "Private Shares", new BigDecimal("6000"), "Private");
        String explanation = ss.toExplain();
        assertTrue(explanation.contains("Private Shares") || explanation.contains("form of Securities Shares"));
    }
}

