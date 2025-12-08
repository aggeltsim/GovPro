package incomes;

import java.math.BigDecimal;

public class TrEUInvestGrants extends Transfers {
    
    public TrEUInvestGrants(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " is a form of  Transfers. Specifically,"
        + " money the government receives from the European Union"
        + " specifically to support investments in"
        + " projects, businesses, or infrastructure.";
    }
}
