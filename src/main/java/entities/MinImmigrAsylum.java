package entities;

import java.math.BigDecimal;

public class MinImmigrAsylum extends Entity {

    public MinImmigrAsylum(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for managing migration and asylum issues. It"
        + " handles asylum applications, supports refugees and migrants,"
        + " and manages reception and accommodation facilities. It also"
        + " works to ensure that migration is managed in an organized"
        + " and lawful way, while respecting human rights and international"
        + " rules. In simple terms, it is the part of the government that"
        + " deals with people who come to Greece seeking protection or a better life.";
    }
}
