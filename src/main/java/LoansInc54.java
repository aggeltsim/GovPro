public class LoansInc54 extends Income{
    
    public LoansInc54(String code, String name, double amount, String form) {
        super(code, name, amount, form);
    }

    //Getters & Setters
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
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toExplain() {
        return getName() + " are financial liabilities arising from borrowing agreements where the government receives funds that must be repaid with interest over time.";
    }

    public String toString() {
        return "Acoount: " + getName() + "\n" + "Amount: " + getAmount();
    }
    
}
