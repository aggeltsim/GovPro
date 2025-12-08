package expenses;

import java.math.BigDecimal;

public class LoansExp44 extends Expenses {
    public LoansExp44(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " includes the outflow for paying off" +
        "long-term loans.";
    }
}
