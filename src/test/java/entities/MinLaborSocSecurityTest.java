package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinLaborSocSecurityTest {

    private MinLaborSocSecurity instance;
    private final String initialCode = "1032";
    private final String initialName = "Ministry of Labor and Social Security";
    private final BigDecimal initialAmount = new BigDecimal("18678084000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new MinLaborSocSecurity(initialCode, initialName, initialAmount, initialForm);
	}

	@Test
	void testConstructorAndGetters() {
		assertNotNull(instance);
		assertEquals(initialCode, instance.getCode());
		assertEquals(initialName, instance.getName());
		assertEquals(initialAmount, instance.getAmount());
		assertEquals(initialForm, instance.getForm());
	}

	@Test
	void testSetters() {
		final String newName = "Labor & Social Security";
		final BigDecimal newAmount = new BigDecimal("32000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " manages labour relations, employment policy,"
				+ " and the social security system.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
