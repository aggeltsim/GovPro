package incomes;

import java.math.BigDecimal;

public class OciReimbursements extends OtherCurIncome {

    public OciReimbursements(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + "when the government receives back"
        + " money it had previously paid for certain activities"
        + " or projects, usually because the expenses were not needed"
        + " or were overestimated. ";
    }
}
