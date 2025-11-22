package expenses;

import java.math.BigDecimal;

public abstract class Expenses {
    protected String code;
    protected String name;
    protected BigDecimal amount;
    protected String form;
    
    public Expenses(String code, String name, BigDecimal amount, 
    String form) {
        this.code = code;
        this.name = name;
        this.amount = amount;
        this.form = form;


    }
    public abstract String toExplain();  
    public abstract String toString(); 
}
