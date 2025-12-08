package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TransfersTest {

    // Dummy subclass για testing
    static class DummyTransfers extends Transfers {
        public DummyTransfers(String code, String name, BigDecimal amount, String form) {
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
    }

    @Test
    void testConstructorAndGetters() {
        DummyTransfers t = new DummyTransfers("TR001", "Transfer A", new BigDecimal("5000"), "FormX");
        assertEquals("TR001", t.getCode());
        assertEquals("Transfer A", t.getName());
        assertEquals(new BigDecimal("5000"), t.getAmount());
        assertEquals("FormX", t.getForm());
    }

    @Test
    void testSetAmount() {
        DummyTransfers t = new DummyTransfers("TR002", "Transfer B", new BigDecimal("1000"), "FormY");
        t.setAmount(new BigDecimal("1500"));
        assertEquals(new BigDecimal("1500"), t.getAmount());
    }

    @Test
    void testToStringAndToExplain() {
        DummyTransfers t = new DummyTransfers("TR003", "Transfer C", new BigDecimal("2000"), "FormZ");
        String expectedString = "Account: Transfer C\nAmount: 2000";
        assertEquals(expectedString, t.toString());
        assertEquals("Dummy explanation for Transfer C", t.toExplain());
    }
}

