package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class LoansInc44Test {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("30000.00");
        LoansInc44 loan = new LoansInc44("L44-001", "Debt Refinancing Loan", amount, "Fixed");

        assertEquals("L44-001", loan.getCode());
        assertEquals("Debt Refinancing Loan", loan.getName());
        assertEquals(amount, loan.getAmount());
        assertEquals("Fixed", loan.getForm());
    }

    @Test
    void testSetAmount() {
        LoansInc44 loan = new LoansInc44("L44-002", "Short-term Debt Loan", new BigDecimal("15000"), "Variable");
        BigDecimal newAmount = new BigDecimal("20000.50");
        loan.setAmount(newAmount);
        assertEquals(newAmount, loan.getAmount());
    }

    @Test
    void testToString() {
        LoansInc44 loan = new LoansInc44("L44-003", "Government Debt Loan", new BigDecimal("50000"), "Fixed");
        String expected = "Account: Government Debt Loan\nAmount : 50000";
        assertEquals(expected, loan.toString());
    }

    @Test
    void testToExplain() {
        LoansInc44 loan = new LoansInc44("L44-004", "State Refinancing Loan", new BigDecimal("40000"), "Fixed");
        String explanation = loan.toExplain();
        assertTrue(explanation.contains("State Refinancing Loan") || explanation.contains("refinance or repay older debt"));
    }
}

