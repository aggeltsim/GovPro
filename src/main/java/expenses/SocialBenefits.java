package expenses;

import java.math.BigDecimal;

public class SocialBenefits extends Expenses {
    public SocialBenefits(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " is an expense that includes support for" 
        + " problems such as poverty, illiteracy, "
        + "unemployment and natural disasters";
    }
}
