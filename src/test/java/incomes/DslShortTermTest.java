package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class DslShortTermTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("1200.50");
        DslShortTerm dsl = new DslShortTerm("DS001", "Short-term Bond", amount, "Fixed");

        assertEquals("DS001", dsl.getCode());
        assertEquals("Short-term Bond", dsl.getName());
        assertEquals(amount, dsl.getAmount());
        assertEquals("Fixed", dsl.getForm());
    }

    @Test
    void testSetAmount() {
        DslShortTerm dsl = new DslShortTerm("DS002", "Treasury Bill ST", new BigDecimal("800"), "Variable");
        BigDecimal newAmount = new BigDecimal("950.75");
        dsl.setAmount(newAmount);
        assertEquals(newAmount, dsl.getAmount());
    }

    @Test
    void testToString() {
        DslShortTerm dsl = new DslShortTerm("DS003", "Municipal ST Bond", new BigDecimal("1500"), "Fixed");
        String expected = "Account: Municipal ST Bond\nAmount: 1500";
        assertEquals(expected, dsl.toString());
    }

    @Test
    void testToExplain() {
        DslShortTerm dsl = new DslShortTerm("DS004", "Government ST Bond", new BigDecimal("2000"), "Fixed");
        String explanation = dsl.toExplain();
        assertTrue(explanation.contains("Government ST Bond") || explanation.contains("government-issued financial instruments"));
    }
}

