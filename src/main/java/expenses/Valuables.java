package expenses;

import java.math.BigDecimal;

public class Valuables extends Expenses {
    public Valuables(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are items of value that the government"
        + " owns, such as gold, silver, jewelry, or other precious"
        + " materials. This account tracks the government's possession"
        + " and management of these items. In simple terms, a valuables"
        + " account shows the government's property that has significant"
        + " worth, similar to a person keeping valuable items safe for the future.";
    }
}
