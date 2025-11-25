package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinForeignTest {

    private MinForeign instance;
    private final String initialCode = "1009";
    private final String initialName = "Ministry of Foreign Affairs";
    private final BigDecimal initialAmount = new BigDecimal("420237000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new MinForeign(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Foreign Affairs";
		final BigDecimal newAmount = new BigDecimal("35000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " handles Greece's foreign policy,"
				+ " diplomatic relations, and international cooperation.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
