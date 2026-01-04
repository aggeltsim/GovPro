package entities;

import java.math.BigDecimal;

public class MinDevelopment extends Entity {

    public MinDevelopment(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is a Greek government department"
        + " that works to grow the country's economy and support"
        + " businesses. It creates policies to encourage investment,"
        + " trade, and innovation, helps small and large businesses"
        + " succeed, and promotes job creation. It also monitors markets"
        + " to ensure fair competition. In simple terms, it is the part"
        + " of the government that helps the economy grow, supports"
        + " businesses, and creates opportunities for people to work and succeed.";
    }
}
