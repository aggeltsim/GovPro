package incomes;

import java.math.BigDecimal;

public class SalOther extends Sales {

    public SalOther(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is revenue from various other small" 
        + " sales activities that don’t fall under the main categories.";
    }
}
