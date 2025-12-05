package incomes;

import java.math.BigDecimal;

public class OciNaturalResourceRent extends OtherCurIncome {

    public OciNaturalResourceRent(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are payments for the use of natural"
        + " resources owned by the government like land, oil, or minerals.";
    }
}
