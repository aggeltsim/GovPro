package entities;

import java.math.BigDecimal;

public class HellenicParliament extends Entity {

    public HellenicParliament(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is Greece's unicameral legislative body"
        + " responsible for making laws and overseeing the government.";
    }
}
