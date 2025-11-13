// upclass Entity will have subclasses (ministries and administrations)  
package Entities;

import java.math.BigDecimal;

public abstract class Entity {
    private final int id;
    private String name;
    private BigDecimal amount;

    public Entity(int id, String name, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
   
    public int getId() { return id; }
    public String getName() { return name; }
    
    //getters and setters for amount
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    // different entities will have different explanations
    public abstract String explain();

    @Override
    public String toString() {
        return String.format("[%d] %s - Amount: %.2f", id, name, amount.doubleValue());
    }
}
