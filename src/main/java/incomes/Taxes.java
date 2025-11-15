package incomes;

import java.math.BigDecimal;

public abstract class Taxes extends Income{
    
    public Taxes(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    public abstract String toExplain();

    public abstract String toString();
}
