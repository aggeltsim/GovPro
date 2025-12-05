package incomes;

import java.math.BigDecimal;

public abstract class Income {
    protected String code;
    protected String name;
    protected BigDecimal amount;
    protected String form;

    public Income(String code, String name, BigDecimal amount, String form) {
        this.code = code;
        this.name = name;
        this.amount = amount;
        this.form = form;


    }
    //Getters and setters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getForm() {
        return form;
    }

    public abstract String toExplain();

    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
    
}
