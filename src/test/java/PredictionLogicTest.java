import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PredictionLogicTest {

    @Test
    void testGetValueForGivenYearPredictsReasonableValue() {
        Prediction p = new Prediction();
        double[] years = {2021, 2022, 2023, 2024, 2025};
        double[] values = {100, 110, 120, 130, 140};

        double predicted = p.getValueForGivenYear(years, values, 2026);
        assertTrue(predicted > 140, "Prediction should be increasing");
    }
}
