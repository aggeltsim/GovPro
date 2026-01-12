package incomes;

import java.math.BigDecimal;
public class SalRents extends Sales {

    public SalRents(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government receives"
        + " from renting out its property, such as buildings, land, or"
        + " other government-owned spaces. This account tracks the income"
        + " from these rental agreements. In simple terms, a sales of rents"
        + " account shows the money the government earns by allowing"
        + " others to use its property in exchange for rent.";
    }
}
