package incomes;

import java.math.BigDecimal;

public class DeptSecurities extends Income {
    

    public DeptSecurities(String code,String name, BigDecimal amount,String form) {
        super(code,name,amount, form);

    }
    
    @Override
    public String toExplain() {
        return getName() + "are a form of Income. Specifically, when"
        + " the government can't pay for everything it plans"
        + " (services, investments, running costs), it issues these debt"
        + " securities to raise funds.";
    }
    
}
