package incomes;

import java.math.BigDecimal;

public class SalServices extends Sales {

    public SalServices(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government"
        + " receives when it provides services to citizens, businesses,"
        + " or other organizations and charges a fee. This can include"
        + " things like consulting, training, technical support, or other"
        + " professional services. In simple terms, a sales of services"
        + " account shows the money the government earns by offering"
        + " services and receiving payment in return.";
    }
}
