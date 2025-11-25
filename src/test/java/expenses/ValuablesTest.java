package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ValuablesTest {

    private Valuables instance;
    private final String initialCode = "33";
    private final String initialName = "Valuables";
    private final BigDecimal initialAmount = new BigDecimal("85000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new Valuables(initialCode, initialName, initialAmount, initialForm);
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
    void testToString() {
        String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
        assertEquals(expected, instance.toString());
    }
}
