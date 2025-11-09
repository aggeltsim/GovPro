public class LLongTerm1 extends LoansInc44 {

    public LLongTerm1(String code, String name, double amount, String form) {
        super(code, name, amount, form);
    }

    //Getters and setters
    public String getCode() {
        return code;

    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getForm() {
        return form;
    }

    public String toExplain() {
        return getName() + " are a form of loans. Specifically, they are received from the goverment, representing borrowed funds intended for financing public investments or long-term projects. These are projected revenues based on new loan agreements or issuances during the fiscal year.";


    }
    public String toString() {
        return "Account : " + "\n" + "Amount : " + amount;
    }
    
}
