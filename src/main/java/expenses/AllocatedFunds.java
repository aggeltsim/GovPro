package expenses;

import java.math.BigDecimal;

public class AllocatedFunds extends Expenses {
    public AllocatedFunds(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money set aside within the"
        + " government's budget for specific purposes. Each account"
        + " shows how much money is reserved for things like education,"
        + " healthcare, or public works. This money is planned in"
        + " advance and cannot be spent on other things. In simple terms,"
        + " an allocated funds account is a “special budget account”"
        + " that tracks money reserved for a particular project or government program.";
    }
}
