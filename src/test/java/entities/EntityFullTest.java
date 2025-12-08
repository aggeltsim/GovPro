package entities;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class EntityFullTest {

    @Test
    void testDecAdminAegean() {
        DecAdminAegean aegean = new DecAdminAegean(
            "001", "Dec Admin Aegean", new BigDecimal("100000"), "2023"
        );

        assertEquals("001", aegean.getCode());
        assertEquals("Dec Admin Aegean", aegean.getName());
        assertEquals(new BigDecimal("100000"), aegean.getAmount());
        assertEquals("2023", aegean.getForm());

        aegean.setName("Aegean Administration");
        aegean.setAmount(new BigDecimal("120000"));
        assertEquals("Aegean Administration", aegean.getName());
        assertEquals(new BigDecimal("120000"), aegean.getAmount());

        assertEquals("Account: Aegean Administration\nAmount: 120000", aegean.toString());
        assertTrue(aegean.toExplain().contains("Aegean Administration"));
        assertTrue(aegean.toExplain().contains("administrative tasks"));
        assertTrue(aegean.toExplain().contains("Aegean regions"));
    }

    @Test
    void testDecAdminAttica() {
        DecAdminAttica attica = new DecAdminAttica(
            "002", "Dec Admin Attica", new BigDecimal("150000"), "2023"
        );

        assertEquals("002", attica.getCode());
        assertEquals("Dec Admin Attica", attica.getName());
        assertEquals(new BigDecimal("150000"), attica.getAmount());
        assertEquals("2023", attica.getForm());

        attica.setName("Attica Administration");
        attica.setAmount(new BigDecimal("180000"));
        assertEquals("Attica Administration", attica.getName());
        assertEquals(new BigDecimal("180000"), attica.getAmount());

        assertEquals("Account: Attica Administration\nAmount: 180000", attica.toString());
        assertTrue(attica.toExplain().contains("Attica Administration"));
        assertTrue(attica.toExplain().contains("regional state authority"));
        assertTrue(attica.toExplain().contains("environmental"));
    }

    @Test
    void testDecAdminCrete() {
        DecAdminCrete crete = new DecAdminCrete(
            "003", "Dec Admin Crete", new BigDecimal("90000"), "2023"
        );

        assertEquals("003", crete.getCode());
        assertEquals("Dec Admin Crete", crete.getName());
        assertEquals(new BigDecimal("90000"), crete.getAmount());
        assertEquals("2023", crete.getForm());

        crete.setName("Crete Administration");
        crete.setAmount(new BigDecimal("110000"));
        assertEquals("Crete Administration", crete.getName());
        assertEquals(new BigDecimal("110000"), crete.getAmount());

        assertEquals("Account: Crete Administration\nAmount: 110000", crete.toString());
        assertTrue(crete.toExplain().contains("Crete Administration"));
        assertTrue(crete.toExplain().contains("covers the island of Crete"));
    }

    @Test
    void testDecAdminEpirWMaced() {
        DecAdminEpirWMaced epir = new DecAdminEpirWMaced(
            "004", "Dec Admin Epir & W Maced", new BigDecimal("95000"), "2023"
        );

        assertEquals("004", epir.getCode());
        assertEquals("Dec Admin Epir & W Maced", epir.getName());
        assertEquals(new BigDecimal("95000"), epir.getAmount());
        assertEquals("2023", epir.getForm());

        epir.setName("Epirus & W Macedonia Admin");
        epir.setAmount(new BigDecimal("105000"));
        assertEquals("Epirus & W Macedonia Admin", epir.getName());
        assertEquals(new BigDecimal("105000"), epir.getAmount());

        assertEquals(
            "Account: Epirus & W Macedonia Admin\nAmount: 105000", epir.toString()
        );
        assertTrue(epir.toExplain().contains("Epirus & W Macedonia Admin"));
        assertTrue(epir.toExplain().contains("state-level administrative duties"));
    }

    @Test
    void testDecAdminMacedThr() {
        DecAdminMacedThr macedthr = new DecAdminMacedThr(
            "005", "Dec Admin Maced & Thr", new BigDecimal("120000"), "2023"
        );

        assertEquals("005", macedthr.getCode());
        assertEquals("Dec Admin Maced & Thr", macedthr.getName());
        assertEquals(new BigDecimal("120000"), macedthr.getAmount());
        assertEquals("2023", macedthr.getForm());

        macedthr.setName("Macedonia & Thrace Admin");
        macedthr.setAmount(new BigDecimal("140000"));
        assertEquals("Macedonia & Thrace Admin", macedthr.getName());
        assertEquals(new BigDecimal("140000"), macedthr.getAmount());

        assertEquals(
            "Account: Macedonia & Thrace Admin\nAmount: 140000", macedthr.toString()
        );
        assertTrue(macedthr.toExplain().contains("Macedonia & Thrace Admin"));
        assertTrue(macedthr.toExplain().contains("regional state authority"));
    }

        @Test
    void testDecAdminPelopWGrIon() {
        DecAdminPelopWGrIon pelop = new DecAdminPelopWGrIon(
            "006", "Dec Admin Pelop/W Gr & Ion", new BigDecimal("110000"), "2023"
        );

        assertEquals("006", pelop.getCode());
        assertEquals("Dec Admin Pelop/W Gr & Ion", pelop.getName());
        assertEquals(new BigDecimal("110000"), pelop.getAmount());
        assertEquals("2023", pelop.getForm());

        pelop.setName("Peloponnese & W Greece Admin");
        pelop.setAmount(new BigDecimal("130000"));
        assertEquals("Peloponnese & W Greece Admin", pelop.getName());
        assertEquals(new BigDecimal("130000"), pelop.getAmount());

        assertEquals(
            "Account: Peloponnese & W Greece Admin\nAmount: 130000", pelop.toString()
        );
        assertTrue(pelop.toExplain().contains("Peloponnese & W Greece Admin"));
        assertTrue(pelop.toExplain().contains("manages state competences"));
    }

    @Test
    void testDecAdminThesCenGr() {
        DecAdminThesCenGr thes = new DecAdminThesCenGr(
            "007", "Dec Admin Thes/Cen Gr", new BigDecimal("115000"), "2023"
        );

        assertEquals("007", thes.getCode());
        assertEquals("Dec Admin Thes/Cen Gr", thes.getName());
        assertEquals(new BigDecimal("115000"), thes.getAmount());
        assertEquals("2023", thes.getForm());

        thes.setName("Thessaly & Central Greece Admin");
        thes.setAmount(new BigDecimal("140000"));
        assertEquals("Thessaly & Central Greece Admin", thes.getName());
        assertEquals(new BigDecimal("140000"), thes.getAmount());

        assertEquals(
            "Account: Thessaly & Central Greece Admin\nAmount: 140000", thes.toString()
        );
        assertTrue(thes.toExplain().contains("Thessaly & Central Greece Admin"));
        assertTrue(thes.toExplain().contains("regional state authority"));
    }
    @Test
    void testMinCivilProtection() {
        MinCivilProtection min = new MinCivilProtection(
            "101", "Min Civil Protection", new BigDecimal("200000"), "2023"
        );

        assertEquals("101", min.getCode());
        assertEquals("Min Civil Protection", min.getName());
        assertEquals(new BigDecimal("200000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Civil Protection Ministry");
        min.setAmount(new BigDecimal("250000"));
        assertEquals("Civil Protection Ministry", min.getName());
        assertEquals(new BigDecimal("250000"), min.getAmount());

        assertEquals(
            "Account: Civil Protection Ministry\nAmount: 250000", min.toString()
        );
        assertTrue(min.toExplain().contains("Civil Protection Ministry"));
        assertTrue(min.toExplain().contains("public order"));
    }

    @Test
    void testMinClimateCrisis() {
        MinClimateCrisis min = new MinClimateCrisis(
            "102", "Min Climate Crisis", new BigDecimal("180000"), "2023"
        );

        assertEquals("102", min.getCode());
        assertEquals("Min Climate Crisis", min.getName());
        assertEquals(new BigDecimal("180000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Climate Crisis Ministry");
        min.setAmount(new BigDecimal("220000"));
        assertEquals("Climate Crisis Ministry", min.getName());
        assertEquals(new BigDecimal("220000"), min.getAmount());

        assertEquals(
            "Account: Climate Crisis Ministry\nAmount: 220000", min.toString()
        );
        assertTrue(min.toExplain().contains("Climate Crisis Ministry"));
        assertTrue(min.toExplain().contains("natural disaster management"));
    }

    @Test
    void testMinCulture() {
        MinCulture min = new MinCulture(
            "103", "Min Culture", new BigDecimal("150000"), "2023"
        );

        assertEquals("103", min.getCode());
        assertEquals("Min Culture", min.getName());
        assertEquals(new BigDecimal("150000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Culture Ministry");
        min.setAmount(new BigDecimal("170000"));
        assertEquals("Culture Ministry", min.getName());
        assertEquals(new BigDecimal("170000"), min.getAmount());

        assertEquals(
            "Account: Culture Ministry\nAmount: 170000", min.toString()
        );
        assertTrue(min.toExplain().contains("Culture Ministry"));
        assertTrue(min.toExplain().contains("cultural heritage"));
    }

    @Test
    void testMinDefense() {
        MinDefense min = new MinDefense(
            "104", "Min Defense", new BigDecimal("500000"), "2023"
        );

        assertEquals("104", min.getCode());
        assertEquals("Min Defense", min.getName());
        assertEquals(new BigDecimal("500000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Defense Ministry");
        min.setAmount(new BigDecimal("600000"));
        assertEquals("Defense Ministry", min.getName());
        assertEquals(new BigDecimal("600000"), min.getAmount());

        assertEquals(
            "Account: Defense Ministry\nAmount: 600000", min.toString()
        );
        assertTrue(min.toExplain().contains("Defense Ministry"));
        assertTrue(min.toExplain().contains("armed forces"));
    }

    @Test
    void testMinDevelopment() {
        MinDevelopment min = new MinDevelopment(
            "105", "Min Development", new BigDecimal("300000"), "2023"
        );

        assertEquals("105", min.getCode());
        assertEquals("Min Development", min.getName());
        assertEquals(new BigDecimal("300000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Development Ministry");
        min.setAmount(new BigDecimal("350000"));
        assertEquals("Development Ministry", min.getName());
        assertEquals(new BigDecimal("350000"), min.getAmount());

        assertEquals(
            "Account: Development Ministry\nAmount: 350000", min.toString()
        );
        assertTrue(min.toExplain().contains("Development Ministry"));
        assertTrue(min.toExplain().contains("economic growth"));
    }

    @Test
    void testMinDigitalGovern() {
        MinDigitalGovern min = new MinDigitalGovern(
            "106", "Min Digital Govern", new BigDecimal("120000"), "2023"
        );

        assertEquals("106", min.getCode());
        assertEquals("Min Digital Govern", min.getName());
        assertEquals(new BigDecimal("120000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Digital Governance Ministry");
        min.setAmount(new BigDecimal("150000"));
        assertEquals("Digital Governance Ministry", min.getName());
        assertEquals(new BigDecimal("150000"), min.getAmount());

        assertEquals(
            "Account: Digital Governance Ministry\nAmount: 150000", min.toString()
        );
        assertTrue(min.toExplain().contains("Digital Governance Ministry"));
        assertTrue(min.toExplain().contains("digital transformation"));
    }
        @Test
    void testMinEconomy() {
        MinEconomy min = new MinEconomy(
            "107", "Min Economy", new BigDecimal("400000"), "2023"
        );

        assertEquals("107", min.getCode());
        assertEquals("Min Economy", min.getName());
        assertEquals(new BigDecimal("400000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Economy Ministry");
        min.setAmount(new BigDecimal("450000"));
        assertEquals("Economy Ministry", min.getName());
        assertEquals(new BigDecimal("450000"), min.getAmount());

        assertEquals(
            "Account: Economy Ministry\nAmount: 450000", min.toString()
        );
        assertTrue(min.toExplain().contains("Economy Ministry"));
        assertTrue(min.toExplain().contains("economic policy"));
    }

    @Test
    void testMinEducatReligSports() {
        MinEducatReligSports min = new MinEducatReligSports(
            "108", "Min Educat Relig Sports", new BigDecimal("250000"), "2023"
        );

        assertEquals("108", min.getCode());
        assertEquals("Min Educat Relig Sports", min.getName());
        assertEquals(new BigDecimal("250000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Education & Sports Ministry");
        min.setAmount(new BigDecimal("280000"));
        assertEquals("Education & Sports Ministry", min.getName());
        assertEquals(new BigDecimal("280000"), min.getAmount());

        assertEquals(
            "Account: Education & Sports Ministry\nAmount: 280000", min.toString()
        );
        assertTrue(min.toExplain().contains("Education & Sports Ministry"));
        assertTrue(min.toExplain().contains("education"));
        assertTrue(min.toExplain().contains("religious"));
        assertTrue(min.toExplain().contains("sports policy"));
    }
    @Test
    void testMinEnvirEnergy() {
        MinEnvirEnergy min = new MinEnvirEnergy("109", "Min Envir Energy", new BigDecimal("300000"), "2023");
        assertEquals("109", min.getCode());
        assertEquals("Min Envir Energy", min.getName());
        assertEquals(new BigDecimal("300000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Environment & Energy Ministry");
        min.setAmount(new BigDecimal("350000"));
        assertEquals("Environment & Energy Ministry", min.getName());
        assertEquals(new BigDecimal("350000"), min.getAmount());

        assertEquals("Account: Environment & Energy Ministry\nAmount: 350000", min.toString());
        assertTrue(min.toExplain().contains("Environment & Energy Ministry"));
        assertTrue(min.toExplain().contains("environmental protection"));
    }

    @Test
    void testMinForeign() {
        MinForeign min = new MinForeign("110", "Min Foreign", new BigDecimal("200000"), "2023");
        assertEquals("110", min.getCode());
        assertEquals("Min Foreign", min.getName());
        assertEquals(new BigDecimal("200000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Foreign Affairs Ministry");
        min.setAmount(new BigDecimal("220000"));
        assertEquals("Foreign Affairs Ministry", min.getName());
        assertEquals(new BigDecimal("220000"), min.getAmount());

        assertEquals("Account: Foreign Affairs Ministry\nAmount: 220000", min.toString());
        assertTrue(min.toExplain().contains("Foreign Affairs Ministry"));
        assertTrue(min.toExplain().contains("foreign policy"));
    }

    @Test
    void testMinHealth() {
        MinHealth min = new MinHealth("111", "Min Health", new BigDecimal("500000"), "2023");
        assertEquals("111", min.getCode());
        assertEquals("Min Health", min.getName());
        assertEquals(new BigDecimal("500000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Health Ministry");
        min.setAmount(new BigDecimal("550000"));
        assertEquals("Health Ministry", min.getName());
        assertEquals(new BigDecimal("550000"), min.getAmount());

        assertEquals("Account: Health Ministry\nAmount: 550000", min.toString());
        assertTrue(min.toExplain().contains("Health Ministry"));
        assertTrue(min.toExplain().contains("public health policy"));
    }

    @Test
    void testMinImmigrAsylum() {
        MinImmigrAsylum min = new MinImmigrAsylum("112", "Min Immigr Asylum", new BigDecimal("150000"), "2023");
        assertEquals("112", min.getCode());
        assertEquals("Min Immigr Asylum", min.getName());
        assertEquals(new BigDecimal("150000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Immigration & Asylum Ministry");
        min.setAmount(new BigDecimal("180000"));
        assertEquals("Immigration & Asylum Ministry", min.getName());
        assertEquals(new BigDecimal("180000"), min.getAmount());

        assertEquals("Account: Immigration & Asylum Ministry\nAmount: 180000", min.toString());
        assertTrue(min.toExplain().contains("Immigration & Asylum Ministry"));
        assertTrue(min.toExplain().contains("migration policy"));
    }

    @Test
    void testMinInfrastTransport() {
        MinInfrastTransport min = new MinInfrastTransport("113", "Min Infrast Transport", new BigDecimal("400000"), "2023");
        assertEquals("113", min.getCode());
        assertEquals("Min Infrast Transport", min.getName());
        assertEquals(new BigDecimal("400000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Infrastructure & Transport Ministry");
        min.setAmount(new BigDecimal("450000"));
        assertEquals("Infrastructure & Transport Ministry", min.getName());
        assertEquals(new BigDecimal("450000"), min.getAmount());

        assertEquals("Account: Infrastructure & Transport Ministry\nAmount: 450000", min.toString());
        assertTrue(min.toExplain().contains("Infrastructure & Transport Ministry"));
        assertTrue(min.toExplain().contains("transportation networks"));
    }

    @Test
    void testMinInterior() {
        MinInterior min = new MinInterior("114", "Min Interior", new BigDecimal("350000"), "2023");
        assertEquals("114", min.getCode());
        assertEquals("Min Interior", min.getName());
        assertEquals(new BigDecimal("350000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Interior Ministry");
        min.setAmount(new BigDecimal("380000"));
        assertEquals("Interior Ministry", min.getName());
        assertEquals(new BigDecimal("380000"), min.getAmount());

        assertEquals("Account: Interior Ministry\nAmount: 380000", min.toString());
        assertTrue(min.toExplain().contains("Interior Ministry"));
        assertTrue(min.toExplain().contains("public administration"));
    }
    @Test
    void testMinJustice() {
        MinJustice min = new MinJustice("115", "Min Justice", new BigDecimal("250000"), "2023");
        assertEquals("115", min.getCode());
        assertEquals("Min Justice", min.getName());
        assertEquals(new BigDecimal("250000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Justice Ministry");
        min.setAmount(new BigDecimal("280000"));
        assertEquals("Justice Ministry", min.getName());
        assertEquals(new BigDecimal("280000"), min.getAmount());

        assertEquals("Account: Justice Ministry\nAmount: 280000", min.toString());
        assertTrue(min.toExplain().contains("Justice Ministry"));
        assertTrue(min.toExplain().contains("judicial system"));
    }

    @Test
    void testMinLaborSocSecurity() {
        MinLaborSocSecurity min = new MinLaborSocSecurity("116", "Min Labor Soc Security", new BigDecimal("320000"), "2023");
        assertEquals("116", min.getCode());
        assertEquals("Min Labor Soc Security", min.getName());
        assertEquals(new BigDecimal("320000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Labor & Social Security Ministry");
        min.setAmount(new BigDecimal("350000"));
        assertEquals("Labor & Social Security Ministry", min.getName());
        assertEquals(new BigDecimal("350000"), min.getAmount());

        assertEquals("Account: Labor & Social Security Ministry\nAmount: 350000", min.toString());
        assertTrue(min.toExplain().contains("Labor & Social Security Ministry"));
        assertTrue(min.toExplain().contains("labour relations"));
    }

    @Test
    void testMinRuralDevelFood() {
        MinRuralDevelFood min = new MinRuralDevelFood("117", "Min Rural Devel Food", new BigDecimal("280000"), "2023");
        assertEquals("117", min.getCode());
        assertEquals("Min Rural Devel Food", min.getName());
        assertEquals(new BigDecimal("280000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Rural Development & Food Ministry");
        min.setAmount(new BigDecimal("300000"));
        assertEquals("Rural Development & Food Ministry", min.getName());
        assertEquals(new BigDecimal("300000"), min.getAmount());

        assertEquals("Account: Rural Development & Food Ministry\nAmount: 300000", min.toString());
        assertTrue(min.toExplain().contains("Rural Development & Food Ministry"));
        assertTrue(min.toExplain().contains("supports farmers"));
    }

    @Test
    void testMinShipIslandPolicy() {
        MinShipIslandPolicy min = new MinShipIslandPolicy("118", "Min Ship Island Policy", new BigDecimal("180000"), "2023");
        assertEquals("118", min.getCode());
        assertEquals("Min Ship Island Policy", min.getName());
        assertEquals(new BigDecimal("180000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Shipping & Island Policy Ministry");
        min.setAmount(new BigDecimal("200000"));
        assertEquals("Shipping & Island Policy Ministry", min.getName());
        assertEquals(new BigDecimal("200000"), min.getAmount());

        assertEquals("Account: Shipping & Island Policy Ministry\nAmount: 200000", min.toString());
        assertTrue(min.toExplain().contains("Shipping & Island Policy Ministry"));
        assertTrue(min.toExplain().contains("shipping"));
    }

    @Test
    void testMinSocCohesFam() {
        MinSocCohesFam min = new MinSocCohesFam("119", "Min Soc Cohes Fam", new BigDecimal("220000"), "2023");
        assertEquals("119", min.getCode());
        assertEquals("Min Soc Cohes Fam", min.getName());
        assertEquals(new BigDecimal("220000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Social Cohesion & Family Ministry");
        min.setAmount(new BigDecimal("240000"));
        assertEquals("Social Cohesion & Family Ministry", min.getName());
        assertEquals(new BigDecimal("240000"), min.getAmount());

        assertEquals("Account: Social Cohesion & Family Ministry\nAmount: 240000", min.toString());
        assertTrue(min.toExplain().contains("Social Cohesion & Family Ministry"));
        assertTrue(min.toExplain().contains("social welfare"));
    }

    @Test
    void testMinTourism() {
        MinTourism min = new MinTourism("120", "Min Tourism", new BigDecimal("200000"), "2023");
        assertEquals("120", min.getCode());
        assertEquals("Min Tourism", min.getName());
        assertEquals(new BigDecimal("200000"), min.getAmount());
        assertEquals("2023", min.getForm());

        min.setName("Tourism Ministry");
        min.setAmount(new BigDecimal("220000"));
        assertEquals("Tourism Ministry", min.getName());
        assertEquals(new BigDecimal("220000"), min.getAmount());

        assertEquals("Account: Tourism Ministry\nAmount: 220000", min.toString());
        assertTrue(min.toExplain().contains("Tourism Ministry"));
        assertTrue(min.toExplain().contains("tourism policy"));
    }
    @Test
    void testHellenicParliament() {
        HellenicParliament par = new HellenicParliament("HP001", "Greek Parliament", new BigDecimal("1000"), "2025");
        assertEquals("HP001", par.getCode());
        assertEquals("Greek Parliament", par.getName());
        assertEquals(new BigDecimal("1000"), par.getAmount());
        assertEquals("2025", par.getForm());

        par.setName("Hellenic Parliament Updated");
        par.setAmount(new BigDecimal("1200"));
        assertEquals("Hellenic Parliament Updated", par.getName());
        assertEquals(new BigDecimal("1200"), par.getAmount());

        assertTrue(par.toExplain().contains("unicameral legislative body"));
        assertTrue(par.toString().contains("Account: Hellenic Parliament Updated"));
    }

    @Test
    void testGovernPresidency() {
        GovernPresidency gov = new GovernPresidency("GP001", "Government Presidency", new BigDecimal("2000"), "2025");
        assertEquals("GP001", gov.getCode());
        assertEquals("Government Presidency", gov.getName());
        assertEquals(new BigDecimal("2000"), gov.getAmount());
        assertEquals("2025", gov.getForm());

        gov.setName("Government Presidency Updated");
        gov.setAmount(new BigDecimal("2500"));
        assertEquals("Government Presidency Updated", gov.getName());
        assertEquals(new BigDecimal("2500"), gov.getAmount());

        assertTrue(gov.toExplain().contains("central office supporting the Prime Minister"));
        assertTrue(gov.toString().contains("Account: Government Presidency Updated"));
    }

    @Test
    void testRepublicPresidency() {
        RepublicPresidency rep = new RepublicPresidency("RP001", "Republic Presidency", new BigDecimal("3000"), "2025");
        assertEquals("RP001", rep.getCode());
        assertEquals("Republic Presidency", rep.getName());
        assertEquals(new BigDecimal("3000"), rep.getAmount());
        assertEquals("2025", rep.getForm());

        rep.setName("Republic Presidency Updated");
        rep.setAmount(new BigDecimal("3500"));
        assertEquals("Republic Presidency Updated", rep.getName());
        assertEquals(new BigDecimal("3500"), rep.getAmount());

        assertTrue(rep.toExplain().contains("President of Greece"));
        assertTrue(rep.toString().contains("Account: Republic Presidency Updated"));
    }
}

    

        


