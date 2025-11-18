package incomes;

import java.math.BigDecimal;

public class TrForeignEntities extends Transfers {
    
    public TrForeignEntities(String code, String name, BigDecimal amount, String form) {
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
        + " money the government receives from other countries or"
        + " international organizations, like aid, loans, or grants.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
}
