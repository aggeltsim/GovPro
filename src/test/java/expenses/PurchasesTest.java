package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PurchasesTest {

    private Purchases instance;
    private final String initialCode = "24";
    private final String initialName = "Purchases of Goods and Services";
    private final BigDecimal initialAmount = new BigDecimal("2039542000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new Purchases(initialCode, initialName, initialAmount, initialForm);
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
    void testSetNameAndAmount() {
        final String newName = "Procurement";
        final BigDecimal newAmount = new BigDecimal("50000.00");
        instance.setName(newName);
        instance.setAmount(newAmount);
        assertEquals(newName, instance.getName());
        assertEquals(newAmount, instance.getAmount());
    }
}
