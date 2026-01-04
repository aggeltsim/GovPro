package entities;

import java.math.BigDecimal;

public class DecAdminAegean extends Entity {

    public DecAdminAegean(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }


    @Override
    public String toExplain() {
        return "The " + getName() + " is a public authority that"
        + " represents the Greek state in the Aegean islands. It"
        + " ensures that national laws are properly applied, supervises" 
        + " local governments for legality, manages public land and"
        + " state property, issues permits in areas such as environmental"
        + " protection, urban planning, forests and coastal zones, and"
        + " handles administrative matters related to citizenship and"
        + " migration. Its role is to support and control local authorities"
        + " while protecting the public interest.";
    }
}
