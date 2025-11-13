
// Administrations shall extend Entity as that is how the Budget is splited across 
// each ministry category 
package Entities;

import java.math.BigDecimal;

public class Administrations {
    private int id;
    private String name;
    private BigDecimal amount;

    public Administrations(int id, String name, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Administrations{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}

