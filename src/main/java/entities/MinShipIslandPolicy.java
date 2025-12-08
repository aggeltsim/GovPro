package entities;

import java.math.BigDecimal;

public class MinShipIslandPolicy extends Entity {

    public MinShipIslandPolicy(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " handles shipping, ports, maritime policy,"
        + " and island-related issues.";
    }
}
