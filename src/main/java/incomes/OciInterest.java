package incomes;

import java.math.BigDecimal;
public class OciInterest extends OtherCurIncome {

    public OciInterest(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is revenue the state earns"
        + " from interest on money it has lent or deposited.";
    }
}
