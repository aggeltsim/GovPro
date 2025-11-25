package incomes;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IncomesFullTest {

    // ===========================
    // Taxes
    // ===========================
    @Test
    void testTaxIncome() {
        TaxIncome ti = new TaxIncome("T1", "Income Tax", new BigDecimal("1000.00"), "FormX");
        assertEquals("T1", ti.getCode());
        assertEquals("Income Tax", ti.getName());
        assertEquals(new BigDecimal("1000.00"), ti.getAmount());
        assertEquals("FormX", ti.getForm());

        ti.setAmount(new BigDecimal("1200.00"));
        assertEquals(new BigDecimal("1200.00"), ti.getAmount());

        assertEquals("Account: Income Tax\nAmount: 1200.00", ti.toString());
        assertTrue(ti.toExplain().contains("money people and businesses pay"));
    }

    @Test
    void testTaxGoodsServices() {
        TaxGoodsServices tgs = new TaxGoodsServices("T2", "VAT", new BigDecimal("500.00"), "FormY");
        assertEquals("VAT", tgs.getName());

        tgs.setAmount(new BigDecimal("600.00"));
        assertEquals(new BigDecimal("600.00"), tgs.getAmount());

        assertTrue(tgs.toExplain().contains("extra amount added to the price"));
    }

    @Test
    void testTaxCapital() {
        TaxCapital tc = new TaxCapital("T3", "Capital Tax", new BigDecimal("200.00"), "FormZ");
        assertEquals("Capital Tax", tc.getName());

        tc.setAmount(new BigDecimal("250.00"));
        assertEquals(new BigDecimal("250.00"), tc.getAmount());

        assertTrue(tc.toExplain().contains("wealth"));
    }

    @Test
    void testTaxDutiesOnImports() {
        TaxDutiesOnImports tdi = new TaxDutiesOnImports("T4", "Import Duties", new BigDecimal("100.00"), "FormA");
        tdi.setAmount(new BigDecimal("120.00"));
        assertEquals(new BigDecimal("120.00"), tdi.getAmount());
        assertTrue(tdi.toExplain().contains("goods brought into a country"));
    }

    @Test
    void testTaxProduction() {
        TaxProduction tp = new TaxProduction("T5", "Production Tax", new BigDecimal("300.00"), "FormB");
        assertTrue(tp.toExplain().contains("goods or materials as they are made"));
    }

    @Test
    void testTaxRegularRealEstate() {
        TaxRegularRealEstate tre = new TaxRegularRealEstate("T6", "Property Tax", new BigDecimal("400.00"), "FormC");
        assertTrue(tre.toExplain().contains("homeowners pay based on the value of their land"));
    }

    @Test
    void testTaxOther() {
        TaxOther to = new TaxOther("T7", "Other Taxes", new BigDecimal("50.00"), "FormD");
        assertTrue(to.toExplain().contains("additional charges"));
    }

    // ===========================
    // Sales
    // ===========================
    @Test
    void testSalGoods() {
        SalGoods sg = new SalGoods("S1", "Goods Sales", new BigDecimal("500.00"), "FormS");
        sg.setAmount(new BigDecimal("600.00"));
        assertEquals(new BigDecimal("600.00"), sg.getAmount());
        assertTrue(sg.toExplain().contains("physical goods"));
    }

    @Test
    void testSalServices() {
        SalServices ss = new SalServices("S2", "Services Sales", new BigDecimal("300.00"), "FormS");
        assertTrue(ss.toExplain().contains("providing services"));
    }

    @Test
    void testSalRents() {
        SalRents sr = new SalRents("S3", "Rents", new BigDecimal("700.00"), "FormR");
        assertTrue(sr.toExplain().contains("renting out public buildings"));
    }

    @Test
    void testSalAdministFees() {
        SalAdministFees saf = new SalAdministFees("S4", "Admin Fees", new BigDecimal("200.00"), "FormF");
        assertTrue(saf.toExplain().contains("issuing documents"));
    }

    @Test
    void testSalCommissions() {
        SalCommissions sc = new SalCommissions("S5", "Commissions", new BigDecimal("150.00"), "FormC");
        assertTrue(sc.toExplain().contains("small fees or percentage charges"));
    }

    @Test
    void testSalOther() {
        SalOther so = new SalOther("S6", "Other Sales", new BigDecimal("100.00"), "FormO");
        assertTrue(so.toExplain().contains("various other small sales activities"));
    }

    // ===========================
    // Loans
    // ===========================
    @Test
    void testLShortTerm() {
        LShortTerm lst = new LShortTerm("L1", "Short-term Loan", new BigDecimal("1000.00"), "FormL");
        assertTrue(lst.toExplain().contains("immediate expenses"));
    }

    @Test
    void testLLongTermL2() {
        LLongTermL2 llt = new LLongTermL2("L2", "Long-term Loan", new BigDecimal("5000.00"), "FormL");
        assertTrue(llt.toExplain().contains("big investments"));
    }

    @Test
    void testLoansInc44() {
        LoansInc44 li44 = new LoansInc44("L3", "Refinancing Loan", new BigDecimal("2000.00"), "FormL");
        assertTrue(li44.toExplain().contains("refinance or repay older debt"));
    }

    // ===========================
    // OtherCurIncome
    // ===========================
    @Test
    void testOciInterest() {
        OciInterest oi = new OciInterest("OC1", "Interest Income", new BigDecimal("400.00"), "FormO");
        assertTrue(oi.toExplain().contains("interest on money"));
    }

    @Test
    void testOciCorporateDistribInc() {
        OciCorporateDistribInc oci = new OciCorporateDistribInc("OC2", "Dividends", new BigDecimal("500.00"), "FormO");
        assertTrue(oci.toExplain().contains("dividends from companies"));
    }

    @Test
    void testOciFinesPenaltiesAssessments() {
        OciFinesPenaltiesAssessments ofpa = new OciFinesPenaltiesAssessments("OC3", "Fines", new BigDecimal("600.00"), "FormO");
        assertTrue(ofpa.toExplain().contains("penalties imposed"));
    }

    @Test
    void testOciNaturalResourceRent() {
        OciNaturalResourceRent onrr = new OciNaturalResourceRent("OC4", "Resource Rent", new BigDecimal("700.00"), "FormO");
        assertTrue(onrr.toExplain().contains("payments for the use of natural resources"));
    }

    @Test
    void testOciReimbursements() {
        OciReimbursements orr = new OciReimbursements("OC5", "Reimbursements", new BigDecimal("800.00"), "FormO");
        assertTrue(orr.toExplain().contains("receives back money"));
    }

    // ===========================
    // SecuritiesShares
    // ===========================
    @Test
    void testSsListed() {
        SsListed sl = new SsListed("SS1", "Listed Shares", new BigDecimal("1000.00"), "FormSS");
        assertTrue(sl.toExplain().contains("shares of companies that the government owns"));
    }

    @Test
    void testSsUnlisted() {
        SsUnlisted su = new SsUnlisted("SS2", "Unlisted Shares", new BigDecimal("2000.00"), "FormSS");
        assertTrue(su.toExplain().contains("not on the stock market"));
    }

    // ===========================
    // SocialContributions
    // ===========================
    @Test
    void testSocialContributions() {
        SocialContributions sc = new SocialContributions("SOC1", "Social Contribution", new BigDecimal("300.00"), "FormSOC");
        assertTrue(sc.toExplain().contains("payments made by workers or employers"));
    }

    // ===========================
    // Transfers
    // ===========================
    @Test
    void testTrCurrentDomestic() {
        TrCurrentDomestic tr = new TrCurrentDomestic("TR1", "Domestic Transfer", new BigDecimal("400.00"), "FormTR");
        assertTrue(tr.toExplain().contains("receives from within the country"));
    }

    @Test
    void testTrDomesInvestGrants() {
        TrDomesInvestGrants tr = new TrDomesInvestGrants("TR2", "Domestic Grants", new BigDecimal("500.00"), "FormTR");
        assertTrue(tr.toExplain().contains("support businesses or projects"));
    }

    @Test
    void testTrEU() {
        TrEU tr = new TrEU("TR3", "EU Funds", new BigDecimal("600.00"), "FormTR");
        assertTrue(tr.toExplain().contains("receives from the European Union"));
    }

    @Test
    void testTrEUInvestGrants() {
        TrEUInvestGrants tr = new TrEUInvestGrants("TR4", "EU Investment Grants", new BigDecimal("700.00"), "FormTR");
        assertTrue(tr.toExplain().contains("specifically to support investments"));
    }

    @Test
    void testTrForeignEntities() {
        TrForeignEntities tr = new TrForeignEntities("TR5", "Foreign Transfers", new BigDecimal("800.00"), "FormTR");
        assertTrue(tr.toExplain().contains("receives from other countries or international organizations"));
    }

    @Test
    void testTrOther() {
        TrOther tr = new TrOther("TR6", "Other Transfers", new BigDecimal("900.00"), "FormTR");
        assertTrue(tr.toExplain().contains("any other sources not covered"));
    }
}

