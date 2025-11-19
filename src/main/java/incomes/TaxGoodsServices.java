package incomes;

import java.math.BigDecimal;

public class TaxGoodsServices extends Taxes {
    
    public TaxGoodsServices(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " is a form of  Taxes. Specifically, a tax"
        + " on goods and services is an extra amount added to the"
        + " price when you buy something, and that money goes to the"
        + " government to help pay for public services";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
}
