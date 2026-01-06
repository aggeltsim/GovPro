package expenses;

import java.math.BigDecimal;

public class EmployeeBenefits extends Expenses {
    public EmployeeBenefits(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " sets aside to pay for things like salaries, pensions, health"
        + " insurance, and other benefits for public employees. This"
        + " account tracks how much the government spends to support its"
        + " workers. In simple terms, an employee benefits account shows"
        + " the money reserved to pay and take care of people who work for the government.";
    }
}
