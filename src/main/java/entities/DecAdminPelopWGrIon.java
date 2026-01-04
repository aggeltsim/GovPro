package entities;

import java.math.BigDecimal;

public class DecAdminPelopWGrIon extends Entity {

    public DecAdminPelopWGrIon(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is a government authority that"
        + " represents the Greek state in these regions. It ensures"
        + " that national laws are followed, supervises local authorities"
        + " to make sure their decisions are legal, manages public land"
        + " and state property, and issues permits for areas like"
        + " environmental protection, urban planning, forests, and"
        + " coastal zones. It also handles administrative matters"
        + " related to citizenship, migration, and public services,"
        + " supporting local governments while protecting the public interest.";
    }

}
