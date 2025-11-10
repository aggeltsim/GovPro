package incomes;

import java.math.BigDecimal;

public class DslShortTerm extends DeptSecurLiabil {
    
    public DslShortTerm(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " are a form of Dept Securities (Liabilities). Specifically, they are government-issued financial instruments with a maturity of up to one year, used to cover temporary financing needs of the Greek state.";
    }

    @Override
    public String toString() {
        return "Acoount: " + getName() + "\n" + "Amount: " + getAmount();
    }

}
