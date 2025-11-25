package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinDigitalGovernTest {

    private MinDigitalGovern instance;
    private final String initialCode = "1053";
    private final String initialName = "Ministry of Digital Governance";
    private final BigDecimal initialAmount = new BigDecimal("1073928000");
	private final String initialForm = "2025";

	@BeforeEach
	void setUp() {
		instance = new MinDigitalGovern(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Digital Governance";
		final BigDecimal newAmount = new BigDecimal("15000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " manages digital transformation,"
				+ " e-government services, and technology policy.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
