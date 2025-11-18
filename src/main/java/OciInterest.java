public class OciInterest extends OtherCurIncome {

    public OciInterest(String code, String name, double amount, String form) {
        super(code, name, amount, form);
    }

    //getters and setters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public String getForm() {
        return form;
    }
    public void setAmmount(double amount) {
        this.amount = amount;
    }

    public String toExplain() {
        return getName() + " is revenue the state earns from interest on money it has lent or deposited."
    }

    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
    
}