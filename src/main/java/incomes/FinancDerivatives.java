package incomes;

import java.math.BigDecimal;

public class FinancDerivatives extends Income {
    
    public FinancDerivatives(String code, String name, BigDecimal amount, String form) {
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

    public String toExplain() {
        return getName() + " are contracts whose value depends on the price of an underlying asset, interest rate, or index, used by the government for hedging or investment purposes.";
    }

    public String toString() {
        return "Acoount: " + getName() + "\n" + "Amount: " + getAmount();
    }
    
}
