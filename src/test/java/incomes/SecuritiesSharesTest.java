package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SecuritiesSharesTest {

    // Concrete subclass μόνο για testing
    static class ConcreteShares extends SecuritiesShares {

        public ConcreteShares(String code, String name, BigDecimal amount, String form) {
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
        ConcreteShares shares = new ConcreteShares("SH001", "State Shares", new BigDecimal("2000.00"), "Common");

        assertEquals("SH001", shares.getCode());
        assertEquals("State Shares", shares.getName());
        assertEquals(new BigDecimal("2000.00"), shares.getAmount());
        assertEquals("Common", shares.getForm());
    }

    @Test
    void testSetters() {
        ConcreteShares shares = new ConcreteShares("SH002", "Shares 2", new BigDecimal("1000.00"), "Preferred");
        shares.setName("Updated Shares");
        shares.setAmount(new BigDecimal("1500.00"));

        assertEquals("Updated Shares", shares.getName());
        assertEquals(new BigDecimal("1500.00"), shares.getAmount());
    }

    @Test
    void testToStringAndToExplain() {
        ConcreteShares shares = new ConcreteShares("SH003", "Shares 3", new BigDecimal("3000.00"), "Common");

        String expectedString = "Account: Shares 3\nAmount: 3000.00";
        assertEquals(expectedString, shares.toString());

        String expectedExplain = "Dummy explanation for Shares 3";
        assertEquals(expectedExplain, shares.toExplain());
    }
}

