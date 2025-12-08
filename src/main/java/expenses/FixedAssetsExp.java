package expenses;

import java.math.BigDecimal;

public class FixedAssetsExp extends Expenses {
    public FixedAssetsExp(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " includes the expense for governmental "
        + "real estate(land and buildings),machinery and "
        + "cultural/historical assets(museums, archaeological sites"
        +" etc) ";
    }
}
