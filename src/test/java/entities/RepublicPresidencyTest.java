package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class RepublicPresidencyTest {

    private RepublicPresidency instance;
    private final String initialCode = "1001";
    private final String initialName = "Presidency of the Republic";
    private final BigDecimal initialAmount = new BigDecimal("4638000");
	private final String initialForm = "Presidency";

	@BeforeEach
	void setUp() {
		instance = new RepublicPresidency(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "President Office";
		final BigDecimal newAmount = new BigDecimal("11000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " refers to the President of Greece, who"
				+ " represents the country and performs important ceremonial duties.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
