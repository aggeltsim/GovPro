package entities;

import java.math.BigDecimal;

public class MinSocCohesFam extends Entity {

    public MinSocCohesFam(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for supporting families and promoting social"
        + " well-being. It creates policies to help children, parents,"
        + " the elderly, and vulnerable groups, and provides social"
        + " services and financial support where needed. It also works"
        + " to strengthen communities and reduce social inequalities."
        + " In simple terms, it is the part of the government that helps"
        + " families, protects people in need, and supports a fair and caring society.";
    }
}
