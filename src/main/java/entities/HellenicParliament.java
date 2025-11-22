package entities;

import java.math.BigDecimal;

public class HellenicParliament extends Entity {

    public HellenicParliament(String code, String name, BigDecimal amount) {
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
        return getName() + "Greece’s unicameral legislative body responsible for making laws and overseeing the government.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "/n" + "Amount: " + getAmount();
    }

}
