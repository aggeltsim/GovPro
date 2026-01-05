package entities;

import java.math.BigDecimal;

public class MinJustice extends Entity {

    public MinJustice(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for the justice system. It oversees courts,"
        + " prisons, and legal services, and works to ensure that laws"
        + " are applied fairly and efficiently. It supports judges and"
        + " legal professionals, protects citizens' rights, and helps"
        + " improve access to justice. In simple terms, it is the part"
        + " of the government that makes sure justice is delivered and"
        + " the rule of law is respected.";
    }
}
