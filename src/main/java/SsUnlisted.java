public class SsUnlisted extends SecuritiesShares {

    public SsUnlisted(String code, String name, double amount, String form) {
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
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getForm() {
        return form;
    }

    public String toExplain() {
        return getName() + "are a form of Securities. Specifically, they are a revenue from shares held by the government in companies that are not publicly listed on a stock exchange, including dividends and other distributions received as part of the state's equity investments in private or non-listed entities. ";

    }
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }



} 
