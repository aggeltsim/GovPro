package entities;

import java.math.BigDecimal;

public class DecAdminCrete extends Entity {

    public DecAdminCrete(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is a government authority that"
        + " represents the Greek state on the island of Crete. It"
        + " makes sure national laws are applied correctly, supervises"
        + " local authorities to ensure their decisions follow the law,"
        + " manages public land and state property, and issues permits"
        + " for areas like environmental protection, urban planning,"
        + " forests, and coastal zones. It also handles administrative"
        + " matters related to citizenship, migration, and public services."
        + " Its main job is to support local governments while protecting the"
        + " public interest.";
    }
}
