package expenses;

import java.math.BigDecimal;

public class SocialBenefits extends Expenses {
    public SocialBenefits(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    //Getters and Setters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount=amount;
    }
    public  String getForm() {
        return form;
    }
    @Override 
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: "+ getAmount(); 
    }
    @Override
    public String toExplain() {
        return getName() + " is an expense that includes support for" 
        + " problems such as poverty, illiteracy, "
        + "unemployment and natural disasters";
    }
    
}