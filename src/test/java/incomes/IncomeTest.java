package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class IncomeTest {

    // Concrete subclass μόνο για testing
    static class ConcreteIncome extends Income {

        public ConcreteIncome(String code, String name, BigDecimal amount, String form) {
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
        ConcreteIncome ci = new ConcreteIncome("IN001", "Income Test", new BigDecimal("2000.50"), "FormA");

        assertEquals("IN001", ci.getCode());
        assertEquals("Income Test", ci.getName());
        assertEquals(new BigDecimal("2000.50"), ci.getAmount());
        assertEquals("FormA", ci.getForm());
    }

    @Test
    void testSetters() {
        ConcreteIncome ci = new ConcreteIncome("IN002", "Income2", new BigDecimal("5000"), "FormB");
        ci.setAmount(new BigDecimal("7500.25"));
        ci.setName("New Income2");

        assertEquals(new BigDecimal("7500.25"), ci.getAmount());
        assertEquals("New Income2", ci.getName());
    }

    @Test
    void testToStringAndToExplain() {
        ConcreteIncome ci = new ConcreteIncome("IN003", "Income3", new BigDecimal("1000"), "FormC");

        String expectedString = "Account: Income3\nAmount: 1000";
        assertEquals(expectedString, ci.toString());

        String expectedExplain = "Dummy explanation for Income3";
        assertEquals(expectedExplain, ci.toExplain());
    }
}

