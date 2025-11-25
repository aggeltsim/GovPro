package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DeptSecurLiabilExpTest {

    private DeptSecurLiabilExp instance;
    private final String initialCode = "53";
    private final String initialName = "Debt Securities (Liabilities)";
    private final BigDecimal initialAmount = new BigDecimal("19375000000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new DeptSecurLiabilExp(initialCode, initialName, initialAmount, initialForm);
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
