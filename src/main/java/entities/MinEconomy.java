package entities;

import java.math.BigDecimal;

public class MinEconomy extends Entity {

    public MinEconomy(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " handles economic policy, state budget,"
        + " taxation, and public finances.";
    }
}
