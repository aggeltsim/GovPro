package entities;

import java.math.BigDecimal;

public abstract class Entity {
    protected String code;
    protected String name;
    protected BigDecimal amount;
    protected String form;


    public Entity(String code, String name, BigDecimal amount, String form) {
        this.code = code;
        this.name = name;
        this.amount = amount;
        this.form = form;
    }

    //Getters and Setters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
