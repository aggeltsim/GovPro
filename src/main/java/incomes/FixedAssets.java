package incomes;

import java.math.BigDecimal;

public class FixedAssets extends Income {
   
    public FixedAssets(String code, String name, BigDecimal amount, String form) {
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
        return getName() + " This is the money the government receives when"
        + " it sells, grants, or otherwise allows the use of its"
        + "  real estate assets.";
    }

    @Override
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount();
    }
    
}
