package entities;

import java.math.BigDecimal;

public class MinCulture extends Entity {

    public MinCulture(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is a Greek government department"
        + " that takes care of the country's cultural heritage and"
        + " artistic life. It protects historic sites, museums, monuments,"
        + " and archaeological areas, and supports arts, music, theater,"
        + " and literature. It also promotes Greek culture both in"
        + " Greece and abroad. In simple terms, it is the part of the"
        + " government that preserves Greece's history and culture and"
        + " helps people enjoy and learn from it.";
    }
}
