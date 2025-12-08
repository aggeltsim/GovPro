package expenses;

import java.math.BigDecimal;

public class Valuables extends Expenses {
    public Valuables(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " includes cost for assets that are hold" 
        +  " for wealth or for cultural reasons" 
        + "like old coins,crowns, gold reserves etc.";
    }
}
