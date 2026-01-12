package entities;

import java.math.BigDecimal;

public class MinInfrastTransport extends Entity {

    public MinInfrastTransport(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for building and maintaining the country's"
        + " infrastructure and transport systems. It plans and oversees"
        + " roads, bridges, railways, ports, and airports, and sets rules"
        + " for public transport and traffic safety. It also works to"
        + " improve mobility and connectivity for people and businesses."
        + " In simple terms, it is the part of the government that makes"
        + " sure people and goods can move safely and efficiently across the country.";
    }
}
