import Entities.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import org.apache.commons.csv.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();

        try (Reader reader = new InputStreamReader(
                Main.class.getResourceAsStream("/liga2025.csv"), StandardCharsets.UTF_8)) {

            Iterable<CSVRecord> records = CSVFormat.DEFAULT.builder()
                    .setHeader("id", "name", "amount")
                    .setSkipHeaderRecord(true)
                    .build()
                    .parse(reader);

            for (CSVRecord record : records) {
                int id = Integer.parseInt(record.get("id"));
                String name = record.get("name");
                String amountString = record.get("amount");
                String amount2 = amountString.replace(",",".");
                BigDecimal amount = new BigDecimal(amount2);


                // create an Entity from the CSV row and add it to the list
                entities.add(new Ministry(id, name, amount));
            }
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
