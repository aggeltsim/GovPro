package incomes;

import java.math.BigDecimal;

public class TrCurrentDomestic extends Transfers {
    
    public TrCurrentDomestic(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }
   
    @Override
    public String toExplain() {
        return getName() + " is a form of Transfers. Specifically,"
        + " they are amounts of money the government receives from"
        + " individuals, organizations, or local authorities within"
        + " the country without providing goods or services in return."
        + " This can include repayments, contributions, fines, fees"
        + " or other transfers made to the government. In simple terms,"
        + " a current domestic transfers (revenue) account shows the"
        + " money coming into the government from other domestic entities"
        + " that is not earned from sales or taxes.";
    }
}
