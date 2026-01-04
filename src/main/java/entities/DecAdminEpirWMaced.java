package entities;

import java.math.BigDecimal;

public class DecAdminEpirWMaced extends Entity {

    public DecAdminEpirWMaced(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is a government authority that"
        + " represents the Greek state in these regions. It makes sure"
        + " national laws are followed, oversees local authorities to"
        + " ensure their decisions are legal, manages public land and"
        + " state property, and issues permits for things like environmental"
        + " protection, urban planning, forests, and coastal areas. It also"
        + " deals with administrative matters related to citizenship,"
        + " migration and public services. Its main role is to support"
        + " local governments while protecting the public interest.";
    }
}
