package incomes;

import java.math.BigDecimal;

public class LShortTerm extends LoansInc54 {

    public LShortTerm(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount,form);
    }
    
    @Override
    public String toExplain() {
        return getName() + " are a form of loans. Specifically, the"
        + " government uses these loans to pay for immediate expenses"
        + " like salaries, bills, or other urgent needs, and then"
        + " repays them quickly. ";
    }
}
