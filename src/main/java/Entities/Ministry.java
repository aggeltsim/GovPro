package Entities;

import java.math.BigDecimal;

public class Ministry extends Entity {
    public Ministry(int id, String name, BigDecimal amount) {
        super(id, name, amount);
    }

    @Override
    public String explain() {
        return "";
    }
}
