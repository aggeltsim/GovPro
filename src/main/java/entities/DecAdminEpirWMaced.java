package entities;

import java.math.BigDecimal;

public class DecAdminEpirWMaced extends Entity {

    public DecAdminEpirWMaced(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " covers Epirus and Western Macedonia under"
        + " state-level administrative duties.";
    }
}
