public abstract class DeptSecurLiabil extends Income {
    
    public DeptSecurLiabil(String code, String name, double amount, String form) {
        super(code, name, amount, form);
    }

    public abstract String toExplain();
    public abstract String toString();

}

public class DeptSecurLiabil extends Income {
    
}
