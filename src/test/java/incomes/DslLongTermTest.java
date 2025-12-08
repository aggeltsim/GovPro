package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class DslLongTermTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("2000.50");
        DslLongTerm dsl = new DslLongTerm("DL001", "Long-term Bond", amount, "Fixed");

        assertEquals("DL001", dsl.getCode());
        assertEquals("Long-term Bond", dsl.getName());
        assertEquals(amount, dsl.getAmount());
        assertEquals("Fixed", dsl.getForm());
    }

    @Test
    void testSetAmount() {
        DslLongTerm dsl = new DslLongTerm("DL002", "Treasury Bill LT", new BigDecimal("1000"), "Variable");
        BigDecimal newAmount = new BigDecimal("1500.75");
        dsl.setAmount(newAmount);
        assertEquals(newAmount, dsl.getAmount());
    }

    @Test
    void testToString() {
        DslLongTerm dsl = new DslLongTerm("DL003", "Municipal LT Bond", new BigDecimal("3000"), "Fixed");
        String expected = "Account: Municipal LT Bond\nAmount: 3000";
        assertEquals(expected, dsl.toString());
    }

    @Test
    void testToExplain() {
        DslLongTerm dsl = new DslLongTerm("DL004", "Government LT Bond", new BigDecimal("4000"), "Fixed");
        String explanation = dsl.toExplain();
        assertTrue(explanation.contains("Government LT Bond") || explanation.contains("Long-term debt securities"));
    }
}
