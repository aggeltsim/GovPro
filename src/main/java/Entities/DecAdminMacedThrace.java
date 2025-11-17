package Entities;

import java.math.BigDecimal;

public class DecAdminMacedThrace extends Entity {
    public DecAdminMacedThrace(String code, String name, java.math.BigDecimal amount) {
        super(code, name, amount);
    }

    @Override
    public String toExplain() {
        return "Responsible for national defense, military forces, and defense policy.";
    }
}