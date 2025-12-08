package entities;

import java.math.BigDecimal;

public class MinEducatReligSports extends Entity {

    public MinEducatReligSports(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " oversees education, religious"
        + " institutions, and sports policy.";
    }
}
