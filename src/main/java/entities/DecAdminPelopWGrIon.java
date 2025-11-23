package entities;

import java.math.BigDecimal;

public class DecAdminPelopWGrIon extends Entity {

    public DecAdminPelopWGrIon(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    //Getters and Setters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getters and setters for amount
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
        return getName() + " manages state competences for Peloponnese,"
     + " Western Greece & Ionian Islands.";
    }

    @Override
    public String toString() {
        return "Account: " + getName() + "\n" + "Amount: " + getAmount();
    }

}
