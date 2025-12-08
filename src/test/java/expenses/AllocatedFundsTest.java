package expenses;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AllocatedFundsTest {

    @Test
    void testGettersAndSetters() {
        AllocatedFunds funds = new AllocatedFunds("A1", "Education", new BigDecimal("1000.00"), "FormA");

        assertEquals("A1", funds.getCode());
        assertEquals("Education", funds.getName());
        assertEquals(new BigDecimal("1000.00"), funds.getAmount());
        assertEquals("FormA", funds.getForm());

        funds.setName("Health");
        funds.setAmount(new BigDecimal("5000.00"));

        assertEquals("Health", funds.getName());
        assertEquals(new BigDecimal("5000.00"), funds.getAmount());
    }

    @Test
    void testToString() {
        AllocatedFunds funds = new AllocatedFunds("A2", "Transport", new BigDecimal("2000.00"), "FormB");
        String expected = "Account: Transport\nAmount: 2000.00";
        assertEquals(expected, funds.toString());
    }

    @Test
    void testToExplain() {
        AllocatedFunds funds = new AllocatedFunds("A3", "Infrastructure", new BigDecimal("500000"), "FormC");
        String explanation = funds.toExplain();

        
        assertTrue(explanation.contains("budgeted funds committed by the government"));
    }
}
