package entities;

import java.math.BigDecimal;

public class HellenicParliament extends Entity {

    public HellenicParliament(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek national legislature,"
        + " where elected representatives make decisions for the country."
        + " Its main jobs are to pass laws, approve the budget of the"
        + " government, control and oversee the government, and represent"
        + " the people. It also discusses important national issues and"
        + " ensures that the government acts according to the law. In"
        + " simple terms, it is the place where Greek laws are made and"
        + " where the government is held accountable to the citizens.";
    }
}
