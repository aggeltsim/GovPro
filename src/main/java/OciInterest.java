package incomes;

import java.math.BigDecimal;
public class OciInterest extends OtherCurIncome {

    public OciInterest(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " is revenue the state earns"
        + " from interest on money it has lent or deposited.";
    }

    @Override
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
    
}