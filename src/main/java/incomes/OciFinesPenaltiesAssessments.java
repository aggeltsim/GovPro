package incomes;

import java.math.BigDecimal;

public class OciFinesPenaltiesAssessments extends OtherCurIncome {

    public OciFinesPenaltiesAssessments(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government"
        + " receives from individuals or organizations that break laws"
        + " or fail to meet legal obligations. This can include traffic"
        + " fines, tax penalties, or other official charges. In simple"
        + " terms, a fines and penalties account shows the money the"
        + " government collects as punishment or compensation when rules are not followed.";
    }
}
    