package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinImmigrAsylumTest {

    private MinImmigrAsylum instance;
    private final String initialCode = "1055";
    private final String initialName = "Ministry of Migration and Asylum";
    private final BigDecimal initialAmount = new BigDecimal("475871000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new MinImmigrAsylum(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Immigration Ministry";
		final BigDecimal newAmount = new BigDecimal("7200.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " oversees migration policy, asylum"
				+ " procedures, and refugee reception.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
