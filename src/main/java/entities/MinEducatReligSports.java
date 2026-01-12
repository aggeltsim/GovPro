package entities;

import java.math.BigDecimal;

public class MinEducatReligSports extends Entity {

    public MinEducatReligSports(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return "The " + getName() + " is a Greek government department"
        + " that oversees schools, universities, and education programs"
        + " across the country. It sets educational policies, supports"
        + " teachers and students, and works to improve learning for"
        + " everyone. It also manages religious affairs, protects cultural"
        + " heritage, and promotes arts, history, and traditions. In"
        + " simple terms, it is the part of the government that helps"
        + " people learn, preserves Greece's culture, and supports"
        + " religious and cultural life.";
    }
}
