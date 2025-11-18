public class OciFinesPenaltiesAssessments extends OtherCurIncome {

    public OciFinesPenaltiesAssessments(String code, String name, double amount, String form) {
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
        return getName() + "Money that the government earns from penalties imposed on individuals or organizations that violate laws or regulations.";
    }

    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
    
}