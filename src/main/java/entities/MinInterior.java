package entities;

import java.math.BigDecimal;

public class MinInterior extends Entity {

    public MinInterior(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is responsible for public administration,"
        + " local government, elections, and civil status matters.";
    }
}
