package entities;

import java.math.BigDecimal;

public class MinDefense extends Entity {

    public MinDefense(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for protecting the country and its citizens."
        + " It oversees the military and ensures the safety and security"
        + " of Greece from external threats. It plans and organizes"
        + " national defense, manages the armed forces, and supports"
        + " international missions when needed. In simple terms, it is"
        + " the part of the government that keeps the country safe and"
        + " defends it from any danger.";
    }
}
