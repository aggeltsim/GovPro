package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DecAdminPelopWGrIonTest {

    private DecAdminPelopWGrIon instance;
    private final String initialCode = "1904";
    private final String initialName = "Decentralized Administration of Peloponnese -";
    private final BigDecimal initialAmount = new BigDecimal("14918000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new DecAdminPelopWGrIon(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Peloponnese Admin";
		final BigDecimal newAmount = new BigDecimal("19000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " manages state competences for Peloponnese,"
				+ " Western Greece & Ionian Islands.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
