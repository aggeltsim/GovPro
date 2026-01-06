package expenses;

import java.math.BigDecimal;

public class SecuritySharesExp extends Expenses {
    public SecuritySharesExp(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " invests in stocks, shares, or investment funds. This account"
        + " tracks the value of these investments and any income or"
        + " dividends they generate. In simple terms, it is the part of"
        + " the government budget that shows the money the government"
        + " has put into companies or investment funds, with the goal"
        + " of earning returns or profits over time—similar to how a"
        + " person might invest money to grow their savings.";
    }
}
