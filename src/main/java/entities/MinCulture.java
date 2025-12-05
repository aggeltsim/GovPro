package entities;

import java.math.BigDecimal;

public class MinCulture extends Entity {

    public MinCulture(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + "is responsible for cultural heritage, the"
        + " arts, and cultural promotion.";
    }
}
