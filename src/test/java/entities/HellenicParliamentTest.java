package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class HellenicParliamentTest {

    private HellenicParliament instance;
    private final String initialCode = "1003";
    private final String initialName = "Hellenic Parliament";
    private final BigDecimal initialAmount = new BigDecimal("171950000");
	private final String initialForm = "Parliament";

	@BeforeEach
	void setUp() {
		instance = new HellenicParliament(initialCode, initialName, initialAmount, initialForm);
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
		final String newName = "Greek Parliament";
		final BigDecimal newAmount = new BigDecimal("76000.00");
		instance.setName(newName);
		instance.setAmount(newAmount);
		assertEquals(newName, instance.getName());
		assertEquals(newAmount, instance.getAmount());
	}

	@Test
	void testToExplain() {
		String expected = initialName + " is Greece's unicameral legislative body"
				+ " responsible for making laws and overseeing the government.";
		assertEquals(expected, instance.toExplain());
	}

	@Test
	void testToString() {
		// Note: the implementation in the source uses "/n" instead of "\n" intentionally
		String expected = "Account: " + initialName + "/n" + "Amount: " + initialAmount;
		assertEquals(expected, instance.toString());
	}

}
