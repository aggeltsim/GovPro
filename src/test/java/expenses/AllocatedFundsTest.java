package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AllocatedFundsTest {

    private AllocatedFunds instance;
    private final String initialCode = "29";
    private final String initialName = "Credits Under Allocation";
    private final BigDecimal initialAmount = new BigDecimal("17283053000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new AllocatedFunds(initialCode, initialName, initialAmount, initialForm);
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
    void testSetAmount() {
        final BigDecimal newAmount = new BigDecimal("0");
        instance.setAmount(newAmount);
        assertEquals(newAmount, instance.getAmount());
    }
}
