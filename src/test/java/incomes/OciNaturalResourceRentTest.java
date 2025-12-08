package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class OciNaturalResourceRentTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("5000.00");
        OciNaturalResourceRent oci = new OciNaturalResourceRent("OCI-NR001", "Forest Land Rent", amount, "Fixed");

        assertEquals("OCI-NR001", oci.getCode());
        assertEquals("Forest Land Rent", oci.getName());
        assertEquals(amount, oci.getAmount());
        assertEquals("Fixed", oci.getForm());
    }

    @Test
    void testSetAmount() {
        OciNaturalResourceRent oci = new OciNaturalResourceRent("OCI-NR002", "Mineral Rights Rent", new BigDecimal("2000"), "Variable");
        BigDecimal newAmount = new BigDecimal("3500.50");
        oci.setAmount(newAmount);
        assertEquals(newAmount, oci.getAmount());
    }

    @Test
    void testToString() {
        OciNaturalResourceRent oci = new OciNaturalResourceRent("OCI-NR003", "Oil Extraction Rent", new BigDecimal("10000"), "Fixed");
        String expected = "Account: Oil Extraction Rent\nAmount: 10000";
        assertEquals(expected, oci.toString());
    }

    @Test
    void testToExplain() {
        OciNaturalResourceRent oci = new OciNaturalResourceRent("OCI-NR004", "Natural Gas Rent", new BigDecimal("7500"), "Fixed");
        String explanation = oci.toExplain();
        assertTrue(explanation.contains("Natural Gas Rent") || explanation.contains("payments for the use of natural resources"));
    }
}

