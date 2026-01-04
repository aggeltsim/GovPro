package entities;

import java.math.BigDecimal;


public class DecAdminAttica extends Entity {

    public DecAdminAttica(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is a government authority that"
        + " represents the Greek state in the region of Attica. It"
        + " makes sure that national laws are followed, oversees local"
        + " authorities to ensure their decisions are legal, manages"
        + " state-owned land and property, and issues permits for things"
        + " like urban planning, environmental protection, and forests."
        + " It also deals with administrative matters related to citizenship,"
        + " migration, and public services. Its main role is to support"
        + " local governments while protecting the public interest.";
    }
}
