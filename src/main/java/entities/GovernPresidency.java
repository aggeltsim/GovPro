package entities;

import java.math.BigDecimal;

public class GovernPresidency extends Entity {

    public GovernPresidency(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is the central office supporting the"
        + " Prime Minister in coordinating government policy and administration.";
    }
}
