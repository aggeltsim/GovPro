package incomes;

import java.math.BigDecimal;

public class SsUnlisted extends SecuritiesShares {

    public SsUnlisted(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    
    @Override
    public String toExplain() {
        return getName() + "are a form of Securities Shares."
        + " Specifically, they are shares of companies that the"
        + " government owns that are not on the stock market and"
        + " can not be easily sold. ";
    }
} 
