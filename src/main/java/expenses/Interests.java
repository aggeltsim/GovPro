package expenses;

import java.math.BigDecimal;

public class Interests extends Expenses {
    public Interests(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " is the cost that the government has " + 
        "to pay to the lenders ,anually,when it borrows money.";
    }
}
