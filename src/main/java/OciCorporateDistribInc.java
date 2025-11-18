public class OciCorporateDistribInc extends OtherCurIncome {

    public OciCorporateDistribInc(String code, String name, double amount, String form) {
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
        return getName() + "is money the state receives as dividends from companies in which it holds shares.";
    }

    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
    
}
