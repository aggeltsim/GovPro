package entities;

import java.math.BigDecimal;

public class MinRuralDevelFood extends Entity {

    public MinRuralDevelFood(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " supports farmers and ensures safe food production.";
    }
}
