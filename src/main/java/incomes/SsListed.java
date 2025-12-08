package incomes;

import java.math.BigDecimal;

public class SsListed extends SecuritiesShares {

    public SsListed(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    
    @Override
    public String toExplain() {
        return getName() + " are a form of Securities Shares."
        + " Specifically, they are shares of companies that the"
        + " government owns and can be sold to make money. ";
    }
}
