package expenses;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TransfersExpTest {

    @Test
    void testGettersAndSetters() {
        TransfersExp transfer =
            new TransfersExp(
                "160",
                "Government Transfers",
                new BigDecimal("500000.00"),
                "2021"
            );

        assertEquals("160", transfer.getCode());
        assertEquals("Government Transfers", transfer.getName());
        assertEquals(
            new BigDecimal("500000.00"), transfer.getAmount()
        );
        assertEquals("2021", transfer.getForm());

        transfer.setName("Public Transfers");
        transfer.setAmount(new BigDecimal("600000.00"));

        assertEquals("Public Transfers", transfer.getName());
        assertEquals(
            new BigDecimal("600000.00"), transfer.getAmount()
        );
    }

    @Test
    void testToString() {
        TransfersExp transfer =
            new TransfersExp(
                "161",
                "Environmental Payments",
                new BigDecimal("200000.00"),
                "2022"
            );

        String expected =
            "Account: Environmental Payments\nAmount: 200000.00";

        assertEquals(expected, transfer.toString());
    }

    @Test
    void testToExplainExact() {
        TransfersExp transfer =
            new TransfersExp(
                "162",
                "Government Transfers",
                new BigDecimal("300000.00"),
                "2023"
            );

        String expected =
            "Government Transfers includes the payments the government"
            + "makes which do not produce something directly"
            + " i.g. expenditures for the protection of the environment"
            + "or for information campaigns. ";

        assertEquals(expected, transfer.toExplain());
    }
}
