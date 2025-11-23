package entities;

import java.math.BigDecimal;


public class RepublicPresidency extends Entity {

    public RepublicPresidency(String code, String name, BigDecimal amount) {
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
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }

    @Override
    public String toExplain() {
        return getName() + "The President of Greece, who represents the country and performs important ceremonial duties.";

    }

}
