package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class OciReimbursementsTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("1500.00");
        OciReimbursements oci = new OciReimbursements("OCI-R001", "Project Reimbursement", amount, "Fixed");

        assertEquals("OCI-R001", oci.getCode());
        assertEquals("Project Reimbursement", oci.getName());
        assertEquals(amount, oci.getAmount());
        assertEquals("Fixed", oci.getForm());
    }

    @Test
    void testSetAmount() {
        OciReimbursements oci = new OciReimbursements("OCI-R002", "Expense Reimbursement", new BigDecimal("500"), "Variable");
        BigDecimal newAmount = new BigDecimal("750.75");
        oci.setAmount(newAmount);
        assertEquals(newAmount, oci.getAmount());
    }

    @Test
    void testToString() {
        OciReimbursements oci = new OciReimbursements("OCI-R003", "Government Refund", new BigDecimal("2000"), "Fixed");
        String expected = "Account: Government Refund\nAmount : 2000";
        assertEquals(expected, oci.toString());
    }

    @Test
    void testToExplain() {
        OciReimbursements oci = new OciReimbursements("OCI-R004", "Repaid Project", new BigDecimal("1800"), "Fixed");
        String explanation = oci.toExplain();
        assertTrue(explanation.contains("Repaid Project") || explanation.contains("government receives back"));
    }
}

