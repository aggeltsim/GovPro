package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SalCommissionsTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("600.00");
        SalCommissions sale = new SalCommissions("SAL001", "Service Commissions", amount, "Fixed");

        assertEquals("SAL001", sale.getCode());
        assertEquals("Service Commissions", sale.getName());
        assertEquals(amount, sale.getAmount());
        assertEquals("Fixed", sale.getForm());
    }

    @Test
    void testSetAmount() {
        SalCommissions sale = new SalCommissions("SAL002", "Transaction Fees", new BigDecimal("300"), "Variable");
        BigDecimal newAmount = new BigDecimal("450.75");
        sale.setAmount(newAmount);
        assertEquals(newAmount, sale.getAmount());
    }

    @Test
    void testToString() {
        SalCommissions sale = new SalCommissions("SAL003", "Commission Fees", new BigDecimal("1000"), "Fixed");
        String expected = "Account: Commission Fees\nAmount: 1000";
        assertEquals(expected, sale.toString());
    }

    @Test
    void testToExplain() {
        SalCommissions sale = new SalCommissions("SAL004", "Small Service Commissions", new BigDecimal("750"), "Fixed");
        String explanation = sale.toExplain();
        assertTrue(explanation.contains("Small Service Commissions") || explanation.contains("state collects from small fees"));
    }
}

