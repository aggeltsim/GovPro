package incomes;

import java.math.BigDecimal;

public class OciNaturalResourceRent extends OtherCurIncome {

    public OciNaturalResourceRent(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government earns"
        + " from allowing others to use its natural resources, such as"
        + " land, forests, water, minerals, or offshore areas. This"
        + " account tracks the income the government receives from leasing"
        + " or granting rights to these resources. In simple terms, a"
        + " rents from natural resources account shows the money the"
        + " government makes by letting people or companies use its natural wealth.";
    }
}
