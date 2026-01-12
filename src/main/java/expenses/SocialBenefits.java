package expenses;

import java.math.BigDecimal;

public class SocialBenefits extends Expenses {
    public SocialBenefits(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " spends to support citizens in need. This includes pensions,"
        + " unemployment benefits, family allowances, healthcare support,"
        + " and aid for vulnerable groups. This account tracks the"
        + " government's spending on programs that help people live"
        + " safely and with dignity. In simple terms, a social benefits"
        + " account shows the money the government uses to take care of"
        + " its citizens and provide financial or social support when needed.";
    }
}
