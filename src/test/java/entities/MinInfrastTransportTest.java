package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinInfrastTransportTest {

    private MinInfrastTransport instance;
    private final String initialCode = "1039";
    private final String initialName = "Ministry of Infrastructure and Transport";
    private final BigDecimal initialAmount = new BigDecimal("2694810000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new MinInfrastTransport(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Infrastructure & Transport";
		final BigDecimal newAmount = new BigDecimal("33000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " oversees public works, transportation"
				+ " networks, and infrastructure development.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
