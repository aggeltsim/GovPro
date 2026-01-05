package incomes;

import java.math.BigDecimal;
public class SalGoods extends Sales {

    public SalGoods(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money the government"
        + " receives from selling products or items it produces or owns."
        + " This can include things like publications, materials, or"
        + " other goods provided by government agencies. In simple"
        + " terms, a sales of goods account shows the money the"
        + " government earns by selling goods to citizens, businesses,"
        + " or other organizations.";
    }
}
