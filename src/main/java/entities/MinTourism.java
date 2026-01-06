package entities;

import java.math.BigDecimal;

public class MinTourism extends Entity {

    public MinTourism(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for promoting tourism and supporting the travel"
        + " industry. It creates policies to attract visitors, develops"
        + " tourist infrastructure, and helps businesses in the tourism"
        + " sector. It also works to ensure a safe and high-quality"
        + " experience for tourists. In simple terms, it is the part"
        + " of the government that helps Greece welcome visitors,"
        + " supports tourism businesses, and makes travel enjoyable and safe.";
    }
}
