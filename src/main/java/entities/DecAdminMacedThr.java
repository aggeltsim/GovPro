package entities;

import java.math.BigDecimal;

public class DecAdminMacedThr extends Entity {

    public DecAdminMacedThr(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is a government authority that"
        + " represents the Greek state in these regions. Its main job"
        + " is to make sure national laws are followed, supervise"
        + " local authorities to ensure their decisions are legal,"
        + " manage public land and state property, and issue permits"
        + " for areas like environmental protection, urban planning,"
        + " forests, and coastal zones. It also handles administrative"
        + " matters related to citizenship, migration, and public"
        + " services, supporting local governments while protecting"
        + " the public interest.";
    }
}
