package expenses;

import java.math.BigDecimal;

public class OtherExpenses extends Expenses {
    public OtherExpenses(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " spends on items that do not fit into the main budget"
        + " categories, such as salaries, loans, or infrastructure."
        + " This account tracks miscellaneous costs, such as office"
        + " supplies, minor repairs, references etc, needed for running"
        + " government operations, programs, and services. In simple terms,"
        + " an other expenses account shows all the extra or small"
        + " government spending that doesn't belong to a specific category. such as";
    }
}
