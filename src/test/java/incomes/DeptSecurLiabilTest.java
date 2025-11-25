package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class DeptSecurLiabilTest {

    // Concrete subclass μόνο για testing
    static class ConcreteDeptSecurLiabil extends DeptSecurLiabil {

        public ConcreteDeptSecurLiabil(String code, String name, BigDecimal amount, String form) {
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

        // Getters και setters
        public String getCode() { return code; }
        public String getName() { return name; }
        public BigDecimal getAmount() { return amount; }
        public String getForm() { return form; }
        public void setAmount(BigDecimal amount) { this.amount = amount; }
    }

    @Test
    void testConstructorAndGetters() {
        ConcreteDeptSecurLiabil dsl = new ConcreteDeptSecurLiabil(
            "DL001",
            "Long-term Bond",
            new BigDecimal("1000.50"),
            "Fixed"
        );

        assertEquals("DL001", dsl.getCode());
        assertEquals("Long-term Bond", dsl.getName());
        assertEquals(new BigDecimal("1000.50"), dsl.getAmount());
        assertEquals("Fixed", dsl.getForm());
    }

    @Test
    void testSetAmount() {
        ConcreteDeptSecurLiabil dsl = new ConcreteDeptSecurLiabil(
            "DL002",
            "Treasury Bill LT",
            new BigDecimal("500"),
            "Variable"
        );

        BigDecimal newAmount = new BigDecimal("750.25");
        dsl.setAmount(newAmount);
        assertEquals(newAmount, dsl.getAmount());
    }

    @Test
    void testToStringAndToExplain() {
        ConcreteDeptSecurLiabil dsl = new ConcreteDeptSecurLiabil(
            "DL003",
            "Municipal LT Bond",
            new BigDecimal("1500"),
            "Fixed"
        );

        String expectedString = "Account: Municipal LT Bond\nAmount: 1500";
        assertEquals(expectedString, dsl.toString());

        String expectedExplain = "Dummy explanation for Municipal LT Bond";
        assertEquals(expectedExplain, dsl.toExplain());
    }
}

