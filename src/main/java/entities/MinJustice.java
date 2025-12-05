package entities;

import java.math.BigDecimal;

public class MinJustice extends Entity {

    public MinJustice(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " manages the judicial system, legal"
        + " framework, and human rights protection";
    }
}
