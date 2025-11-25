package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class OciInterestTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("1200.00");
        OciInterest oci = new OciInterest("OCI-I001", "Government Loan Interest", amount, "Fixed");

        assertEquals("OCI-I001", oci.getCode());
        assertEquals("Government Loan Interest", oci.getName());
        assertEquals(amount, oci.getAmount());
        assertEquals("Fixed", oci.getForm());
    }

    @Test
    void testSetAmount() {
        OciInterest oci = new OciInterest("OCI-I002", "Bank Deposit Interest", new BigDecimal("500"), "Variable");
        BigDecimal newAmount = new BigDecimal("750.50");
        oci.setAmount(newAmount);
        assertEquals(newAmount, oci.getAmount());
    }

    @Test
    void testToString() {
        OciInterest oci = new OciInterest("OCI-I003", "State Loan Interest", new BigDecimal("2000"), "Fixed");
        String expected = "Account : State Loan Interest\nAmount : 2000";
        assertEquals(expected, oci.toString());
    }

    @Test
    void testToExplain() {
        OciInterest oci = new OciInterest("OCI-I004", "Government Deposit Interest", new BigDecimal("1500"), "Fixed");
        String explanation = oci.toExplain();
        assertTrue(explanation.contains("Government Deposit Interest") || explanation.contains("state earns"));
    }
}

