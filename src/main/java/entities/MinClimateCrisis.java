package entities;

import java.math.BigDecimal;

public class MinClimateCrisis extends Entity {

    public MinClimateCrisis(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is a Greek government department"
        + " that focuses on keeping people safe from natural disasters"
        + " and climate-related risks. It plans and coordinates emergency"
        + " responses to floods, fires, storms, and other dangers, and"
        + " works to prevent or reduce their impact. It also develops"
        + " policies to deal with climate change and protect the"
        + " environment. In simple terms, it is the part of the government"
        + " that helps protect citizens and the country from disasters"
        + " and the effects of climate change.";
    }
}
