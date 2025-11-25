package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinEnvirEnergyTest {

    private MinEnvirEnergy instance;
    private final String initialCode = "1031";
    private final String initialName = "Ministry of Environment and Energy";
    private final BigDecimal initialAmount = new BigDecimal("2341227000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new MinEnvirEnergy(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Environment & Energy";
		final BigDecimal newAmount = new BigDecimal("17000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " oversees environmental protection, energy"
				+ " policy, and natural resources.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
