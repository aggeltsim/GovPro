package expenses;

import java.math.BigDecimal;

public class LoansExp54 extends Expenses {
    public LoansExp54(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " includes the outflow for paying off" +
         " short-term loans.";
    }
}
