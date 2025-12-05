package entities;

import java.math.BigDecimal;

public class MinHealth extends Entity {

    public MinHealth(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is responsible for public health policy,"
        + " hospitals, and national healthcare services.";
    }
}
