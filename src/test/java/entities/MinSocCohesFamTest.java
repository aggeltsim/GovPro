package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinSocCohesFamTest {

    private MinSocCohesFam instance;
    private final String initialCode = "1034";
    private final String initialName = "Ministry of Social Cohesion and";
    private final BigDecimal initialAmount = new BigDecimal("3989553000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new MinSocCohesFam(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Social Cohesion";
		final BigDecimal newAmount = new BigDecimal("15000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " is responsible for social welfare, family"
				+ " policy, and vulnerable social groups.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
