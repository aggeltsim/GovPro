package expenses;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ExpensesTest {

    // Dummy subclass για testing
    static class DummyExpenses extends Expenses {
        public DummyExpenses(String code, String name, BigDecimal amount, String form) {
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

        public String getCode() { return code; }
        public String getName() { return name; }
        public BigDecimal getAmount() { return amount; }
        public String getForm() { return form; }
        public void setName(String name) { this.name = name; }
        public void setAmount(BigDecimal amount) { this.amount = amount; }
    }

    @Test
    void testConstructorAndGetters() {
        DummyExpenses dummy = new DummyExpenses(
            "001",
            "Test Expense",
            new BigDecimal("1234.56"),
            "FormX"
        );

        assertEquals("001", dummy.getCode());
        assertEquals("Test Expense", dummy.getName());
        assertEquals(new BigDecimal("1234.56"), dummy.getAmount());
        assertEquals("FormX", dummy.getForm());
    }

    @Test
    void testSetters() {
        DummyExpenses dummy = new DummyExpenses(
            "002",
            "Expense2",
            new BigDecimal("5000.00"),
            "FormY"
        );

        dummy.setName("New Expense");
        dummy.setAmount(new BigDecimal("7500.00"));

        assertEquals("New Expense", dummy.getName());
        assertEquals(new BigDecimal("7500.00"), dummy.getAmount());
    }

    @Test
    void testToStringAndToExplain() {
        DummyExpenses dummy = new DummyExpenses(
            "003",
            "Expense3",
            new BigDecimal("1000.00"),
            "FormZ"
        );

        String expectedString = "Account: Expense3\nAmount: 1000.00";
        assertEquals(expectedString, dummy.toString());

        String expectedExplain = "Dummy explanation for Expense3";
        assertEquals(expectedExplain, dummy.toExplain());
    }
}
