package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class InterestsTest {

    private Interests instance;
    private final String initialCode = "26";
    private final String initialName = "Interest";
    private final BigDecimal initialAmount = new BigDecimal("7701101000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new Interests(initialCode, initialName, initialAmount, initialForm);
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
        final BigDecimal newAmount = new BigDecimal("1.23");
        instance.setAmount(newAmount);
        assertEquals(newAmount, instance.getAmount());
    }
}
