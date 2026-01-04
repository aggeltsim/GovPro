package entities;

import java.math.BigDecimal;


public class MinDigitalGovern extends Entity {

    public MinDigitalGovern(String code, String name, BigDecimal amount, String form) {
        super(code, name, amount, form);
    }

    @Override
    public String toExplain() {
        return "The " + getName() + " is a Greek government department"
        + " that works to make public services faster, easier, and more"
        + " modern using technology. It manages online government services,"
        + " digital records, and electronic communication between citizens"
        + " and the state. It also develops digital tools to improve"
        + " efficiency, transparency, and access to information. In"
        + " simple terms, it is the part of the government that helps"
        + " people interact with the state online and makes government"
        + " services more modern and convenient.";
    }
}
