package incomes;

import java.math.BigDecimal;

public class SalCommissions extends Sales {

    public SalCommissions(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is revenue the state collects from"
        + " small fees or percentage charges on transactions or services.";
    }
}
