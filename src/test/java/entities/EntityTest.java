package entities;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EntityTest {

    // Dummy subclass για testing της abstract Entity
    static class DummyEntity extends Entity {
        public DummyEntity(String code, String name, BigDecimal amount, String form) {
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
        DummyEntity dummy = new DummyEntity(
            "001",
            "Test Entity",
            new BigDecimal("1234.56"),
            "FormX"
        );

        assertEquals("001", dummy.getCode());
        assertEquals("Test Entity", dummy.getName());
        assertEquals(new BigDecimal("1234.56"), dummy.getAmount());
        assertEquals("FormX", dummy.getForm());
    }

    @Test
    void testSetters() {
        DummyEntity dummy = new DummyEntity(
            "002",
            "Entity2",
            new BigDecimal("5000.00"),
            "FormY"
        );

        dummy.setName("New Entity");
        dummy.setAmount(new BigDecimal("7500.00"));

        assertEquals("New Entity", dummy.getName());
        assertEquals(new BigDecimal("7500.00"), dummy.getAmount());
    }

    @Test
    void testToStringAndToExplain() {
        DummyEntity dummy = new DummyEntity(
            "003",
            "Entity3",
            new BigDecimal("1000.00"),
            "FormZ"
        );

        String expectedString = "Account: Entity3\nAmount: 1000.00";
        assertEquals(expectedString, dummy.toString());

        String expectedExplain = "Dummy explanation for Entity3";
        assertEquals(expectedExplain, dummy.toExplain());
    }
}
