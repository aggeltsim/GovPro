package incomes;

import java.math.BigDecimal;

public class OciFinesPenaltiesAssessments extends OtherCurIncome {

    public OciFinesPenaltiesAssessments(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + "Money that the government earns from"
        + " penalties imposed on individuals or organizations"
        + "  that violate laws or regulations.";
    }
}
    