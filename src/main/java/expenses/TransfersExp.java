package expenses;

import java.math.BigDecimal;

public class TransfersExp extends Expenses {
    public TransfersExp(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " includes the payments the government" 
        + "makes which do not produce something directly" 
        + " i.g. expenditures for the protection of the environment" 
        + "or for information campaigns. ";
    }
}
