package entities;

import java.math.BigDecimal;

public class MinForeign extends Entity {

    public MinForeign(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " handles Greece's foreign policy,"
        + " diplomatic relations, and international cooperation.";
    }
}
