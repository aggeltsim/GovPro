package entities;

import java.math.BigDecimal;

public class DecAdminCrete extends Entity {

    public DecAdminCrete(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " covers the island of Crete for"
        + " state-delegated responsibilities.";
    }
}
