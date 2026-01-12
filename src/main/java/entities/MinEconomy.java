package entities;

import java.math.BigDecimal;

public class MinEconomy extends Entity {

    public MinEconomy(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government"
        + " department that manages the country's money and budget."
        + " It collects taxes, plans how public money is spent, manages"
        + " government debt, and makes sure the economy runs smoothly."
        + " It also creates financial rules and policies to support"
        + " growth and stability. In simple terms, it is the part of"
        + " the government that takes care of Greece's money, pays for"
        + " public services, and keeps the economy healthy.";
    }
}
