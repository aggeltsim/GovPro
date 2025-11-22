package incomes;

import java.math.BigDecimal;
public abstract class OtherCurIncome extends Income {

    public OtherCurIncome(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    @Override
    public abstract String toExplain();
    @Override
    public abstract String toString();
    
}