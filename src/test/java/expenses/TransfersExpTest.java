package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TransfersExpTest {

    private TransfersExp instance;
    private final String initialCode = "23";
    private final String initialName = "Transfers";
    private final BigDecimal initialAmount = new BigDecimal("34741365000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new TransfersExp(initialCode, initialName, initialAmount, initialForm);
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
        final String newName = "Transfer Payments";
        final BigDecimal newAmount = new BigDecimal("100000.00");
        instance.setName(newName);
        instance.setAmount(newAmount);
        assertEquals(newName, instance.getName());
        assertEquals(newAmount, instance.getAmount());
    }
}
