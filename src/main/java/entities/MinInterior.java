package entities;

import java.math.BigDecimal;

public class MinInterior extends Entity {

    public MinInterior(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for public administration and local government."
        + " It oversees municipalities and regions, manages civil"
        + " registries and elections, and ensures that public services"
        + " work properly for citizens. It also develops policies to"
        + " improve public administration and strengthen local governance."
        + " In simple terms, it is the part of the government that"
        + " organizes how the state works with citizens at the local"
        + " level and supports everyday public services.";
    }
}
