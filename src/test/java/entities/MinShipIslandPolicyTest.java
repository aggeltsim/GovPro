package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinShipIslandPolicyTest {

    private MinShipIslandPolicy instance;
    private final String initialCode = "1041";
    private final String initialName = "Ministry of Shipping and Island Policy";
    private final BigDecimal initialAmount = new BigDecimal("651864000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new MinShipIslandPolicy(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Shipping & Islands";
		final BigDecimal newAmount = new BigDecimal("9700.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " handles shipping, ports, maritime policy,"
				+ " and island-related issues.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
