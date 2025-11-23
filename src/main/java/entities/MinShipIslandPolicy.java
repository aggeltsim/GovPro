package entities;

import java.math.BigDecimal;

public class MinShipIslandPolicy extends Entity {

    public MinShipIslandPolicy(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
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

    //getters and setters for amount
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getForm() {
        return form;
    }

    @Override
    public String toExplain() {
        return getName() + " handles shipping, ports, maritime policy,"
        + " and island-related issues.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }

}
