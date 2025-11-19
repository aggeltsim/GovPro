package expenses;

import java.math.BigDecimal;

public class LoansExp54 extends Expenses {
    public LoansExp54(String code,String name,BigDecimal amount,String form) {
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
        return getName() + " includes the outflow for paying off" +
         " short-term loans.";
    }
    
}