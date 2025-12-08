package entities;

import java.math.BigDecimal;

public class MinImmigrAsylum extends Entity {

    public MinImmigrAsylum(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " oversees migration policy, asylum"
        + " procedures, and refugee reception.";
    }
}
