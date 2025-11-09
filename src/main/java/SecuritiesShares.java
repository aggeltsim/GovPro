public abstract class SecuritiesShares extends Income {

    public SecuritiesShares(String code, String name, double amount, String form) {
        super(code, name, amount, form);
    }

    public abstract String toExplain();

    public abstract String toString();
    }
    

