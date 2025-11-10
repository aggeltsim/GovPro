public class FixedAssetsExp extends Expenses {
    public FixedAssetsExp(String code,String name,double amount,String form) {
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
        return getName() +" includes the expense for governmental real estate(land and buildings),machinery and cultural/historical assets(museums, archaeological sites etc) ";
    }
    
}