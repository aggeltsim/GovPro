import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Main2Test {

    @Test
    void testDataIntegrity() {
        // Παράδειγμα: έλεγχος ότι οι πρώτες τιμές του πίνακα είναι σωστές
        Object[][] data = {
            {"Code", "Name", "Amount"},
            {"11","Taxes", new BigDecimal("62055000000")}
        };

        assertEquals("Taxes", data[1][1]);
        assertEquals(new BigDecimal("62055000000"), data[1][2]);
    }

    @Test
    void testEntityCreation() {
        var tax = new incomes.TaxGoodsServices("111", "Taxes on Goods", new BigDecimal("33667000000"), "2025");
        assertEquals("111", tax.getCode());
        assertEquals("Taxes on Goods", tax.getName());
    }
}
