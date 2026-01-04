package entities;

import java.math.BigDecimal;

public class GovernPresidency extends Entity {

    public GovernPresidency(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the office of the Prime"
        + " Minister in Greece. It coordinates the work of all"
        + " government ministries, sets government policies and"
        + " priorities, and ensures that laws passed by Parliament are"
        + " implemented. It also manages communication between the"
        + " government and the public, represents the government in"
        + " important meetings, and supports decision-making on national"
        + " issues. In simple terms, it is the central office that"
        + " leads and organizes the work of the whole government.";
    }
}
