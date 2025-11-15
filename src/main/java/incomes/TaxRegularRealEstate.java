package incomes;

import java.math.BigDecimal;

public class TaxRegularRealEstate extends Taxes {
    
    public TaxRegularRealEstate(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " is a form of  Taxes. Specifically, property tax on real estate is a tax homeowners pay based on the value of their land and buildings, which helps fund local services like schools and roads.";
    }

    @Override
    public String toString() {
        return "Acoount: " + getName() + "\n" + "Amount: " + getAmount();
    }

}
