package incomes;

import java.math.BigDecimal;

public class TrForeignEntities extends Transfers {
    
    public TrForeignEntities(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " is a form of  Transfers. Specifically,"
        + " money the government receives from other countries or"
        + " international organizations, like aid, loans, or grants.";
    }
}
