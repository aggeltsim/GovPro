package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DecAdminAtticaTest {

    private DecAdminAttica instance;
    private final String initialCode = "1901";
    private final String initialName = "Decentralized Administration of Attica";
    private final BigDecimal initialAmount = new BigDecimal("13091000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new DecAdminAttica(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Attica Admin";
		final BigDecimal newAmount = new BigDecimal("15000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " is a regional state authority managing"
				+ " environmental, forestry, migration, and local government"
				+ " oversight in Attica.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
