package incomes;

import java.math.BigDecimal;

public class SsListed extends SecuritiesShares {

    public SsListed(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    //Getters and setters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getForm() {
        return form;
    }
    @Override
    public String toExplain() {
        return getName() + " are a form of Securities Shares. Specifically, they are shares of companies that the government owns and can be sold to make money. ";

    }
    @Override
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount(); 
    }
    
}
