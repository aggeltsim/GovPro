package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DecAdminThesCenGrTest {

    private DecAdminThesCenGr instance;
    private final String initialCode = "1902";
    private final String initialName = "Decentralized Administration of Thessaly - Central Greece";
    private final BigDecimal initialAmount = new BigDecimal("10579000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new DecAdminThesCenGr(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Thessaly Central Admin";
		final BigDecimal newAmount = new BigDecimal("21500.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " is a regional state authority managing"
				+ " environmental, forestry, migration, and local government"
				+ " oversight in Thessaly and Central Greece.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
