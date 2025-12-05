package expenses;

import java.math.BigDecimal;

public class EmployeeBenefits extends Expenses {
    public EmployeeBenefits(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " is an expense that includes salaries"
         + ",bonuses,health insurance,food support and paid leaves"
         + "for the employees";
    }
}
