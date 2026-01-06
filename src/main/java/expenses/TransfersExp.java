package expenses;

import java.math.BigDecimal;

public class TransfersExp extends Expenses {
    public TransfersExp(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " gives to other organizations, local authorities, or"
        + " individuals without receiving goods or services in return."
        + " This can include funding for municipalities, grants to"
        + " public institutions, or social aid programs. In simple terms,"
        + " a transfers account shows the money the government spends"
        + " to support others and help them carry out activities or"
        + " provide services, without expecting direct payment back.";
    }
}
