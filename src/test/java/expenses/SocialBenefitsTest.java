package expenses;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SocialBenefitsTest {

    @Test
    void testGettersAndSetters() {
        SocialBenefits social =
            new SocialBenefits(
                "140",
                "Social Support",
                new BigDecimal("200000.00"),
                "2021"
            );

        assertEquals("140", social.getCode());
        assertEquals("Social Support", social.getName());
        assertEquals(
            new BigDecimal("200000.00"), social.getAmount()
        );
        assertEquals("2021", social.getForm());

        social.setName("Welfare Programs");
        social.setAmount(new BigDecimal("250000.00"));

        assertEquals("Welfare Programs", social.getName());
        assertEquals(
            new BigDecimal("250000.00"), social.getAmount()
        );
    }

    @Test
    void testToString() {
        SocialBenefits social =
            new SocialBenefits(
                "141",
                "Poverty Aid",
                new BigDecimal("100000.00"),
                "2022"
            );

        String expected =
            "Account: Poverty Aid\nAmount: 100000.00";

        assertEquals(expected, social.toString());
    }

    @Test
    void testToExplainExact() {
        SocialBenefits social =
            new SocialBenefits(
                "142",
                "Social Support",
                new BigDecimal("150000.00"),
                "2023"
            );

        String expected =
            "Social Support is an expense that includes support for"
            + " problems such as poverty, illiteracy, "
            + "unemployment and natural disasters";

        assertEquals(expected, social.toExplain());
    }
}
