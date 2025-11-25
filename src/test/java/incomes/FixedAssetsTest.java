package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class FixedAssetsTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("50000.00");
        FixedAssets fa = new FixedAssets("FA001", "Government Building", amount, "Property");

        assertEquals("FA001", fa.getCode());
        assertEquals("Government Building", fa.getName());
        assertEquals(amount, fa.getAmount());
        assertEquals("Property", fa.getForm());
    }

    @Test
    void testSetAmount() {
        FixedAssets fa = new FixedAssets("FA002", "State Land", new BigDecimal("30000"), "Property");
        BigDecimal newAmount = new BigDecimal("35000.50");
        fa.setAmount(newAmount);
        assertEquals(newAmount, fa.getAmount());
    }

    @Test
    void testToString() {
        FixedAssets fa = new FixedAssets("FA003", "Office Building", new BigDecimal("100000"), "Property");
        String expected = "Account : Office Building\nAmount : 100000";
        assertEquals(expected, fa.toString());
    }

    @Test
    void testToExplain() {
        FixedAssets fa = new FixedAssets("FA004", "School Building", new BigDecimal("75000"), "Property");
        String explanation = fa.toExplain();
        assertTrue(explanation.contains("School Building") || explanation.contains("government receives"));
    }
}

