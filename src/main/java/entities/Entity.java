package entities;

import java.math.BigDecimal;

public abstract class Entitiy {
    protected String code;
    protected String name;
    protected BigDecimal amount;


    public Entity(String code, String name, BigDecimal amount) {
        this.code = code;
        this.name = name;
        this.amount = amount;
    }

    public abstract String toExplain();

    public abstract String toString();
    
}
