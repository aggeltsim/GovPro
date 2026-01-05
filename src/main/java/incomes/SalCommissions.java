package incomes;

import java.math.BigDecimal;

public class SalCommissions extends Sales {

    public SalCommissions(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government earns"
        + " by selling materials, equipment, or other items it owns."
        + " This account tracks the income from these sales. In simple"
        + " terms, a sales of supplies account shows the money the"
        + " government makes when it sells things it no longer needs"
        + " or produces for public use.";
    }
}
