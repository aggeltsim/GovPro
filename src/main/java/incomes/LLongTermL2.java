package incomes;

import java.math.BigDecimal;

public class LLongTermL2 extends LoansInc54 {

    public LLongTermL2(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    
    @Override
    public String toExplain() {
        return getName() + " are a form of loans. Specifically, these" 
        + " loans are usually used to finance big investments or"
        + " projects like building roads, schools, hospitals and are"
        + " repaid gradually over many years. ";
    }
}
