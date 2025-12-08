package expenses;

import java.math.BigDecimal;

public class Subsidies extends Expenses {
    public Subsidies(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " is an expense account that includes"
        +" aid for families,farmers,students,businesses and more";
    }
}
