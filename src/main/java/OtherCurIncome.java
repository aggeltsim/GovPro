package incomes;

import java.math.BigDecimal;
public abstract class OtherCurIncome extends Income {

    public OtherCurIncome(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    public abstract String toExplain();

    public abstract String toString();
    
}
