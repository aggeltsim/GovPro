package incomes;

import java.math.BigDecimal;

public class TrCurrentDomestic extends Transfers {
    
    public TrCurrentDomestic(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " is a form of  Transfers. Specifically, money the government receives from within the country, such as fines, fees, or repayments from public institutions.";
    }

    @Override
    public String toString() {
        return "Acoount: " + getName() + "\n" + "Amount: " + getAmount();
    }

}
