package incomes;

import java.math.BigDecimal;

public class TaxIncome extends Taxes {
    
    public TaxIncome(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " is a form of  Taxes. Specifically, an"
        + " income tax is money people and businesses pay to the"
        + " government based on the money they earn.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
}
