package incomes;

import java.math.BigDecimal;

public class OciReimbursements extends OtherCurIncome {

    public OciReimbursements(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government receives"
        + " back after it has spent money on something. This can happen"
        + " when money was paid in advance or by mistake, or when"
        + " someone returns funds that were previously given. In simple"
        + " terms, an expense refunds account shows the money that comes"
        + " back to the government after being spent, like getting a refund for an overpayment.";
    }
}
