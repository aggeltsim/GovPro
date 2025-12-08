package entities;

import java.math.BigDecimal;

public class DecAdminPelopWGrIon extends Entity {

    public DecAdminPelopWGrIon(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " manages state competences for Peloponnese,"
     + " Western Greece & Ionian Islands.";
    }

}
