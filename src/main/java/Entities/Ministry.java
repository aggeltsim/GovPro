package entities;

import java.math.BigDecimal;

public class Ministry extends Entity {
    public Ministry(String code, String name, BigDecimal amount) {
        super(code, name, amount);
    }

    @Override
    public String toExplain() {
        return "";
    }

    @Override
    public String toString() {
        return toExplain();
    }
}
