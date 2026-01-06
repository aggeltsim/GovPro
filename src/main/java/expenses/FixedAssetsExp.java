package expenses;

import java.math.BigDecimal;

public class FixedAssetsExp extends Expenses {
    public FixedAssetsExp(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are things that the government owns and"
        + " uses for a long time, such as buildings, land, vehicles,"
        + " and equipment. This account keeps track of the value of"
        + " these items and how they are used in government operations."
        + " In simple terms, a fixed assets account shows the government's"
        + " important property and tools that help it provide services to citizens.";
    }
}
