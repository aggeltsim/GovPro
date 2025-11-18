package incomes;

import java.math.BigDecimal;

public class DslLongTerm extends DeptSecurLiabil {
    
    public DslLongTerm(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " are a form of Dept Securities (Liabilities)."
        + " Specifically, they are Long-term debt securities are"
        + " government-issued financial instruments with a maturity of"
        + " more than one year, used to finance the long-term"
        + " borrowing needs of the Greek state.";
    }
    
    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
}
