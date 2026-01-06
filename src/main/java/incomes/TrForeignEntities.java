package incomes;

import java.math.BigDecimal;

public class TrForeignEntities extends Transfers {
    
    public TrForeignEntities(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " is a form of  Transfers. Specifically,"
        + " they are amounts of money the government receives from"
        + " organizations, governments, or institutions outside the"
        + " country. This can include donations, grants, or financial"
        + " support for specific programs or projects. In simple terms,"
        + " a current transfers from foreign entities account"
        + " shows the money coming to Greece from abroad to help fund"
        + " government activities or public services.";
    }
}
