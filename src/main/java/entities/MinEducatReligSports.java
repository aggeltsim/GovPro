package entities;

import java.math.BigDecimal;

public class MinEducatReligSports extends Entity {

    public MinEducatReligSports(String code, String name, BigDecimal amount) {
        super(code, name, amount);
    }

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

    @Override
    public String toExplain() {
        return getName() + "Oversees education, religious institutions, and sports policy.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
}
