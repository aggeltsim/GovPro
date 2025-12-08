package entities;

import java.math.BigDecimal;

public class MinDevelopment extends Entity {

    public MinDevelopment(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " focuses on economic growth, industry,"
        + " innovation, and investment.";
    }
}
