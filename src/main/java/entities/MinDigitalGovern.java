package entities;

import java.math.BigDecimal;


public class MinDigitalGovern extends Entity {

    public MinDigitalGovern(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " manages digital transformation,"
        + " e-government services, and technology policy.";
    }
}
