package Entities;
public class MinHealth extends Ministry {
    public MinHealth(String code, String name, java.math.BigDecimal amount) {
        super(code, name, amount);
    }

    @Override
    public String toExplain() {
        return "Responsible for healthcare, hospitals, EODY, public health policy.";
    }

}
