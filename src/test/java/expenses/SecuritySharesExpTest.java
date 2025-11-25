package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SecuritySharesExpTest {

    private SecuritySharesExp instance;
    private final String initialCode = "45";
    private final String initialName = "Equity and Investment Fund Shares";
    private final BigDecimal initialAmount = new BigDecimal("1755112000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new SecuritySharesExp(initialCode, initialName, initialAmount, initialForm);
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
