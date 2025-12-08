package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class LiabilitiesCurrenDeposTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("2500.00");
        LiabilitiesCurrenDepos lcd = new LiabilitiesCurrenDepos("LCD001", "Currency Deposits", amount, "Current");

        assertEquals("LCD001", lcd.getCode());
        assertEquals("Currency Deposits", lcd.getName());
        assertEquals(amount, lcd.getAmount());
        assertEquals("Current", lcd.getForm());
    }

    @Test
    void testSetAmount() {
        LiabilitiesCurrenDepos lcd = new LiabilitiesCurrenDepos("LCD002", "Bank Deposits", new BigDecimal("1000"), "Current");
        BigDecimal newAmount = new BigDecimal("1500.50");
        lcd.setAmount(newAmount);
        assertEquals(newAmount, lcd.getAmount());
    }

    @Test
    void testToString() {
        LiabilitiesCurrenDepos lcd = new LiabilitiesCurrenDepos("LCD003", "Treasury Deposits", new BigDecimal("5000"), "Current");
        String expected = "Account: Treasury Deposits\nAmount: 5000";
        assertEquals(expected, lcd.toString());
    }

    @Test
    void testToExplain() {
        LiabilitiesCurrenDepos lcd = new LiabilitiesCurrenDepos("LCD004", "Government Deposits", new BigDecimal("3000"), "Current");
        String explanation = lcd.toExplain();
        assertTrue(explanation.contains("Government Deposits") || explanation.contains("obligations arising"));
    }
}

