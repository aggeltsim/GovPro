package expenses;

import java.math.BigDecimal;

public class Purchases extends Expenses {
    public Purchases(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " spends to buy things it needs to operate, such as office"
        + " supplies, equipment, vehicles, or professional services."
        + " This account tracks the cost of goods and services required"
        + " for public administration and government programs. In simple"
        + " terms, a purchases of goods and services account shows the"
        + " money the government spends to get the items and services it"
        + " needs to serve citizens.";
    }
}
