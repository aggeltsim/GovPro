package expenses;

import java.math.BigDecimal;

public class AllocatedFunds extends Expenses {
    public AllocatedFunds(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are budgeted funds committed by the "
        + "government but not yet spent" 
        + " at a specific programs, recorded as future expenditure.";
    }
}
