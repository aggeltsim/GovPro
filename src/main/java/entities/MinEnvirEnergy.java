package entities;

import java.math.BigDecimal;

public class MinEnvirEnergy extends Entity {

    public MinEnvirEnergy(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " oversees environmental protection, energy"
        + " policy, and natural resources.";
    }

}
