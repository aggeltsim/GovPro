package Entities;

import com.opencsv.CSVReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AdministrationLoader {

    public static List<Administrations> loadAdministrations() throws Exception {
        List<Administrations> administrations = new ArrayList<>();

        // Διαβάζουμε το CSV από τα resources
        InputStream is = AdministrationLoader.class.getResourceAsStream("/liga2025.csv");
        if (is == null) {
            throw new RuntimeException("Δεν βρέθηκε το αρχείο liga2025.csv στα resources!");
        }

        try (CSVReader reader = new CSVReader(new InputStreamReader(is))) {
            String[] line;
            reader.readNext(); // παράλειψη επικεφαλίδας, αν υπάρχει

            while ((line = reader.readNext()) != null) {
                String idStr = line[0].trim();
                String name = line[1].trim();
                String amountStr = line[2].trim();

                // Έλεγχος: ξεκινά ο κωδικός με "19";
                if (idStr.startsWith("19")) {
                    try {
                        int id = Integer.parseInt(idStr);

                        // Καθαρισμός του amount για BigDecimal
                        String cleanedAmount = amountStr.replace(",", ""); // αφαιρεί κόμματα
                        if (cleanedAmount.isEmpty()) {
                            cleanedAmount = "0"; // fallback σε 0 αν είναι κενό
                        }

                        BigDecimal amount = new BigDecimal(cleanedAmount);
                        Administrations admin = new Administrations(id, name, amount);
                        administrations.add(admin);
                    } catch (NumberFormatException e) {
                        // Εκτυπώνουμε ποια γραμμή είχε πρόβλημα για debug
                        System.out.println("⚠️ Invalid number format for line: " + String.join(", ", line));
                    }
                }
            }
        }

        return administrations;
    }
}
