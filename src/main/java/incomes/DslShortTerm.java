package incomes;

import java.math.BigDecimal;

public class DslShortTerm extends DeptSecurLiabil {
    
    public DslShortTerm(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government borrows"
        + " for a short period, usually less than 12 months, by issuing"
        + " bonds or similar debt instruments. This account tracks the"
        + " money the government receives now and must repay soon with"
        + " interest. In simple terms, a short-term debt securities"
        + " account shows the government's short-term borrowing to cover"
        + " immediate expenses or temporary funding needs, similar to"
        + " taking a short-term loan.";
    }
}
