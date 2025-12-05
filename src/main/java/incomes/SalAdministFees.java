package incomes;

import java.math.BigDecimal;

public class SalAdministFees extends Sales {

    public SalAdministFees(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is money the state receives for"
        + " issuing documents, permits, or other administrative actions.";
    }
}
