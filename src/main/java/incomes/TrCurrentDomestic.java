package incomes;

import java.math.BigDecimal;

public class TrCurrentDomestic extends Transfers {
    
    public TrCurrentDomestic(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " is a form of  Transfers. Specifically,"
        + " money the government receives from within the country,"
        + " such as fines, fees, or repayments from public institutions.";
    }
}
