package incomes;

import java.math.BigDecimal;
public class SalGoods extends Sales {

    public SalGoods(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is revenue the state receives when it sells"
        + "  physical goods, such as products or items.";
    }
}
