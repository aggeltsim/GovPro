package incomes;

import java.math.BigDecimal;

public class TaxCapital extends Taxes {
    
    public TaxCapital(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " is a form of  Taxes. Specifically,"
        + " a capital tax is a tax the government charges on wealth or"
        + " on gains from selling assets like stocks, property, or businesses.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
}
