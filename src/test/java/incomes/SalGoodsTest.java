package incomes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class SalGoodsTest {

    @Test
    void testConstructorAndGetters() {
        BigDecimal amount = new BigDecimal("1200.00");
        SalGoods sale = new SalGoods("SALG001", "Product Sales", amount, "Fixed");

        assertEquals("SALG001", sale.getCode());
        assertEquals("Product Sales", sale.getName());
        assertEquals(amount, sale.getAmount());
        assertEquals("Fixed", sale.getForm());
    }

    @Test
    void testSetAmount() {
        SalGoods sale = new SalGoods("SALG002", "Item Sales", new BigDecimal("800"), "Variable");
        BigDecimal newAmount = new BigDecimal("950.50");
        sale.setAmount(newAmount);
        assertEquals(newAmount, sale.getAmount());
    }

    @Test
    void testToString() {
        SalGoods sale = new SalGoods("SALG003", "Goods Sales", new BigDecimal("2000"), "Fixed");
        String expected = "Account : Goods Sales\nAmount : 2000";
        assertEquals(expected, sale.toString());
    }

    @Test
    void testToExplain() {
        SalGoods sale = new SalGoods("SALG004", "Merchandise Sales", new BigDecimal("1500"), "Fixed");
        String explanation = sale.toExplain();
        assertTrue(explanation.contains("Merchandise Sales") || explanation.contains("revenue the state receives"));
    }
}

