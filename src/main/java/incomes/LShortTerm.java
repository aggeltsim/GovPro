package incomes;

import java.math.BigDecimal;

public class LShortTerm extends LoansInc54 {

    public LShortTerm(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount,form);
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
        return getName() + " are a form of loans. Specifically, the"
        + " government uses these loans to pay for immediate expenses"
        + " like salaries, bills, or other urgent needs, and then"
        + " repays them quickly. ";
    }

    @Override
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
}
