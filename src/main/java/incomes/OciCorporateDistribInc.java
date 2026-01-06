package incomes;

import java.math.BigDecimal;

public class OciCorporateDistribInc extends OtherCurIncome {

    public OciCorporateDistribInc(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is money that the government receives from"
        + " companies when they share profits with their shareholders,"
        + " such as dividends. This account tracks the income that"
        + " comes to the state from these corporate profit distributions."
        + " In simple terms, a distributed corporate income account"
        + " shows the money the government earns from companies giving"
        + " out part of their profits.";
    }
}
