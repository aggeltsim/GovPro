package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class GovernPresidencyTest {

    private GovernPresidency instance;
    private final String initialCode = "1004";
    private final String initialName = "Presidency of the Government";
    private final BigDecimal initialAmount = new BigDecimal("41689000");
	private final String initialForm = "Presidency";

	@BeforeEach
	void setUp() {
		instance = new GovernPresidency(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Gov Presidency";
		final BigDecimal newAmount = new BigDecimal("55000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " is the central office supporting the"
				+ " Prime Minister in coordinating government policy and administration.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
