package entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MinEconomyTest {

    private MinEconomy minEconomy;
    private final String initialCode = "1024";
    private final String initialName = "Ministry of National Economy and";
    private final BigDecimal initialAmount = new BigDecimal("1246518464000");
    private final String initialForm = "2025";

    @BeforeEach
    void setUp() {
        // Initialize a new MinEconomy object before each test
        minEconomy = new MinEconomy(initialCode, initialName, initialAmount, initialForm);
    }

    // --- Constructor and Getters Test ---

    @Test
    void testConstructorAndGetters() {
        // Check if the object was created successfully
        assertNotNull(minEconomy, "The MinEconomy object should not be null.");

        // Check if all fields are initialized correctly by the constructor
        assertEquals(initialCode, minEconomy.getCode(), "The code should match the initial value.");
        assertEquals(initialName, minEconomy.getName(), "The name should match the initial value.");
        assertEquals(initialAmount, minEconomy.getAmount(), "The amount should match the initial value.");
        assertEquals(initialForm, minEconomy.getForm(), "The form should match the initial value.");
    }

    // --- Setters Test ---

    @Test
    void testSetName() {
        final String newName = "Finance Ministry";
        minEconomy.setName(newName);
        assertEquals(newName, minEconomy.getName(), "The name should be updated correctly.");
    }

    @Test
    void testSetAmount() {
        final BigDecimal newAmount = new BigDecimal("2500000.75");
        minEconomy.setAmount(newAmount);
        assertEquals(newAmount, minEconomy.getAmount(), "The amount should be updated correctly.");
    }

    // --- toExplain() Method Test ---

    @Test
    void testToExplain() {
        String expectedExplanation = initialName + " handles economic policy, state budget,"
                + " taxation, and public finances.";
        assertEquals(expectedExplanation, minEconomy.toExplain(), "toExplain() should return the correct descriptive string.");
        
        // Test after changing the name
        final String newName = "Min. of Finance";
        minEconomy.setName(newName);
        String newExpectedExplanation = newName + " handles economic policy, state budget,"
                + " taxation, and public finances.";
        assertEquals(newExpectedExplanation, minEconomy.toExplain(), "toExplain() should use the updated name.");
    }

    // --- toString() Method Test ---

    @Test
    void testToString() {
        String expectedString = "Account: " + initialName + "\n" + "Amount: " + initialAmount;
        assertEquals(expectedString, minEconomy.toString(), "toString() should return the correct formatted string.");
        
        // Test after changing the amount
        final BigDecimal newAmount = new BigDecimal("3000.00");
        minEconomy.setAmount(newAmount);
        String newExpectedString = "Account: " + initialName + "\n" + "Amount: " + newAmount;
        assertEquals(newExpectedString, minEconomy.toString(), "toString() should use the updated amount.");
    }
}
