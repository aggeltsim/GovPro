public abstract class Income {
    protected String code;
    protected String name;
    protected double amount;
    protected String form;

    public Income(String code, String name, double amount, String form) {
        this.code = code;
        this.name = name;
        this.amount = amount;
        this.form = form;


    }

    public abstract String toExplain();

    public abstract String toString();
    
}
