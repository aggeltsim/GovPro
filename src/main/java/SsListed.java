public class SsListed extends SecuritiesShares {

    public SsListed(String code, String name, double amount, String form) {
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
        return getName() + " are a form of Securities. Specifically, they are revenue from shares held by the government in publicly listed companies, including dividends and other distributions received as part of the state's equity investments. ";

    }
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount(); 
    }
    
}
