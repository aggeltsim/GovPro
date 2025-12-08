package entities;

import java.math.BigDecimal;

public class MinCivilProtection extends Entity {

    public MinCivilProtection(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is responsible for public order, policing,"
        + " and internal security.";
    }
}
