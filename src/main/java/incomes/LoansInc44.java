package incomes;

import java.math.BigDecimal;

public class LoansInc44 extends Income {

    public LoansInc44(String code, String name, BigDecimal amount, String form) {
        super(code, name,amount, form);
    }
    
    @Override
    public String toExplain() {
        return getName() + " are a form of loans. Specifically, they"
        + " refinance or repay older debt. They help the government" 
        + " manage its existing obligations by replacing short-term"
        + " or maturing debt with long-term debt.";
    }
}
