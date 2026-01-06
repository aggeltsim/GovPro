package incomes;

import java.math.BigDecimal;

public class SsUnlisted extends SecuritiesShares {

    public SsUnlisted(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    
    @Override
    public String toExplain() {
        return getName() + " are a form of Securities Shares."
        + " Specifically, they are amounts of money the government"
        + " invests in companies whose shares are not traded on the"
        + " stock market. This account tracks the value of these shares"
        + " and any income, such as dividends, they generate. In simple"
        + " terms, an unlisted shares account shows the government's"
        + " investments in private companies, similar to how a person"
        + " might invest directly in a business instead of buying"
        + " stock on the stock market. ";
    }
} 
