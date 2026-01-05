package incomes;

import java.math.BigDecimal;

public class SalAdministFees extends Sales {

    public SalAdministFees(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government receives"
        + " when it charges for administrative services it provides."
        + " This can include fees for issuing permits, certificates,"
        + " licenses, or other official documents. In simple terms, a"
        + " sales of administrative fees account shows the money the"
        + " government earns from the services it provides to citizens and businesses.";
    }
}
