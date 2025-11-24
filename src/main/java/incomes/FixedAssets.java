package incomes;

import java.math.BigDecimal;

public abstract class FixedAssets extends Income {
   
    public FixedAssets(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    @Override
    public abstract String toExplain();
    @Override
    public abstract String toString();
    
}
