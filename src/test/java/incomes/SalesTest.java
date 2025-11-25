package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SalesTest {

    // Concrete subclass μόνο για testing
    static class ConcreteSales extends Sales {

        public ConcreteSales(String code, String name, BigDecimal amount, String form) {
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
        ConcreteSales sale = new ConcreteSales("SAL-001", "Test Sale", new BigDecimal("1000.00"), "Fixed");

        assertEquals("SAL-001", sale.getCode());
        assertEquals("Test Sale", sale.getName());
        assertEquals(new BigDecimal("1000.00"), sale.getAmount());
        assertEquals("Fixed", sale.getForm());
    }

    @Test
    void testSetters() {
        ConcreteSales sale = new ConcreteSales("SAL-002", "Sale 2", new BigDecimal("500.00"), "Variable");
        sale.setName("New Sale");
        sale.setAmount(new BigDecimal("750.00"));

        assertEquals("New Sale", sale.getName());
        assertEquals(new BigDecimal("750.00"), sale.getAmount());
    }

    @Test
    void testToStringAndToExplain() {
        ConcreteSales sale = new ConcreteSales("SAL-003", "Sale 3", new BigDecimal("2000.00"), "Fixed");

        String expectedString = "Account: Sale 3\nAmount: 2000.00";
        assertEquals(expectedString, sale.toString());

        String expectedExplain = "Dummy explanation for Sale 3";
        assertEquals(expectedExplain, sale.toExplain());
    }
}

