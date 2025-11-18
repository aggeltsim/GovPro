package incomes;

import java.math.BigDecimal;

public class TrEUInvestGrants extends Transfers {
    
    public TrEUInvestGrants(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    //Getters & Setters
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
        return getName() + " is a form of  Transfers. Specifically,"
        + " money the government receives from the European Union"
        + " specifically to support investments in"
        + " projects, businesses, or infrastructure.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
}
