package entities;

import java.math.BigDecimal;

public class DecAdminAegean extends Entity {

    public DecAdminAegean(String code, String name, BigDecimal amount) {
        super(code, name, amount);
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


    @Override
    public String toExplain() {
        return getName() + "Oversees administrative tasks for the North and South Aegean regions.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }

}
