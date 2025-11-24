package expenses;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SubsidiesTest {

    @Test
    void testGettersAndSetters() {
        Subsidies sub =
            new Subsidies(
                "150",
                "Government Aid",
                new BigDecimal("300000.00"),
                "2021"
            );

        assertEquals("150", sub.getCode());
        assertEquals("Government Aid", sub.getName());
        assertEquals(
            new BigDecimal("300000.00"), sub.getAmount()
        );
        assertEquals("2021", sub.getForm());

        sub.setName("Subsidy Programs");
        sub.setAmount(new BigDecimal("350000.00"));

        assertEquals("Subsidy Programs", sub.getName());
        assertEquals(
            new BigDecimal("350000.00"), sub.getAmount()
        );
    }

    @Test
    void testToString() {
        Subsidies sub =
            new Subsidies(
                "151",
                "Farmer Aid",
                new BigDecimal("50000.00"),
                "2022"
            );

        String expected =
            "Account: Farmer Aid\nAmount: 50000.00";

        assertEquals(expected, sub.toString());
    }

    @Test
    void testToExplainContains() {
        Subsidies sub =
            new Subsidies(
                "152",
                "Student Support",
                new BigDecimal("75000.00"),
                "2023"
            );

        String explanation = sub.toExplain();

        
        assertTrue(explanation.contains("Student Support"));
        assertTrue(explanation.contains("aid"));
        assertTrue(explanation.contains("families") 
                || explanation.contains("farmers")
                || explanation.contains("students")
                || explanation.contains("businesses"));
    }
}
