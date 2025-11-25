package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class LLongTermL2Test {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("50000.00");
        LLongTermL2 loan = new LLongTermL2("LT001", "Long-term Infrastructure Loan", amount, "Fixed");

        assertEquals("LT001", loan.getCode());
        assertEquals("Long-term Infrastructure Loan", loan.getName());
        assertEquals(amount, loan.getAmount());
        assertEquals("Fixed", loan.getForm());
    }

    @Test
    void testSetAmount() {
        LLongTermL2 loan = new LLongTermL2("LT002", "Hospital Loan", new BigDecimal("20000"), "Variable");
        BigDecimal newAmount = new BigDecimal("25000.75");
        loan.setAmount(newAmount);
        assertEquals(newAmount, loan.getAmount());
    }

    @Test
    void testToString() {
        LLongTermL2 loan = new LLongTermL2("LT003", "School Loan", new BigDecimal("100000"), "Fixed");
        String expected = "Account : School Loan\nAmount : 100000";
        assertEquals(expected, loan.toString());
    }

    @Test
    void testToExplain() {
        LLongTermL2 loan = new LLongTermL2("LT004", "Road Construction Loan", new BigDecimal("75000"), "Fixed");
        String explanation = loan.toExplain();
        assertTrue(explanation.contains("Road Construction Loan") || explanation.contains("loans are usually used to finance"));
    }
}

