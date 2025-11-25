package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class OtherCurIncomeTest {

    // Concrete subclass μόνο για testing
    static class ConcreteOtherCurIncome extends OtherCurIncome {

        public ConcreteOtherCurIncome(String code, String name, BigDecimal amount, String form) {
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
        ConcreteOtherCurIncome oci = new ConcreteOtherCurIncome("OCI-001", "Test Income", new BigDecimal("1000.00"), "Fixed");

        assertEquals("OCI-001", oci.getCode());
        assertEquals("Test Income", oci.getName());
        assertEquals(new BigDecimal("1000.00"), oci.getAmount());
        assertEquals("Fixed", oci.getForm());
    }

    @Test
    void testSetters() {
        ConcreteOtherCurIncome oci = new ConcreteOtherCurIncome("OCI-002", "Income 2", new BigDecimal("500.00"), "Variable");
        oci.setName("New Income");
        oci.setAmount(new BigDecimal("750.00"));

        assertEquals("New Income", oci.getName());
        assertEquals(new BigDecimal("750.00"), oci.getAmount());
    }

    @Test
    void testToStringAndToExplain() {
        ConcreteOtherCurIncome oci = new ConcreteOtherCurIncome("OCI-003", "Income 3", new BigDecimal("2000.00"), "Fixed");

        String expectedString = "Account: Income 3\nAmount: 2000.00";
        assertEquals(expectedString, oci.toString());

        String expectedExplain = "Dummy explanation for Income 3";
        assertEquals(expectedExplain, oci.toExplain());
    }
}

