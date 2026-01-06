package incomes;

import java.math.BigDecimal;

public class TaxIncome extends Taxes {
    
    public TaxIncome(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " is a form of  Taxes. Specifically,"
        + " they are amounts of money the government collects from"
        + " individuals or businesses based on the money they earn."
        + " This includes wages, salaries, profits, or other types of"
        + " income. In simple terms, an income taxes account shows the"
        + " money the government receives from people and companies for"
        + " the income they earn, which is used to fund public services and programs.";
    }
}
