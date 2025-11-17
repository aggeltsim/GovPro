// upclass Entity will have subclasses (ministries and administrations)  
package Entities;

import java.math.BigDecimal;

public abstract class Entity {
    protected String code;
    protected String name;
    protected BigDecimal amount;

    public Entity(String code, String name, BigDecimal amount) {
        this.code = code;
        this.name = name;
        this.amount = amount;
    }
   
    public String getCode() { return code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    //getters and setters for amount
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    // different entities will have different explanations
    public abstract String toExplain();
    public abstract String toString(); 
}
