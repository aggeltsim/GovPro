package incomes;

import java.math.BigDecimal;

public class DeptSecurities extends Income {
    

    public DeptSecurities(String code,String name, BigDecimal amount,String form) {
        super(code,name,amount, form);

    }
    
    @Override
    public String toExplain() {
        return getName() + " are a form of income for the government."
        + " When the government does not have enough money to pay for"
        + " everything it plans—such as public services, investments,"
        + " or running costs—it issues debt securities, like bonds, to"
        + " raise funds from investors. Investors give money to the"
        + " government now, and the government promises to pay it back"
        + " later with interest. In simple terms, a debt securities"
        + " account shows the money the government receives by borrowing"
        + " through bonds or similar financial tools to cover its needs.";
    }
    
}
