package entities;

import java.math.BigDecimal;

public class MinHealth extends Entity {

    public MinHealth(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for protecting public health and providing"
        + " healthcare services. It sets health policies, oversees"
        + " hospitals and health services, and works to prevent diseases"
        + " and promote healthy living. It also ensures access to medical"
        + " care for everyone and manages responses to public health"
        + " emergencies. In simple terms, it is the part of the government"
        + " that takes care of people's health and well-being.";
    }
}
