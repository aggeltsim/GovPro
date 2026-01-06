package entities;

import java.math.BigDecimal;

public class MinEnvirEnergy extends Entity {

    public MinEnvirEnergy(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is a Greek government department"
        + " responsible for protecting the natural environment and"
        + " managing the country's energy resources. It creates policies"
        + " to protect nature, water, and air quality, promotes renewable"
        + " energy, and oversees energy supply and sustainability. It"
        + " also sets rules for land use, construction, and environmental"
        + " protection. In simple terms, it is the part of the government"
        + " that protects nature and ensures Greece has safe, affordable,"
        + " and sustainable energy.";
    }

}
