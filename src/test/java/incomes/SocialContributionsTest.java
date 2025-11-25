package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SocialContributionsTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("2500.00");
        SocialContributions sc = new SocialContributions("SC001", "Health Contribution", amount, "Mandatory");

        assertEquals("SC001", sc.getCode());
        assertEquals("Health Contribution", sc.getName());
        assertEquals(amount, sc.getAmount());
        assertEquals("Mandatory", sc.getForm());
    }

    @Test
    void testSetAmount() {
        SocialContributions sc = new SocialContributions("SC002", "Pension Contribution", new BigDecimal("1200"), "Mandatory");
        BigDecimal newAmount = new BigDecimal("1500.50");
        sc.setAmount(newAmount);
        assertEquals(newAmount, sc.getAmount());
    }

    @Test
    void testToString() {
        SocialContributions sc = new SocialContributions("SC003", "Unemployment Contribution", new BigDecimal("900"), "Mandatory");
        String expected = "Account: Unemployment Contribution\nAmount: 900";
        assertEquals(expected, sc.toString());
    }

    @Test
    void testToExplain() {
        SocialContributions sc = new SocialContributions("SC004", "Other Social Contribution", new BigDecimal("800"), "Optional");
        String explanation = sc.toExplain();
        assertTrue(explanation.contains("Other Social Contribution") || explanation.contains("payments made by workers or employers"));
    }
}

