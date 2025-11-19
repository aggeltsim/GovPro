package incomes;

import java.math.BigDecimal;

public class SalServices extends Sales {

    public SalServices(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " is revenue the government earns from"
        + " providing services to individuals or businesses.";
    }
    
    @Override
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
}
