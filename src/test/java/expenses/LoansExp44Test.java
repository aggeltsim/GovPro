package expenses;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class LoansExp44Test {

    @Test
    void testGettersAndSetters() {
        LoansExp44 loan =
            new LoansExp44(
                "90",
                "Long-term Loans",
                new BigDecimal("1000000.00"),
                "2021"
            );

        assertEquals("90", loan.getCode());
        assertEquals("Long-term Loans", loan.getName());
        assertEquals(
            new BigDecimal("1000000.00"), loan.getAmount()
        );
        assertEquals("2021", loan.getForm());

        loan.setName("Loans Payment");
        loan.setAmount(new BigDecimal("1200000.00"));

        assertEquals("Loans Payment", loan.getName());
        assertEquals(
            new BigDecimal("1200000.00"), loan.getAmount()
        );
    }

    @Test
    void testToString() {
        LoansExp44 loan =
            new LoansExp44(
                "91",
                "Repayment Loans",
                new BigDecimal("500000.00"),
                "2022"
            );

        String expected =
            "Account: Repayment Loans\nAmount: 500000.00";

        assertEquals(expected, loan.toString());
    }

    @Test
    void testToExplainContains() {
        LoansExp44 loan =
            new LoansExp44(
                "92",
                "Long-term Loans",
                new BigDecimal("750000.00"),
                "2023"
            );

        String explanation = loan.toExplain();

        assertTrue(explanation.contains("Long-term Loans"));
        assertTrue(explanation.contains("outflow"));
        assertTrue(explanation.contains("paying off"));
        assertTrue(explanation.contains("long-term loans"));
    }
}
