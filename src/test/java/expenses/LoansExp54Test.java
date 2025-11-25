package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class LoansExp54Test {

    private LoansExp54 instance;
    private final String initialCode = "54";
    private final String initialName = "Loans";
    private final BigDecimal initialAmount = new BigDecimal("1203165130000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new LoansExp54(initialCode, initialName, initialAmount, initialForm);
    }

    @Test
    void testConstructorAndGetters() {
        assertNotNull(instance);
        assertEquals(initialCode, instance.getCode());
        assertEquals(initialName, instance.getName());
        assertEquals(initialAmount, instance.getAmount());
        assertEquals(initialForm, instance.getForm());
    }
}
