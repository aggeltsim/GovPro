package incomes;

import java.math.BigDecimal;

public class FinancDerivatives extends Income {
    
    public FinancDerivatives(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are contracts or instruments the government"
        + " uses to manage financial risks, such as changes in interest"
        + " rates, exchange rates, or the price of commodities. This"
        + " account tracks the gains or losses from these contracts. In"
        + " simple terms, a financial derivatives account shows the"
        + " government's use of special financial tools to protect"
        + " its money and budget from unexpected changes in the market.";
    }
}
