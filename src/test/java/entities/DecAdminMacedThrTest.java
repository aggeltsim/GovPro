package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DecAdminMacedThrTest {

    private DecAdminMacedThr instance;
    private final String initialCode = "1907";
    private final String initialName = "Decentralized Administration of Macedonia - Thrace";
    private final BigDecimal initialAmount = new BigDecimal("18376000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new DecAdminMacedThr(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Macedonia Thrace Admin";
		final BigDecimal newAmount = new BigDecimal("23000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " is a regional state authority managing"
				+ " environmental, forestry, migration, and local government"
				+ " oversight for Eastern Macedonia and Thrace as well as Central Macedonia.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
