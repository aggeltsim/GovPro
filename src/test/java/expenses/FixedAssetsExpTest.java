package expenses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit Test class for the FixedAssetsExp entity.
 */
class FixedAssetsExpTest {

    private FixedAssetsExp fixedAssetsExp;
    private final String initialCode = "31";
    private final String initialName = "Fixed Assets";
    private final BigDecimal initialAmount = new BigDecimal("2609600000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        fixedAssetsExp = new FixedAssetsExp(initialCode, initialName, initialAmount, initialForm);
    }

    @Test
    void testConstructorAndGetters() {
        assertNotNull(fixedAssetsExp);
        assertEquals(initialCode, fixedAssetsExp.getCode());
        assertEquals(initialName, fixedAssetsExp.getName());
        assertEquals(initialAmount, fixedAssetsExp.getAmount());
        assertEquals(initialForm, fixedAssetsExp.getForm());
    }

    @Test
    void testSetName() {
        final String newName = "New Public Investments";
        fixedAssetsExp.setName(newName);
        assertEquals(newName, fixedAssetsExp.getName());
    }

    @Test
    void testSetAmount() {
        final BigDecimal newAmount = new BigDecimal("7250000.88");
        fixedAssetsExp.setAmount(newAmount);
        assertEquals(newAmount, fixedAssetsExp.getAmount());
    }

    @Test
    void testToExplain() {
        String expectedExplanation = initialName + " includes the expense for governmental "
                + "real estate(land and buildings),machinery and "
                + "cultural/historical assets(museums, archaeological sites"
                + " etc) ";
        assertEquals(expectedExplanation, fixedAssetsExp.toExplain());

        final String newName = "Capital Expenditure Account";
        fixedAssetsExp.setName(newName);
        String newExpectedExplanation = newName + " includes the expense for governmental "
                + "real estate(land and buildings),machinery and "
                + "cultural/historical assets(museums, archaeological sites"
                + " etc) ";
        assertEquals(newExpectedExplanation, fixedAssetsExp.toExplain());
    }

    @Test
    void testToString() {
        String expectedString = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
        assertEquals(expectedString, fixedAssetsExp.toString());

        final BigDecimal newAmount = new BigDecimal("1234.56");
        fixedAssetsExp.setAmount(newAmount);
        String newExpectedString = "Account: " + initialName + "\n" + "Amount: " + newAmount;
        assertEquals(newExpectedString, fixedAssetsExp.toString());
    }
}
