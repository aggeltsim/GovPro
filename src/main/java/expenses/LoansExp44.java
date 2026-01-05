package expenses;

import java.math.BigDecimal;

public class LoansExp44 extends Expenses {
    public LoansExp44(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " has borrowed from banks or other lenders. These are"
        + " long-term loans, usually with a repayment period of more"
        + " than 12 months. This account tracks the money the government"
        + " must pay back over time. In simple terms, a loans account"
        + " with code 44 shows the governments long-term borrowing obligations.";
    }
}
