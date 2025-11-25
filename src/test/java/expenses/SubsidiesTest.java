package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SubsidiesTest {

    private Subsidies instance;
    private final String initialCode = "25";
    private final String initialName = "Subsidies";
    private final BigDecimal initialAmount = new BigDecimal("80630000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new Subsidies(initialCode, initialName, initialAmount, initialForm);
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
        final String newName = "Grant Payments";
        final BigDecimal newAmount = new BigDecimal("99999.99");
        instance.setName(newName);
        instance.setAmount(newAmount);
        assertEquals(newName, instance.getName());
        assertEquals(newAmount, instance.getAmount());
    }
}
