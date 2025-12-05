package incomes;

import java.math.BigDecimal;

public class FinancDerivatives extends Income {
    
    public FinancDerivatives(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are contracts whose value depends on"
        + " the price of an underlying asset, interest rate, or"
        + " index, used by the government for hedging or"
        + " investment purposes.";
    }
}
