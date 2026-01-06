package entities;

import java.math.BigDecimal;


public class RepublicPresidency extends Entity {

    public RepublicPresidency(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the office of the President"
        + " of Greece. The President represents the country, signs laws"
        + " passed by Parliament, appoints high-ranking officials, and"
        + " ensures that the Constitution is followed. The President"
        + " also participates in important state ceremonies and"
        + " international relations. In simple terms, it is the part of"
        + " the government that represents Greece, makes sure the country's"
        + " laws and rules are respected, and acts as a symbol of national unity.";

    }
}
