package incomes;

import java.math.BigDecimal;

public class ScOther extends SocialContributions {
    
    public ScOther(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " is a form of  Social Contributions. Specifically, other social contributions are payments made by workers or employers to support social programs like pensions, unemployment benefits, or healthcare.";
    }

    @Override
    public String toString() {
        return "Acoount: " + getName() + "\n" + "Amount: " + getAmount();
    }

}

