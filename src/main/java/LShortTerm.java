public class LShortTerm extends LoansInc44 {

    public LShortTerm(String code, String name, double amount, String form) {
        super(code, name, amount,form);
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
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getForm() {
        return form;
    }

    public String toExplain() {
        return getName() + " are a form of loans. Specifically, they are received by the goverment, representing borrowed funds with a repayment period typically within one year. These loans are used to finance immediate cash flow needs or short-term fiscal obligations and are recorded as projected revenue for the fiscal year. ";

    }
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
    
}
