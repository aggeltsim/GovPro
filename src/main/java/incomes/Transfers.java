package incomes;

import java.math.BigDecimal;

public abstract class Transfers extends Income{
    
    public Transfers(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    public abstract String toExplain();

    public abstract String toString();
}

