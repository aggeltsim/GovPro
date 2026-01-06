package incomes;

import java.math.BigDecimal;

public class TrOther extends Transfers {
    
    public TrOther(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " is a form of  Transfers. Specifically, it is"
        + " money the government receives from any other sources not"
        + " covered by domestic, EU, or foreign transfers, like"
        + " miscellaneous fees or donations. ";
    }
}
