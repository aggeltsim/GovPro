package entities;

import java.math.BigDecimal;

public class DecAdminAegean extends Entity {

    public DecAdminAegean(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }


    @Override
    public String toExplain() {
        return getName() + " oversees administrative tasks for the" 
        + " North and South Aegean regions.";
    }
}
