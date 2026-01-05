package entities;

import java.math.BigDecimal;

public class MinForeign extends Entity {

    public MinForeign(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for managing Greece’s relations with other"
        + " countries. It represents Greece abroad, conducts diplomacy,"
        + " and works to protect Greek citizens and interests overseas."
        + " It also handles international agreements, promotes cooperation"
        + " with other countries, and supports peace and stability."
        + " In simple terms, it is the part of the government that deals"
        + " with other countries and represents Greece on the international stage.";
    }
}
