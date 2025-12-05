package incomes;

import java.math.BigDecimal;

public class DslShortTerm extends DeptSecurLiabil {
    
    public DslShortTerm(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " are a form of Dept Securities (Liabilities)."
        + " Specifically, they are government-issued financial"
        + " instruments with a maturity of up to one year, used to"
        + " cover temporary financing needs of the Greek state.";
    }
}
