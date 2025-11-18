public class SalAdministFees extends Sales {

    public SalAdministFees(String code, String name, double amount, String form) {
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
        return getName() + " is money the state receives for issuing documents, permits, or other administrative actions."
    }

    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
    
}
