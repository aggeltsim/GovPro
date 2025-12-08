package incomes;

import java.math.BigDecimal;

public class TrEU extends Transfers {
    
    public TrEU(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " is a form of  Transfers. Specifically,"
        + " money the government receives from the European Union,"
        + " such as grants, subsidies, or financial support.";
    }
}
