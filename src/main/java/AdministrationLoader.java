

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class AdministrationLoader {

    public static List<Administrations> loadAdministrations() throws Exception {
        List<Administrations> administrations = new ArrayList<>();

        // Διαβάζουμε το CSV από τα resources
        InputStream is = AdministrationLoader.class.getResourceAsStream("/liga2025.csv");
        if (is == null) {
            throw new RuntimeException("Δεν βρέθηκε το αρχείο liga2025.csv στα resources!");
        }

       try (Reader reader = new InputStreamReader(is)) {

            Iterable<CSVRecord> records = CSVFormat.DEFAULT.builder()
                    .setDelimiter(',')       // Χωρισμός με κόμμα
                    .setIgnoreSurroundingSpaces(true)               // Trim στα πεδία
                    .build()
                    .parse(reader);

            for (CSVRecord record : records) {

                if (record.size() < 3) {
                    continue; // γραμμή με λιγότερα πεδία, την παρακάμπτουμε
                }

                String idStr = record.get(0).trim();
                String name = record.get(1).trim();
                String amountStr = record.get(2).trim();

                // Ελεγχος: ο κωδικός πρέπει να ξεκινάει με "19"
                if (idStr.startsWith("19")) {
                    try {
                        int id = Integer.parseInt(idStr);

                        // Καθαρισμός ποσού
                        String cleanedAmount = amountStr.replace(".", "").replace(",", "");
                        if (cleanedAmount.isEmpty()) {
                            cleanedAmount = "0";
                        }

                        BigDecimal amount = new BigDecimal(cleanedAmount);

                        Administrations admin = new Administrations(id, name, amount);
                        administrations.add(admin);

                    } catch (NumberFormatException e) {
                        System.out.println("⚠️ Invalid number format for line: " + record.toString());
                    }
                }
            }
        }

        return administrations;
    }
}