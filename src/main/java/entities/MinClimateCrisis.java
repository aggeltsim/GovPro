package entities;

import java.math.BigDecimal;

public class MinClimateCrisis extends Entity {

    public MinClimateCrisis(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " handles natural disaster management,"
        + " civil protection, and climate-related risk response.";
    }
}
