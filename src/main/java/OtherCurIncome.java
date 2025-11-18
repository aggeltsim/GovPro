public abstract class OtherCurIncome extends Income {

    public OtherCurIncome(String code, String name, double amount, String form) {
        super(code, name, amount, form);
    }

    public abstract String toExplain();

    public abstract String toString();
    
}
