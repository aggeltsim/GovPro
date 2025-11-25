package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TrCurrentDomesticTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("4000.00");
        TrCurrentDomestic tr = new TrCurrentDomestic("TCD001", "Domestic Transfer", amount, "Variable");

        assertEquals("TCD001", tr.getCode());
        assertEquals("Domestic Transfer", tr.getName());
        assertEquals(amount, tr.getAmount());
        assertEquals("Variable", tr.getForm());
    }

    @Test
    void testSetAmount() {
        TrCurrentDomestic tr = new TrCurrentDomestic("TCD002", "Local Transfer", new BigDecimal("2000"), "Fixed");
        BigDecimal newAmount = new BigDecimal("2500.50");
        tr.setAmount(newAmount);
        assertEquals(newAmount, tr.getAmount());
    }

    @Test
    void testToString() {
        TrCurrentDomestic tr = new TrCurrentDomestic("TCD003", "Regional Transfer", new BigDecimal("3000"), "Fixed");
        String expected = "Account: Regional Transfer\nAmount: 3000";
        assertEquals(expected, tr.toString());
    }

    @Test
    void testToExplain() {
        TrCurrentDomestic tr = new TrCurrentDomestic("TCD004", "State Transfer", new BigDecimal("3500"), "Variable");
        String explanation = tr.toExplain();
        assertTrue(explanation.contains("State Transfer") || explanation.contains("form of Transfers"));
    }
}

