package incomes;

import java.math.BigDecimal;

public class OciNaturalResourceRent extends OtherCurIncome {

    public OciNaturalResourceRent(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    //getters and setters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public String getForm() {
        return form;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toExplain() {
        return getName() + " are payments for the use of natural"
        + " resources owned by the government like land, oil, or minerals.";
    }

    @Override
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
    
}
