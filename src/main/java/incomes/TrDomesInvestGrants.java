package incomes;

import java.math.BigDecimal;

public class TrDomesInvestGrants extends Transfers {
    
    public TrDomesInvestGrants(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " is a form of Transfers. Specifically, it is"
        + " money the government receives from domestic programs that"
        + " support businesses or projects, usually to encourage"
        + " investment or development.";
    }
}
