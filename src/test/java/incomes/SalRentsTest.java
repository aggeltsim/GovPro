package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SalRentsTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("1500.00");
        SalRents rent = new SalRents("SALR001", "Public Building Rent", amount, "Fixed");

        assertEquals("SALR001", rent.getCode());
        assertEquals("Public Building Rent", rent.getName());
        assertEquals(amount, rent.getAmount());
        assertEquals("Fixed", rent.getForm());
    }

    @Test
    void testSetAmount() {
        SalRents rent = new SalRents("SALR002", "Equipment Rent", new BigDecimal("800"), "Variable");
        BigDecimal newAmount = new BigDecimal("950.50");
        rent.setAmount(newAmount);
        assertEquals(newAmount, rent.getAmount());
    }

    @Test
    void testToString() {
        SalRents rent = new SalRents("SALR003", "Space Rent", new BigDecimal("1200"), "Fixed");
        String expected = "Account: Space Rent\nAmount : 1200";
        assertEquals(expected, rent.toString());
    }

    @Test
    void testToExplain() {
        SalRents rent = new SalRents("SALR004", "Public Equipment Rent", new BigDecimal("500"), "Fixed");
        String explanation = rent.toExplain();
        assertTrue(explanation.contains("Public Equipment Rent") || explanation.contains("money the state earns by renting"));
    }
}

