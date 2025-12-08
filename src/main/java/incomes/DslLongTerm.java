package incomes;

import java.math.BigDecimal;

public class DslLongTerm extends DeptSecurLiabil {
    
    public DslLongTerm(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are a form of Dept Securities (Liabilities)."
        + " Specifically, they are Long-term debt securities are"
        + " government-issued financial instruments with a maturity of"
        + " more than one year, used to finance the long-term"
        + " borrowing needs of the Greek state.";
    }
}
