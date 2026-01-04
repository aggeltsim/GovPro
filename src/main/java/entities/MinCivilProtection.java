package entities;

import java.math.BigDecimal;

public class MinCivilProtection extends Entity {

    public MinCivilProtection(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the government department in"
        + " Greece responsible for keeping people safe. It manages the"
        + " police, fire services, and civil protection agencies,"
        + " making sure laws are enforced and emergencies are handled"
        + " quickly. It also works to prevent crime, respond to natural"
        + " disasters, and protect citizens in everyday life. In simple"
        + " terms, it is the part of the government that helps keep"
        + " everyone safe and secure.";
    }
}
