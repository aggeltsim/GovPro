package expenses;

import java.math.BigDecimal;

public class SecuritySharesExp extends Expenses {
    public SecuritySharesExp(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " includes expenditures of" 
        + "the government for investing purposes,"  
        + "like purchasing equity shares or investment fund units";
    }
}
