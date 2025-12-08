package entities;

import java.math.BigDecimal;

public class MinLaborSocSecurity extends Entity {

    public MinLaborSocSecurity(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " manages labour relations, employment policy,"
        + " and the social security system.";
    }
}
