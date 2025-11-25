package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class OtherExpensesTest {

    private OtherExpenses instance;
    private final String initialCode = "27";
    private final String initialName = "Other Expenses";
    private final BigDecimal initialAmount = new BigDecimal("101553000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        instance = new OtherExpenses(initialCode, initialName, initialAmount, initialForm);
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
    void testToExplain() {
        String expected = initialName + " covers miscellaneous non-categorized expenditures.";
        assertEquals(expected, instance.toExplain());
    }
}
