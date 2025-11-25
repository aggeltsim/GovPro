package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DecAdminCreteTest {

    private DecAdminCrete instance;
    private final String initialCode = "1906";
    private final String initialName = "Decentralized Administration of Crete";
    private final BigDecimal initialAmount = new BigDecimal("6497000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new DecAdminCrete(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Crete Admin";
		final BigDecimal newAmount = new BigDecimal("35000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " covers the island of Crete for"
				+ " state-delegated responsibilities.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
