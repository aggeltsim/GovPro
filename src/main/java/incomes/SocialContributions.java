package incomes;

import java.math.BigDecimal;

public class SocialContributions extends Income{
    
    public SocialContributions(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " is a form of Social Contributions."
        + " Specifically, other social contributions are payments"
        + " made by workers or employers to support social programs"
        + " like pensions, unemployment benefits, or healthcare.";
    }
}
