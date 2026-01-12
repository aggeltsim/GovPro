package entities;

import java.math.BigDecimal;

public class MinRuralDevelFood extends Entity {

    public MinRuralDevelFood(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is the Greek government department"
        + " responsible for farming, agriculture, and food production."
        + " It supports farmers, develops agricultural policies, and"
        + " ensures the quality and safety of food. It also works to"
        + " promote sustainable farming and improve rural communities."
        + " In simple terms, it is the part of the government that helps"
        + " farmers, protects the food we eat, and supports life in the countryside.";
    }
}
