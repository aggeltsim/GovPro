public class OciNaturalResourceRent extends OtherCurIncome {

    public OciNaturalResourceRent(String code, String name, double amount, String form) {
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
        return getName() + " are payments for the use of natural resources owned by the government like land, oil, or minerals.";
    }

    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
    
}
