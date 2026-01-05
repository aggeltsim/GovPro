package expenses;

import java.math.BigDecimal;

public class Subsidies extends Expenses {
    public Subsidies(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " gives to support businesses, organizations, or citizens for"
        + " specific purposes. This can include help for farmers,"
        + " companies, students, or energy costs. The account tracks"
        + " how much the government spends to encourage certain activities"
        + " or reduce costs for people. In simple terms, a subsidies"
        + " account shows the money the government spends to help others"
        + " and make certain services or products more affordable.";
    }
}
