package entities;

import java.math.BigDecimal;

public class MinDefense extends Entity {

    public MinDefense(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " oversees the country's defense policy"
        + " and the armed forces.";
    }
}
