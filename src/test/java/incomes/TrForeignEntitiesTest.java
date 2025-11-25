package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TrForeignEntitiesTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("100000.00");
        TrForeignEntities tr = new TrForeignEntities("TFE001", "Foreign Aid", amount, "Fixed");

        assertEquals("TFE001", tr.getCode());
        assertEquals("Foreign Aid", tr.getName());
        assertEquals(amount, tr.getAmount());
        assertEquals("Fixed", tr.getForm());
    }

    @Test
    void testSetAmount() {
        TrForeignEntities tr = new TrForeignEntities("TFE002", "International Grant", new BigDecimal("50000"), "Variable");
        BigDecimal newAmount = new BigDecimal("75000.25");
        tr.setAmount(newAmount);
        assertEquals(newAmount, tr.getAmount());
    }

    @Test
    void testToString() {
        TrForeignEntities tr = new TrForeignEntities("TFE003", "Global Support", new BigDecimal("120000"), "Fixed");
        String expected = "Account: Global Support\nAmount: 120000";
        assertEquals(expected, tr.toString());
    }

    @Test
    void testToExplain() {
        TrForeignEntities tr = new TrForeignEntities("TFE004", "World Bank Loan", new BigDecimal("90000"), "Variable");
        String explanation = tr.toExplain();
        assertTrue(explanation.contains("World Bank Loan") || explanation.contains("form of Transfers"));
    }
}

