package expenses;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ExpensesFullTest {

    // ===========================
    // AllocatedFunds
    // ===========================
    @Test
    void testAllocatedFunds() {
        AllocatedFunds af = new AllocatedFunds(
            "A1", "Education", new BigDecimal("1000.00"), "FormA"
        );

        assertEquals("A1", af.getCode());
        assertEquals("Education", af.getName());
        assertEquals(new BigDecimal("1000.00"), af.getAmount());
        assertEquals("FormA", af.getForm());

        af.setName("Health");
        af.setAmount(new BigDecimal("5000.00"));
        assertEquals("Health", af.getName());
        assertEquals(new BigDecimal("5000.00"), af.getAmount());

        assertEquals("Account: Health\nAmount: 5000.00", af.toString());
        assertTrue(af.toExplain().contains("budgeted funds committed by the government"));
    }

    // ===========================
    // DeptSecurLiabilExp
    // ===========================
    @Test
    void testDeptSecurLiabilExp() {
        DeptSecurLiabilExp de = new DeptSecurLiabilExp(
            "50", "Dept Securities", new BigDecimal("1500000.00"), "2020"
        );

        assertEquals("50", de.getCode());
        assertEquals("Dept Securities", de.getName());
        assertEquals(new BigDecimal("1500000.00"), de.getAmount());
        assertEquals("2020", de.getForm());

        de.setName("Gov Bonds");
        de.setAmount(new BigDecimal("2000000.00"));
        assertEquals("Gov Bonds", de.getName());
        assertEquals(new BigDecimal("2000000.00"), de.getAmount());

        assertEquals("Account: Gov Bonds\nAmount: 2000000.00", de.toString());
        assertTrue(de.toExplain().contains("government bonds or bills"));
        assertTrue(de.toExplain().contains("cash goes out"));
    }

    // ===========================
    // EmployeeBenefits
    // ===========================
    @Test
    void testEmployeeBenefits() {
        EmployeeBenefits eb = new EmployeeBenefits(
            "60", "Employee Benefits", new BigDecimal("120000.00"), "2021"
        );

        assertEquals("60", eb.getCode());
        assertEquals("Employee Benefits", eb.getName());
        assertEquals(new BigDecimal("120000.00"), eb.getAmount());
        assertEquals("2021", eb.getForm());

        eb.setName("Staff Support");
        eb.setAmount(new BigDecimal("180000.00"));
        assertEquals("Staff Support", eb.getName());
        assertEquals(new BigDecimal("180000.00"), eb.getAmount());

        assertEquals("Account: Staff Support\nAmount: 180000.00", eb.toString());
        assertTrue(eb.toExplain().contains("salaries"));
        assertTrue(eb.toExplain().contains("bonuses"));
        assertTrue(eb.toExplain().contains("health insurance"));
        assertTrue(eb.toExplain().contains("paid leaves"));
    }

    // ===========================
    // FixedAssetsExp
    // ===========================
    @Test
    void testFixedAssetsExp() {
        FixedAssetsExp fa = new FixedAssetsExp(
            "70", "Government Property", new BigDecimal("5000000"), "2022"
        );

        assertEquals("70", fa.getCode());
        assertEquals("Government Property", fa.getName());
        assertEquals(new BigDecimal("5000000"), fa.getAmount());
        assertEquals("2022", fa.getForm());

        fa.setName("Machinery");
        fa.setAmount(new BigDecimal("7500000"));
        assertEquals("Machinery", fa.getName());
        assertEquals(new BigDecimal("7500000"), fa.getAmount());

        assertEquals("Account: Machinery\nAmount: 7500000", fa.toString());
        assertTrue(fa.toExplain().contains("real estate"));
        assertTrue(fa.toExplain().contains("machinery"));
    }

    // ===========================
    // Interests
    // ===========================
    @Test
    void testInterests() {
        Interests in = new Interests(
            "80", "Government Interest", new BigDecimal("10000"), "2023"
        );

        assertEquals("80", in.getCode());
        assertEquals("Government Interest", in.getName());
        assertEquals(new BigDecimal("10000"), in.getAmount());
        assertEquals("2023", in.getForm());

        in.setName("Loan Interest");
        in.setAmount(new BigDecimal("15000"));
        assertEquals("Loan Interest", in.getName());
        assertEquals(new BigDecimal("15000"), in.getAmount());

        assertEquals("Account: Loan Interest\nAmount: 15000", in.toString());
        assertTrue(in.toExplain().contains("government has to pay"));
        assertTrue(in.toExplain().contains("lenders"));
    }

    // ===========================
    // LoansExp44
    // ===========================
    @Test
    void testLoansExp44() {
        LoansExp44 le = new LoansExp44(
            "44", "Long-term Loans", new BigDecimal("50000"), "2024"
        );

        assertEquals("44", le.getCode());
        assertEquals("Long-term Loans", le.getName());
        assertEquals(new BigDecimal("50000"), le.getAmount());
        assertEquals("2024", le.getForm());

        le.setName("LT Loans");
        le.setAmount(new BigDecimal("60000"));
        assertEquals("LT Loans", le.getName());
        assertEquals(new BigDecimal("60000"), le.getAmount());

        assertEquals("Account: LT Loans\nAmount: 60000", le.toString());
        assertTrue(le.toExplain().contains("outflow for paying off"));
        assertTrue(le.toExplain().contains("long-term loans"));
    }

    // ===========================
    // LoansExp54
    // ===========================
    @Test
    void testLoansExp54() {
        LoansExp54 le = new LoansExp54(
            "54", "Short-term Loans", new BigDecimal("30000"), "2024"
        );

        assertEquals("54", le.getCode());
        assertEquals("Short-term Loans", le.getName());
        assertEquals(new BigDecimal("30000"), le.getAmount());
        assertEquals("2024", le.getForm());

        le.setName("ST Loans");
        le.setAmount(new BigDecimal("40000"));
        assertEquals("ST Loans", le.getName());
        assertEquals(new BigDecimal("40000"), le.getAmount());

        assertEquals("Account: ST Loans\nAmount: 40000", le.toString());
        assertTrue(le.toExplain().contains("outflow for paying off"));
        assertTrue(le.toExplain().contains("short-term loans"));
    }

    // ===========================
    // Purchases
    // ===========================
    @Test
    void testPurchases() {
        Purchases p = new Purchases(
            "100", "Government Purchases", new BigDecimal("120000"), "2023"
        );

        assertEquals("100", p.getCode());
        assertEquals("Government Purchases", p.getName());
        assertEquals(new BigDecimal("120000"), p.getAmount());
        assertEquals("2023", p.getForm());

        p.setName("Office Supplies");
        p.setAmount(new BigDecimal("130000"));
        assertEquals("Office Supplies", p.getName());
        assertEquals(new BigDecimal("130000"), p.getAmount());

        assertEquals("Account: Office Supplies\nAmount: 130000", p.toString());
        assertTrue(p.toExplain().contains("whatever the government buys"));
        assertTrue(p.toExplain().contains("computers"));
    }

    // ===========================
    // SecuritySharesExp
    // ===========================
    @Test
    void testSecuritySharesExp() {
        SecuritySharesExp sse = new SecuritySharesExp(
            "132", "Equity Investments", new BigDecimal("250000"), "2023"
        );

        assertEquals("132", sse.getCode());
        assertEquals("Equity Investments", sse.getName());
        assertEquals(new BigDecimal("250000"), sse.getAmount());
        assertEquals("2023", sse.getForm());

        sse.setName("Equity Fund");
        sse.setAmount(new BigDecimal("300000"));
        assertEquals("Equity Fund", sse.getName());
        assertEquals(new BigDecimal("300000"), sse.getAmount());

        assertEquals("Account: Equity Fund\nAmount: 300000", sse.toString());
        assertTrue(sse.toExplain().contains("investing purposes"));
        assertTrue(sse.toExplain().contains("equity shares"));
        assertTrue(sse.toExplain().contains("investment fund units"));
    }

    // ===========================
    // SocialBenefits
    // ===========================
    @Test
    void testSocialBenefits() {
        SocialBenefits sb = new SocialBenefits(
            "90", "Social Benefits", new BigDecimal("500000"), "2022"
        );

        assertEquals("90", sb.getCode());
        assertEquals("Social Benefits", sb.getName());
        assertEquals(new BigDecimal("500000"), sb.getAmount());
        assertEquals("2022", sb.getForm());

        sb.setName("Welfare Support");
        sb.setAmount(new BigDecimal("600000"));
        assertEquals("Welfare Support", sb.getName());
        assertEquals(new BigDecimal("600000"), sb.getAmount());

        assertEquals("Account: Welfare Support\nAmount: 600000", sb.toString());
        assertTrue(sb.toExplain().contains("support for"));
        assertTrue(sb.toExplain().contains("poverty"));
        assertTrue(sb.toExplain().contains("unemployment"));
    }

    // ===========================
    // Subsidies
    // ===========================
    @Test
    void testSubsidies() {
        Subsidies sub = new Subsidies(
            "110", "Government Aid", new BigDecimal("400000"), "2023"
        );

        assertEquals("110", sub.getCode());
        assertEquals("Government Aid", sub.getName());
        assertEquals(new BigDecimal("400000"), sub.getAmount());
        assertEquals("2023", sub.getForm());

        sub.setName("Student Aid");
        sub.setAmount(new BigDecimal("450000"));
        assertEquals("Student Aid", sub.getName());
        assertEquals(new BigDecimal("450000"), sub.getAmount());

        assertEquals("Account: Student Aid\nAmount: 450000", sub.toString());
        assertTrue(sub.toExplain().contains("aid for families"));
    }

    // ===========================
    // TransfersExp
    // ===========================
    @Test
    void testTransfersExp() {
        TransfersExp te = new TransfersExp(
            "120", "Transfers", new BigDecimal("500000"), "2024"
        );

        assertEquals("120", te.getCode());
        assertEquals("Transfers", te.getName());
        assertEquals(new BigDecimal("500000"), te.getAmount());
        assertEquals("2024", te.getForm());

        te.setName("Other Transfers");
        te.setAmount(new BigDecimal("550000"));
        assertEquals("Other Transfers", te.getName());
        assertEquals(new BigDecimal("550000"), te.getAmount());

        assertEquals("Account: Other Transfers\nAmount: 550000", te.toString());
        assertTrue(te.toExplain().contains("payments the government makes"));
    }

    // ===========================
    // Valuables
    // ===========================
    @Test
    void testValuables() {
        Valuables v = new Valuables(
            "130", "Cultural Assets", new BigDecimal("75000"), "2022"
        );

        assertEquals("130", v.getCode());
        assertEquals("Cultural Assets", v.getName());
        assertEquals(new BigDecimal("75000"), v.getAmount());
        assertEquals("2022", v.getForm());

        v.setName("Gold Reserves");
        v.setAmount(new BigDecimal("80000"));
        assertEquals("Gold Reserves", v.getName());
        assertEquals(new BigDecimal("80000"), v.getAmount());

        assertEquals("Account: Gold Reserves\nAmount: 80000", v.toString());
        assertTrue(v.toExplain().contains("assets that are hold"));
        assertTrue(v.toExplain().contains("cultural reasons"));
    }
}
