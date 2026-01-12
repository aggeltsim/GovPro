package entities;

import java.math.BigDecimal;

public class MinLaborSocSecurity extends Entity {

    public MinLaborSocSecurity(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for work, employment, and social protection."
        + " It sets rules for working conditions, wages, and workers'"
        + " rights, and manages the social security and pension systems."
        + " It also supports unemployed people and promotes equal"
        + " opportunities in the workplace. In simple terms, it is the"
        + " part of the government that protects workers, supports people"
        + " without jobs, and ensures pensions and social benefits are provided.";
    }
}
