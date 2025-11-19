package incomes;

import java.math.BigDecimal;

public abstract class Sales extends Income{

    public Sales(String code,String name,BigDecimal amount,String form) {
        super(code,name,amount,form);
    }

    public abstract String toExplain();

    public abstract String toString();


}
