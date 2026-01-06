package incomes;

import java.math.BigDecimal;

public class SalOther extends Sales {

    public SalOther(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government earns"
        + " from selling items or services that do not fit into the main"
        + " categories of goods or administrative services. This account"
        + " tracks miscellaneous income from various sales. In simple"
        + " terms, an other sales account shows the money the government"
        + " makes from small or unusual sales that don't belong to a specific category.";
    }
}
