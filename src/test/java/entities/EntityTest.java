package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class EntityTest {

    private TestEntityImpl testEntity;
    private final String initialCode = "E001";
    private final String initialName = "Test Entity";
    private final BigDecimal initialAmount = new BigDecimal("111.11");
    private final String initialForm = "Form";

    // Minimal concrete subclass for testing the abstract Entity
    private static class TestEntityImpl extends Entity {
        public TestEntityImpl(String code, String name, BigDecimal amount, String form) {
            super(code, name, amount, form);
        }

        // Provide the same public getters/setters as other concrete entities in the project
        public String getCode() { return code; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public BigDecimal getAmount() { return amount; }
        public void setAmount(BigDecimal amount) { this.amount = amount; }
        public String getForm() { return form; }

        @Override
        public String toExplain() {
            return getName() + " - test explanation.";
        }

        @Override
        public String toString() {
            return "Account: " + getName() + "\n" + "Amount: " + getAmount();
        }
    }

    @BeforeEach
    void setUp() {
        testEntity = new TestEntityImpl(initialCode, initialName, initialAmount, initialForm);
    }

	@Test
	void testConstructorAndGetters() {
		assertNotNull(testEntity);
		assertEquals(initialCode, testEntity.getCode());
		assertEquals(initialName, testEntity.getName());
		assertEquals(initialAmount, testEntity.getAmount());
		assertEquals(initialForm, testEntity.getForm());
	}

	@Test
	void testSettersAndToExplainToString() {
		final String newName = "Updated Entity";
		final BigDecimal newAmount = new BigDecimal("222.22");
		testEntity.setName(newName);
		testEntity.setAmount(newAmount);
		assertEquals(newName, testEntity.getName());
		assertEquals(newAmount, testEntity.getAmount());

		String explainExpected = newName + " - test explanation.";
		assertEquals(explainExpected, testEntity.toExplain());

		String toStringExpected = "Account: " + newName + "\n" + "Amount: " + newAmount;
		assertEquals(toStringExpected, testEntity.toString());
	}

}
