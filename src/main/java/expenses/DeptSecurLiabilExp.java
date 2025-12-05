package expenses;

import java.math.BigDecimal;

public class DeptSecurLiabilExp extends Expenses {
    public DeptSecurLiabilExp(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are government bonds or bills. Paying "
        + "them back is shown as an expense in the budget because"
        + "cash goes out.";
    }
}
