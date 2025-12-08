package incomes;

import java.math.BigDecimal;

public abstract class LoansInc54 extends Income{
    
    public LoansInc54(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    public abstract String toExplain();
    
}
