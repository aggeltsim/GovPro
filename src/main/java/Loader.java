import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import entities.Entity;
import entities.Ministry;

public class Loader {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();

        try (Reader reader = new InputStreamReader(
                Loader.class.getResourceAsStream("/liga2025.csv"), StandardCharsets.UTF_8)) {

            Iterable<CSVRecord> records = CSVFormat.DEFAULT.builder()
                    .setHeader("id", "name", "amount")
                    .setSkipHeaderRecord(true)
                    .build()
                    .parse(reader);

            for (CSVRecord record : records) {
                String code = record.get("code");
                String name = record.get("name");
                String amountString = record.get("amount");
                String amount2 = amountString.replace(",",".");
                BigDecimal amount = new BigDecimal(amount2);


                // create an Entity from the CSV row and add it to the list
                entities.add(new Ministry(code, name, amount));
            }
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
