package incomes;

import java.math.BigDecimal;

public class FixedAssets extends Income {
   
    public FixedAssets(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    
    @Override
    public String toExplain() {
        return getName() + " This is the money the government receives when"
        + " it sells, grants, or otherwise allows the use of its"
        + "  real estate assets.";
    }
}
