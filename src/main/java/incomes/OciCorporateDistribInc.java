package incomes;

import java.math.BigDecimal;

public class OciCorporateDistribInc extends OtherCurIncome {

    public OciCorporateDistribInc(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + "is money the state receives"
        + " as dividends from companies in which it holds shares.";
    }
}
