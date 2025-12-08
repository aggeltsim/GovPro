package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class TrDomesInvestGrantsTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("10000.00");
        TrDomesInvestGrants tr = new TrDomesInvestGrants("TDIG001", "Investment Grants", amount, "Fixed");

        assertEquals("TDIG001", tr.getCode());
        assertEquals("Investment Grants", tr.getName());
        assertEquals(amount, tr.getAmount());
        assertEquals("Fixed", tr.getForm());
    }

    @Test
    void testSetAmount() {
        TrDomesInvestGrants tr = new TrDomesInvestGrants("TDIG002", "Business Grants", new BigDecimal("5000"), "Variable");
        BigDecimal newAmount = new BigDecimal("5500.75");
        tr.setAmount(newAmount);
        assertEquals(newAmount, tr.getAmount());
    }

    @Test
    void testToString() {
        TrDomesInvestGrants tr = new TrDomesInvestGrants("TDIG003", "Project Grants", new BigDecimal("7500"), "Fixed");
        String expected = "Account: Project Grants\nAmount: 7500";
        assertEquals(expected, tr.toString());
    }

    @Test
    void testToExplain() {
        TrDomesInvestGrants tr = new TrDomesInvestGrants("TDIG004", "Development Grants", new BigDecimal("8500"), "Variable");
        String explanation = tr.toExplain();
        assertTrue(explanation.contains("Development Grants") || explanation.contains("form of Transfers"));
    }
}

