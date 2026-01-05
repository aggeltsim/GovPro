package incomes;

import java.math.BigDecimal;

public class TaxCapital extends Taxes {
    
    public TaxCapital(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

   
    @Override
    public String toExplain() {
        return getName() + " is a form of  Taxes. Specifically,"
        + " are amounts of money the government collects from"
        + " individuals or businesses based on their assets, investments,"
        + " or wealth. This can include taxes on property, inheritance,"
        + " or large financial gains. In simple terms, a capital taxes"
        + " account shows the money the government earns from people's"
        + " or companies' wealth and investments.";
    }
}
