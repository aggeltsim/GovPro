package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeBenefitsTest {

    private EmployeeBenefits instance;
    private final String initialCode = "21";
    private final String initialName = "Employee Benefits";
    private final BigDecimal initialAmount = new BigDecimal("14889199000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new EmployeeBenefits(initialCode, initialName, initialAmount, initialForm);
    }

    @Test
    void testConstructorAndGetters() {
        assertNotNull(instance);
        assertEquals(initialCode, instance.getCode());
        assertEquals(initialName, instance.getName());
        assertEquals(initialAmount, instance.getAmount());
        assertEquals(initialForm, instance.getForm());
    }

    @Test
    void testSetters() {
        final String newName = "Staff Benefits";
        final BigDecimal newAmount = new BigDecimal("1000.00");
        instance.setName(newName);
        instance.setAmount(newAmount);
        assertEquals(newName, instance.getName());
        assertEquals(newAmount, instance.getAmount());
    }

    @Test
    void testToExplain() {
        String expected = initialName + " are the payments and benefits for public employees.";
        assertEquals(expected, instance.toExplain());
    }

    @Test
    void testToString() {
        String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
        assertEquals(expected, instance.toString());
    }
}
