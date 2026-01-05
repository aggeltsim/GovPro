package expenses;

import java.math.BigDecimal;

public class Interests extends Expenses {
    public Interests(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " is the money the government pays on its"
        + " debts, like loans or bonds. This account shows how much"
        + " the government owes each year just for borrowing money,"
        + " separate from paying back the actual loan. In simple terms,"
        + " an interest account tracks the cost of borrowing and shows"
        + " how much the government must pay to lenders for using their money.";
    }
}
