// upclass Entity will have subclasses (ministries and administrations)  
package entities;

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
   
    

    // different entities will have different explanations
    
    public abstract String toExplain();
    @Override // because it needs to override the toString method of Object class
    public abstract String toString(); 
}
