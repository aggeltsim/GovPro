package entities;

import java.math.BigDecimal;

public class MinSocCohesFam extends Entity {

    public MinSocCohesFam(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is responsible for social welfare, family"
        + " policy, and vulnerable social groups.";
    }
}
