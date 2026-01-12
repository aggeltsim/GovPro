package incomes;

import java.math.BigDecimal;

public class TrEU extends Transfers {
    
    public TrEU(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " is a form of Transfers. Specifically,"
        + " they are amounts of money the government receives from the"
        + " European Union or other EU countries to support specific"
        + " programs, projects, or general government activities. This"
        + " account tracks the funds coming from these external sources."
        + " In simple terms, a current transfers from EU organizations"
        + " and member states (revenue) account shows the money Greece"
        + " receives from the EU or other member countries to help fund"
        + " its public services and projects.";
    }
}
