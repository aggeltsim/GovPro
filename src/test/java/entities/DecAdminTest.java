package entities;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class DecAdminTest {

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
}

