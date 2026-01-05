package expenses;

import java.math.BigDecimal;

public class LoansExp54 extends Expenses {
    public LoansExp54(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " has lent to other organizations, businesses, or entities."
        + " These are also long-term loans, usually with a repayment"
        + " period of more than 12 months. This account tracks the"
        + " money going out that the government expects to receive back"
        + " in the future. In simple terms, a loans account with code"
        + " 54 shows the government's long-term lending.";
    }
}
