package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TrEUInvestGrantsTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("50000.00");
        TrEUInvestGrants tr = new TrEUInvestGrants("TEUIG001", "EU Investment Grants", amount, "Fixed");

        assertEquals("TEUIG001", tr.getCode());
        assertEquals("EU Investment Grants", tr.getName());
        assertEquals(amount, tr.getAmount());
        assertEquals("Fixed", tr.getForm());
    }

    @Test
    void testSetAmount() {
        TrEUInvestGrants tr = new TrEUInvestGrants("TEUIG002", "EU Project Grants", new BigDecimal("60000"), "Variable");
        BigDecimal newAmount = new BigDecimal("65000.75");
        tr.setAmount(newAmount);
        assertEquals(newAmount, tr.getAmount());
    }

    @Test
    void testToString() {
        TrEUInvestGrants tr = new TrEUInvestGrants("TEUIG003", "EU Infrastructure Grants", new BigDecimal("70000"), "Fixed");
        String expected = "Account: EU Infrastructure Grants\nAmount: 70000";
        assertEquals(expected, tr.toString());
    }

    @Test
    void testToExplain() {
        TrEUInvestGrants tr = new TrEUInvestGrants("TEUIG004", "EU Business Grants", new BigDecimal("80000"), "Variable");
        String explanation = tr.toExplain();
        assertTrue(explanation.contains("EU Business Grants") || explanation.contains("form of Transfers"));
    }
}

