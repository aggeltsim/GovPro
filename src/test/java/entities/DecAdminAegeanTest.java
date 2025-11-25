package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DecAdminAegeanTest {

    private DecAdminAegean instance;
    private final String initialCode = "1905";
    private final String initialName = "Decentralized Administration of the Aegean";
    private final BigDecimal initialAmount = new BigDecimal("6188000");
		private final String initialForm = "2025";

    
		@BeforeEach
	void setUp() {
		instance = new DecAdminAegean(initialCode, initialName, initialAmount, initialForm);
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
	void testSetNameAndAmount() {
		final String newName = "Aegean Admin";
		final BigDecimal newAmount = new BigDecimal("5000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " oversees administrative tasks for the" 
				+ " North and South Aegean regions.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		String expected = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
