package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinEducatReligSportsTest {

    private MinEducatReligSports instance;
    private final String initialCode = "1020";
    private final String initialName = "Ministry of Education, Religious Affairs and";
    private final BigDecimal initialAmount = new BigDecimal("6606000000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new MinEducatReligSports(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Education & Sports";
		final BigDecimal newAmount = new BigDecimal("11500.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " oversees education, religious"
				+ " institutions, and sports policy.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
