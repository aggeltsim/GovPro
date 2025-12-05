package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SsListedTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("5000.00");
        SsListed ss = new SsListed("SS001", "Government Shares", amount, "Common");

        assertEquals("SS001", ss.getCode());
        assertEquals("Government Shares", ss.getName());
        assertEquals(amount, ss.getAmount());
        assertEquals("Common", ss.getForm());
    }

    @Test
    void testSetAmount() {
        SsListed ss = new SsListed("SS002", "State Shares", new BigDecimal("3000"), "Preferred");
        BigDecimal newAmount = new BigDecimal("3500.50");
        ss.setAmount(newAmount);
        assertEquals(newAmount, ss.getAmount());
    }

    @Test
    void testToString() {
        SsListed ss = new SsListed("SS003", "Listed Shares", new BigDecimal("4000"), "Common");
        String expected = "Account: Listed Shares\nAmount : 4000";
        assertEquals(expected, ss.toString());
    }

    @Test
    void testToExplain() {
        SsListed ss = new SsListed("SS004", "Equity Shares", new BigDecimal("4500"), "Preferred");
        String explanation = ss.toExplain();
        assertTrue(explanation.contains("Equity Shares") || explanation.contains("form of Securities Shares"));
    }
}

