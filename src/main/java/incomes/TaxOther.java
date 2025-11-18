package incomes;

import java.math.BigDecimal;

public class TaxOther extends Taxes {
    
    public TaxOther(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " is a form of  Taxes. Specifically, other"
        + " taxes are additional charges the government collects on"
        + " specific activities or items—such as fuel, vehicles, or"
        + " certain behaviors—to raise money or guide how people use those things.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
}
