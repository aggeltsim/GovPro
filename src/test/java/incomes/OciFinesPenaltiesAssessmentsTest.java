package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class OciFinesPenaltiesAssessmentsTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("1000.50");
        OciFinesPenaltiesAssessments oci = new OciFinesPenaltiesAssessments(
            "OCI-FP001", "Traffic Fines", amount, "Fixed"
        );

        assertEquals("OCI-FP001", oci.getCode());
        assertEquals("Traffic Fines", oci.getName());
        assertEquals(amount, oci.getAmount());
        assertEquals("Fixed", oci.getForm());
    }

    @Test
    void testSetAmount() {
        OciFinesPenaltiesAssessments oci = new OciFinesPenaltiesAssessments(
            "OCI-FP002", "Environmental Fines", new BigDecimal("500"), "Variable"
        );
        BigDecimal newAmount = new BigDecimal("750.75");
        oci.setAmount(newAmount);
        assertEquals(newAmount, oci.getAmount());
    }

    @Test
    void testToString() {
        OciFinesPenaltiesAssessments oci = new OciFinesPenaltiesAssessments(
            "OCI-FP003", "Tax Penalties", new BigDecimal("2000"), "Fixed"
        );
        String expected = "Account: Tax Penalties\nAmount : 2000";
        assertEquals(expected, oci.toString());
    }

    @Test
    void testToExplain() {
        OciFinesPenaltiesAssessments oci = new OciFinesPenaltiesAssessments(
            "OCI-FP004", "License Penalties", new BigDecimal("1500"), "Fixed"
        );
        String explanation = oci.toExplain();
        assertTrue(explanation.contains("License Penalties") || explanation.contains("government earns from penalties"));
    }
}

