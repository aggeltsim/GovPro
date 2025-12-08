package entities;

import java.math.BigDecimal;

public class MinTourism extends Entity {

    public MinTourism(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is responsible for tourism policy, promotion,"
        + " and development of the tourism sector.";
    }
}
