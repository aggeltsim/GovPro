package entities;

import java.math.BigDecimal;

public class MinShipIslandPolicy extends Entity {

    public MinShipIslandPolicy(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for shipping, ports, and the development of"
        + " islands. It manages the safety of ships and sailors,"
        + " oversees maritime transport, and supports economic and"
        + " social development on the islands. It also works to protect"
        + " the seas and coastal areas. In simple terms, it is the part"
        + " of the government that takes care of shipping, keeps people"
        + " safe at sea, and supports life and growth on Greece's islands.";
    }
}
