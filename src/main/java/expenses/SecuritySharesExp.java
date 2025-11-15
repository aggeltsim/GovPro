package expenses;

public class SecuritySharesExp extends Expenses {
    public SecuritySharesExp(String code,String name,double amount,String form) {
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
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
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
        return getName() + "includes expenditures of the government for investing purposes, like purchasing equity shares or investment fund units";
    }
    
}