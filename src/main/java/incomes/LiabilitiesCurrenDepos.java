package incomes;

import java.math.BigDecimal;

public class LiabilitiesCurrenDepos extends Income{

    public LiabilitiesCurrenDepos(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    //Getters & Setters
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
        return getName() + " are the government's obligations arising"
        + " from the issuance of currency and the holding of deposits"
        + " by other sectors.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }
}
