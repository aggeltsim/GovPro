public abstract class FixedAssets extends Income {
   
    public FixedAssets(String code, String name, double amount, String form) {
        super(code, name, amount, form);
    }

    public abstract String toExplain();

    public abstract String toString();
    
}
