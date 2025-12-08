package incomes;

import java.math.BigDecimal;

public class TaxDutiesOnImports extends Taxes {
    
    public TaxDutiesOnImports(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

   
    @Override
    public String toExplain() {
        return getName() + " is a form of  Taxes. Specifically, import"
        + " duties are taxes charged on goods brought into a country," 
        + " added to their cost to protect local industries and raise"
        + " money for the government.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
}
