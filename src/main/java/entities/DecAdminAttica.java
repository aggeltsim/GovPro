package entities;

import java.math.BigDecimal;


public class DecAdminAttica extends Entity {

    public DecAdminAttica(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is a regional state authority managing"
        + " environmental, forestry, migration, and local government"
        + " oversight in Attica.";
    }
}
