package incomes;

import java.math.BigDecimal;

public class LLongTermL2 extends LoansInc54 {

    public LLongTermL2(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    //Getters and Setters
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
        return getName() + " are a form of loans. Specifically, these" 
        + " loans are usually used to finance big investments or"
        + " projects like building roads, schools, hospitals and are"
        + " repaid gradually over many years. ";
    }
    
    @Override
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
}
