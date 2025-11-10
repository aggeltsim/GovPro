package incomes;

import java.math.BigDecimal;

public class DeptSecurities extends Income {
    

    public DeptSecurities(String code,String name, BigDecimal amount,String form) {
        super(code,name,amount, form);

    }
//Getters and setters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getForm() {
        return form;
    }
    @Override
    public String toExplain() {
        return getName() + "are a form of Income. Specifically, when the government can't pay for everything it plans (services, investments, running costs), it issues these debt securities to raise funds.";

 
    }
    @Override 
    public String toString() {
        return "Account : " + getName() + "\n" + "Amount : " + getAmount(); 
    }






    
}
