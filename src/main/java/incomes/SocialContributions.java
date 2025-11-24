package incomes;

import java.math.BigDecimal;

public abstract class SocialContributions extends Income{
    
    public SocialContributions(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    public abstract String toExplain();

    public abstract String toString();
}
