package expenses;

import java.math.BigDecimal;

public class Purchases extends Expenses {
    public Purchases(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " is an expense account that includes " 
        + "whatever the government buys, like computers,books or "
        +"IT support,cleaning services etc";
    }
}
