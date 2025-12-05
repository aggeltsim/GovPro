package entities;

import java.math.BigDecimal;


public class RepublicPresidency extends Entity {

    public RepublicPresidency(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " refers to the President of Greece, who"
        + " represents the country and performs important ceremonial duties.";

    }
}
