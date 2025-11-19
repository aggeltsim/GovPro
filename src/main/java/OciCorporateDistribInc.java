package incomes;

import java.math.BigDecimal;

public class OciCorporateDistribInc extends OtherCurIncome {

    public OciCorporateDistribInc(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    //getters and setters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public String getForm() {
        return form;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toExplain() {
        return getName() + "is money the state receives"
        + " as dividends from companies in which it holds shares.";
    }

    @Override
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
    
}
