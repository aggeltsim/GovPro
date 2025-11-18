package entities;

import java.math.BigDecimal;

public class MinSocCohesFam extends Entity {
    public MinSocCohesFam(String code, String name, BigDecimal amount) {
        super(code, name, amount);
    }
    public String getCode() { return code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    //getters and setters for amount
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    @Override
    public String toExplain() {
        return "Responsible for national defense, military forces, and defense policy.";
    }
    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: "+ getAmount(); 
    }


}
