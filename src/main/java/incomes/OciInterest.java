package incomes;

import java.math.BigDecimal;
public class OciInterest extends OtherCurIncome {

    public OciInterest(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is money the government earns from lending"
        + " funds, deposits, or other investments. This account tracks"
        + " the income the government receives as interest over time."
        + " In simple terms, an interest (revenue) account shows the"
        + " money the government makes from lending or investing money,"
        + " similar to the interest a person earns from a bank savings account.";
    }
}
