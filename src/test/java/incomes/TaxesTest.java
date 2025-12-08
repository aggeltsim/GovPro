package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TaxesTest {

    // Dummy subclass για testing
    static class DummyTax extends Taxes {
        public DummyTax(String code, String name, BigDecimal amount, String form) {
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
        public void setAmount(BigDecimal amount) { this.amount = amount; }
        public void setName(String name) { this.name = name; }
    }

    @Test
    void testConstructorAndGetters() {
        DummyTax tax = new DummyTax("D001", "Dummy Tax", new BigDecimal("1000.00"), "FormX");

        assertEquals("D001", tax.getCode());
        assertEquals("Dummy Tax", tax.getName());
        assertEquals(new BigDecimal("1000.00"), tax.getAmount());
        assertEquals("FormX", tax.getForm());
    }

    @Test
    void testSetters() {
        DummyTax tax = new DummyTax("D002", "Dummy2", new BigDecimal("2000"), "FormY");

        tax.setName("Updated Tax");
        tax.setAmount(new BigDecimal("2500"));

        assertEquals("Updated Tax", tax.getName());
        assertEquals(new BigDecimal("2500"), tax.getAmount());
    }

    @Test
    void testToStringAndToExplain() {
        DummyTax tax = new DummyTax("D003", "Dummy3", new BigDecimal("3000"), "FormZ");

        String expectedString = "Account: Dummy3\nAmount: 3000";
        assertEquals(expectedString, tax.toString());

        String expectedExplain = "Dummy explanation for Dummy3";
        assertEquals(expectedExplain, tax.toExplain());
    }
}

