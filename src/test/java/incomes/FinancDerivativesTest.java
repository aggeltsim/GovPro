package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class FinancDerivativesTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("5000.75");
        FinancDerivatives fd = new FinancDerivatives("FD001", "Derivative Contract", amount, "Option");

        assertEquals("FD001", fd.getCode());
        assertEquals("Derivative Contract", fd.getName());
        assertEquals(amount, fd.getAmount());
        assertEquals("Option", fd.getForm());
    }

    @Test
    void testSetAmount() {
        FinancDerivatives fd = new FinancDerivatives("FD002", "Swap Contract", new BigDecimal("3000"), "Swap");
        BigDecimal newAmount = new BigDecimal("4500.25");
        fd.setAmount(newAmount);
        assertEquals(newAmount, fd.getAmount());
    }

    @Test
    void testToString() {
        FinancDerivatives fd = new FinancDerivatives("FD003", "Futures Contract", new BigDecimal("7000"), "Futures");
        String expected = "Account: Futures Contract\nAmount: 7000";
        assertEquals(expected, fd.toString());
    }

    @Test
    void testToExplain() {
        FinancDerivatives fd = new FinancDerivatives("FD004", "Option Contract", new BigDecimal("10000"), "Option");
        String explanation = fd.toExplain();
        assertTrue(explanation.contains("Option Contract") || explanation.contains("contracts whose value depends"));
    }
}

