package incomes;

import java.math.BigDecimal;

public abstract class SecuritiesShares extends Income {

    public SecuritiesShares(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    public abstract String toExplain();
}
