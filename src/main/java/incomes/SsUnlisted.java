package incomes;

import java.math.BigDecimal;

public class SsUnlisted extends SecuritiesShares {

    public SsUnlisted(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    //Getters and Setters
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
        return getName() + "are a form of Securities Shares. Specifically, they are shares of companies that the government owns that are not on the stock market and cannot be easily sold. ";

    }
    @Override
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }



} 
