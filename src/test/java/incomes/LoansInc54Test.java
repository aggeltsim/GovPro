package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class LoansInc54Test {

    // Concrete subclass μόνο για testing
    static class ConcreteLoansInc54 extends LoansInc54 {

        public ConcreteLoansInc54(String code, String name, BigDecimal amount, String form) {
            super(code, name, amount, form);
        }

        @Override
        public String toExplain() {
            return "Dummy explanation for " + getName();
        }

        @Override
        public String toString() {
            return "Account: " + getName() + "\nAmount: " + getAmount();
        }

        // Getters & setters για testing
        public String getCode() { return code; }
        public String getName() { return name; }
        public BigDecimal getAmount() { return amount; }
        public String getForm() { return form; }
        public void setAmount(BigDecimal amount) { this.amount = amount; }
        public void setName(String name) { this.name = name; }
    }

    @Test
    void testConstructorAndGetters() {
        ConcreteLoansInc54 loan = new ConcreteLoansInc54("L54-001", "Test Loan", new BigDecimal("10000.00"), "Fixed");

        assertEquals("L54-001", loan.getCode());
        assertEquals("Test Loan", loan.getName());
        assertEquals(new BigDecimal("10000.00"), loan.getAmount());
        assertEquals("Fixed", loan.getForm());
    }

    @Test
    void testSetAmount() {
        ConcreteLoansInc54 loan = new ConcreteLoansInc54("L54-002", "Loan 2", new BigDecimal("5000.00"), "Variable");
        BigDecimal newAmount = new BigDecimal("7500.50");
        loan.setAmount(newAmount);
        assertEquals(newAmount, loan.getAmount());
    }

    @Test
    void testToStringAndToExplain() {
        ConcreteLoansInc54 loan = new ConcreteLoansInc54("L54-003", "Loan 3", new BigDecimal("2000.00"), "Fixed");

        String expectedString = "Account: Loan 3\nAmount: 2000.00";
        assertEquals(expectedString, loan.toString());

        String expectedExplain = "Dummy explanation for Loan 3";
        assertEquals(expectedExplain, loan.toExplain());
    }
}

