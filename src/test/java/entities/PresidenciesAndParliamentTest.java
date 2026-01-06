package entities;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PresidenciesAndParliamentTest {

    // Dummy subclass για testing HellenicParliament
    static class DummyParliament extends HellenicParliament {
        public DummyParliament(String code, String name, BigDecimal amount, String form) {
            super(code, name, amount, form);
        }
    }

    // Dummy subclass για testing GovernPresidency
    static class DummyGovernPresidency extends GovernPresidency {
        public DummyGovernPresidency(String code, String name, BigDecimal amount, String form) {
            super(code, name, amount, form);
        }
    }

    // Dummy subclass για testing RepublicPresidency
    static class DummyRepublicPresidency extends RepublicPresidency {
        public DummyRepublicPresidency(String code, String name, BigDecimal amount, String form) {
            super(code, name, amount, form);
        }
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

        assertTrue(par.toExplain().contains("and"));
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

        assertTrue(gov.toExplain().contains("and"));
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
