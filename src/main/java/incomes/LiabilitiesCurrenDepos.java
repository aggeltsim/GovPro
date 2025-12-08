package incomes;

import java.math.BigDecimal;

public class LiabilitiesCurrenDepos extends Income{

    public LiabilitiesCurrenDepos(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are the government's obligations arising"
        + " from the issuance of currency and the holding of deposits"
        + " by other sectors.";
    }
}
