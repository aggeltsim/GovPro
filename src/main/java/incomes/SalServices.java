package incomes;

import java.math.BigDecimal;

public class SalServices extends Sales {

    public SalServices(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is revenue the government earns from"
        + " providing services to individuals or businesses.";
    }
}
