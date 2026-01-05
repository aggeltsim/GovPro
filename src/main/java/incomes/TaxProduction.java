package incomes;

import java.math.BigDecimal;

public class TaxProduction extends Taxes {
    
    public TaxProduction(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

   
    @Override
    public String toExplain() {
        return getName() + " is a form of  Taxes. Specifically, a"
        + " production tax is a tax placed on goods or materials as"
        + " they are made or extracted, and it helps the government"
        + " raise money while regulating certain industries.";
    }
}
