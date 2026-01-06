package expenses;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LoansExp54Test {

    @Test
    void testGettersAndSetters() {
        LoansExp54 loan =
            new LoansExp54(
                "100",
                "Short-term Loans",
                new BigDecimal("500000.00"),
                "2021"
            );

        assertEquals("100", loan.getCode());
        assertEquals("Short-term Loans", loan.getName());
        assertEquals(
            new BigDecimal("500000.00"), loan.getAmount()
        );
        assertEquals("2021", loan.getForm());

        loan.setName("Loans Payment");
        loan.setAmount(new BigDecimal("600000.00"));

        assertEquals("Loans Payment", loan.getName());
        assertEquals(
            new BigDecimal("600000.00"), loan.getAmount()
        );
    }

    @Test
    void testToString() {
        LoansExp54 loan =
            new LoansExp54(
                "101",
                "Repayment Loans",
                new BigDecimal("250000.00"),
                "2022"
            );

        String expected =
            "Account: Repayment Loans\nAmount: 250000.00";

        assertEquals(expected, loan.toString());
    }

    @Test
    void testToExplainContains() {
        LoansExp54 loan =
            new LoansExp54(
                "102",
                "Short-term Loans",
                new BigDecimal("300000.00"),
                "2023"
            );

        String explanation = loan.toExplain();


    }
}
