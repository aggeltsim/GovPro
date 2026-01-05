package expenses;

import java.math.BigDecimal;

public class DeptSecurLiabilExp extends Expenses {
    public DeptSecurLiabilExp(String code,String name,BigDecimal amount,String form) {
        super(code, name, amount, form);
    }
    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " owes to others, such as loans, bonds, or unpaid bills."
        + " This account keeps track of all the government's legal"
        + " responsibilities to pay money in the future. In simple terms,"
        + " a debt obligations account shows how much the government"
        + " must pay to creditors or other parties and helps manage"
        + " the country's financial responsibilities.";
    }
}
