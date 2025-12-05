package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class LShortTermTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("10000.00");
        LShortTerm loan = new LShortTerm("LS001", "Short-term Expense Loan", amount, "Current");

        assertEquals("LS001", loan.getCode());
        assertEquals("Short-term Expense Loan", loan.getName());
        assertEquals(amount, loan.getAmount());
        assertEquals("Current", loan.getForm());
    }

    @Test
    void testSetAmount() {
        LShortTerm loan = new LShortTerm("LS002", "Payroll Loan", new BigDecimal("5000"), "Variable");
        BigDecimal newAmount = new BigDecimal("7500.25");
        loan.setAmount(newAmount);
        assertEquals(newAmount, loan.getAmount());
    }

    @Test
    void testToString() {
        LShortTerm loan = new LShortTerm("LS003", "Urgent Expenses Loan", new BigDecimal("20000"), "Current");
        String expected = "Account: Urgent Expenses Loan\nAmount: 20000";
        assertEquals(expected, loan.toString());
    }

    @Test
    void testToExplain() {
        LShortTerm loan = new LShortTerm("LS004", "Salary Loan", new BigDecimal("15000"), "Current");
        String explanation = loan.toExplain();
        assertTrue(explanation.contains("Salary Loan") || explanation.contains("government uses these loans to pay"));
    }
}
