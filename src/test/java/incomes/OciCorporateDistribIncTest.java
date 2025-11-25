package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class OciCorporateDistribIncTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("1200.50");
        OciCorporateDistribInc oci = new OciCorporateDistribInc("OCI001", "Corporate Dividend", amount, "Fixed");

        assertEquals("OCI001", oci.getCode());
        assertEquals("Corporate Dividend", oci.getName());
        assertEquals(amount, oci.getAmount());
        assertEquals("Fixed", oci.getForm());
    }

    @Test
    void testSetAmount() {
        OciCorporateDistribInc oci = new OciCorporateDistribInc("OCI002", "Company Dividend", new BigDecimal("500"), "Variable");
        BigDecimal newAmount = new BigDecimal("750.25");
        oci.setAmount(newAmount);
        assertEquals(newAmount, oci.getAmount());
    }

    @Test
    void testToString() {
        OciCorporateDistribInc oci = new OciCorporateDistribInc("OCI003", "State Shares Dividend", new BigDecimal("1500"), "Fixed");
        String expected = "Account : State Shares Dividend\nAmount : 1500";
        assertEquals(expected, oci.toString());
    }

    @Test
    void testToExplain() {
        OciCorporateDistribInc oci = new OciCorporateDistribInc("OCI004", "Government Dividend", new BigDecimal("2000"), "Fixed");
        String explanation = oci.toExplain();
        assertTrue(explanation.contains("Government Dividend") || explanation.contains("state receives"));
    }
}

