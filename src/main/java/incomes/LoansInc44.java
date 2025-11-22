package incomes;

import java.math.BigDecimal;

public class LoansInc44 extends Income {

    public LoansInc44(String code, String name, BigDecimal amount, String form) {
        super(code, name,amount, form);
    }
    
    //Getters and setters
    public String getCode() {
        return code;

    }
    public String getName() {
        return name;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getForm() {
        return form;
    }
    
    @Override
    public String toExplain() {
        return getName() + " are a form of loans. Specifically, they"
        + " refinance or repay older debt. They help the government" 
        + " manage its existing obligations by replacing short-term"
        + " or maturing debt with long-term debt.";
    }
    
    @Override
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
}
