package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinClimateCrisisTest {

    private MinClimateCrisis instance;
    private final String initialCode = "1060";
    private final String initialName = "Ministry of Climate Crisis and Civil Protection";
    private final BigDecimal initialAmount = new BigDecimal("1221116000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new MinClimateCrisis(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Climate Crisis Ministry";
		final BigDecimal newAmount = new BigDecimal("9500.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " handles natural disaster management,"
				+ " civil protection, and climate-related risk response.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
