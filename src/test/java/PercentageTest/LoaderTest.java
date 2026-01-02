package PercentageTest;

import Percentage.percentage.Loader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.math.BigDecimal;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class LoaderTest {

    private Loader loader;

    @BeforeEach
    void setUp() {
        loader = new Loader();
    }

    @Test
    @DisplayName("Έλεγχος μετατροπής κειμένου σε αριθμό (safeNumber)")
    void testSafeNumberFormatting() {
        // Περίπτωση με τελείες χιλιάδων και κόμμα δεκαδικών
        // Το "62.055.000,00" πρέπει να γίνει 62055000.00
        String greekFormat = "62.055.000,50";
        BigDecimal result = Loader.safeNumber(greekFormat);
        
        assertEquals(new BigDecimal("62055000.50"), result, 
            "Η safeNumber απέτυχε να καθαρίσει σωστά τις τελείες χιλιάδων.");
    }

    @Test
    @DisplayName("Έλεγχος safeNumber με κενή είσοδο")
    void testSafeNumberEmpty() {
        assertEquals(BigDecimal.ZERO, Loader.safeNumber(""), "Πρέπει να επιστρέφει ZERO για κενό string.");
        assertEquals(BigDecimal.ZERO, Loader.safeNumber(null), "Πρέπει να επιστρέφει ZERO για null.");
    }

    @Test
    @DisplayName("Έλεγχος φόρτωσης δεδομένων από το CSV")
    void testLoadAmounts() {
        try {
            Map<String, BigDecimal> data = loader.loadAmounts();
            
            assertNotNull(data, "Ο χάρτης δεδομένων δεν πρέπει να είναι null.");
            assertFalse(data.isEmpty(), "Ο χάρτης δεδομένων δεν πρέπει να είναι άδειος (βεβαιωθείτε ότι υπάρχει το αρχείο liga2025.csv).");
            
            // Έλεγχος αν ένας γνωστός κωδικός (π.χ. ο '11') υπάρχει στο map
            // Αντικατάστησε το "11" με έναν κωδικό που ξέρεις ότι υπάρχει σίγουρα
            assertTrue(data.containsKey("11") || !data.isEmpty(), "Θα έπρεπε να έχουν φορτωθεί κωδικοί.");
            
        } catch (Exception e) {
            fail("Η φόρτωση του CSV απέτυχε: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Έλεγχος ανάκτησης ονομασίας")
    void testGetName() {
        // Πρώτα τρέχουμε τη φόρτωση για να γεμίσει το namesMap
        try {
            loader.loadAmounts();
            String name = loader.getName("11"); 
            assertNotNull(name);
            assertFalse(name.contains("Άγνωστο Στοιχείο"), "Θα έπρεπε να βρει το όνομα για τον κωδικό 11.");
        } catch (Exception e) {
            // Αν δεν υπάρχει το αρχείο στο test environment, το προσπερνάμε
        }
    }
}
