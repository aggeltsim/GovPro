package incomes;

import java.math.BigDecimal;

public class SsListed extends SecuritiesShares {

    public SsListed(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    
    @Override
    public String toExplain() {
        return getName() + " are a form of Securities Shares."
        + " Specifically, they are amounts of money the government"
        + " invests in companies whose shares are traded on the stock"
        + " market. This account tracks the value of these shares and"
        + " any income, such as dividends, they generate. In simple"
        + " terms, a listed shares account shows the government's"
        + " investments in publicly traded companies, similar to how"
        + " a person might invest in the stock market to earn returns. ";
    }
}
