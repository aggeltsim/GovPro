package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class DebtSecuritiesTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("1000.50");
        DeptSecurities ds = new DeptSecurities("DS001", "Government Bond", amount, "Fixed");

        assertEquals("DS001", ds.getCode());
        assertEquals("Government Bond", ds.getName());
        assertEquals(amount, ds.getAmount());
        assertEquals("Fixed", ds.getForm());
    }

    @Test
    void testSetAmount() {
        DeptSecurities ds = new DeptSecurities("DS002", "Treasury Bill", new BigDecimal("500"), "Variable");
        BigDecimal newAmount = new BigDecimal("750.25");
        ds.setAmount(newAmount);
        assertEquals(newAmount, ds.getAmount());
    }

    @Test
    void testToString() {
        DeptSecurities ds = new DeptSecurities("DS003", "Municipal Bond", new BigDecimal("1500"), "Fixed");
        String expected = "Account : Municipal Bond\nAmount : 1500";
        assertEquals(expected, ds.toString());
    }

    @Test
    void testToExplain() {
        DeptSecurities ds = new DeptSecurities("DS004", "Government Bond", new BigDecimal("2000"), "Fixed");
        String explanation = ds.toExplain();
        assertTrue(explanation.contains("Government Bond") || explanation.contains("government"));
        assertTrue(explanation.contains("debt securities"));
    }
}
