package entities;

import java.math.BigDecimal;

public class DecAdminThesCenGr extends Entity {

    public DecAdminThesCenGr(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is a regional state authority managing"
        + " environmental, forestry, migration, and local government"
        + " oversight in Thessaly and Central Greece.";
    }
}
