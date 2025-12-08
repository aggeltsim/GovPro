package entities;

import java.math.BigDecimal;

public class MinInfrastTransport extends Entity {

    public MinInfrastTransport(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " oversees public works, transportation"
        + " networks, and infrastructure development.";
    }
}
