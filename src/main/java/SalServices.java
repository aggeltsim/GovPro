public class SalServices extends Sales {

    public SalServices(String code, String name, double amount, String form) {
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
        return getName() + "is revenue the government earns from providing services to individuals or businesses.";
    }
    
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
}
