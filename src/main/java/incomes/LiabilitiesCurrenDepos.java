package incomes;

import java.math.BigDecimal;

public class LiabilitiesCurrenDepos extends Income{

    public LiabilitiesCurrenDepos(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return getName() + " are amounts of money that the government"
        + " owes related to cash, bank accounts, or other deposits."
        + " This can include money it has received temporarily or funds"
        + " held on behalf of others that must be returned. In simple"
        + " terms, a liabilities from currency and deposits account"
        + " shows the government's obligations for money it holds or"
        + " owes, similar to tracking debts or balances in its accounts.";
    }
}
