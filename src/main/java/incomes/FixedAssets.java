package incomes;

import java.math.BigDecimal;

public class FixedAssets extends Income {
   
    public FixedAssets(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
    
    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government earns"
        + " from its long-term property or assets, such as selling"
        + " government buildings, land, vehicles, or equipment that it"
        + " no longer needs. This account tracks the income the"
        + " government receives from these assets. In simple terms, a"
        + " fixed assets (revenue) account shows the money the government"
        + " makes by using or selling its property and valuable items.";
    }
}
