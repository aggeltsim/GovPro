package incomes;

import java.math.BigDecimal;

public class DslLongTerm extends DeptSecurLiabil {
    
    public DslLongTerm(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government borrows"
        + " for a long period, usually more than 12 months, by issuing"
        + " bonds or other debt instruments. This account tracks the"
        + " money the government receives from investors now and promises"
        + " to pay back over time with interest. In simple terms, a"
        + " long-term debt securities account shows the government's"
        + " long-term borrowing to fund its expenses and investments,"
        + " similar to taking a long-term loan.";
    }
}
