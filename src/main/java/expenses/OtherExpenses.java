package expenses;

import java.math.BigDecimal;

public class OtherExpenses extends Expenses {
    public OtherExpenses(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " includes minor expenses such as" + 
        " office supplies,minor repairs,references etc ";
    }
}
