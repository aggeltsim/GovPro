package incomes;

import java.math.BigDecimal;
public class SalRents extends Sales {

    public SalRents(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " is money the state earns by renting"
        + " out public buildings, spaces, or equipment.";
    }
}
