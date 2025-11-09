public class LLongTermL2 extends LoansInc44{

    public LLongTermL2(String code, String name, double amount, String form) {
        super(code, name, amount, form);
    }

    //Getters and Setters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmoutn(double amount) {
        this.amount = amount;
    }
    public String getForm() {
        return form;
    }

    public String toExplain() {
        return getName() + " are a form of loans. Specifically, they are received or managed by the government, including repayments, restructuring, or special financing programs related to existing debt. These loans contribute to government revenue and are recorded based on actual cash flows during the fiscal year.";

    }
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }


    
}
