package Percentage.percentage;

import org.apache.commons.csv.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.math.BigDecimal;
import java.util.*;

public class Loader {
    public static final String CSV_FILE = "liga2025.csv"; 
    private Map<String, String> namesMap = new HashMap<>(); 

    public Map<String, BigDecimal> loadAmounts() throws Exception {
        Map<String, BigDecimal> amountsMap = new HashMap<>();
        InputStream is = getClass().getClassLoader().getResourceAsStream(CSV_FILE);
        if (is == null) throw new FileNotFoundException("Αρχείο CSV μη διαθέσιμο.");

        try (Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {
            CSVParser parser = CSVFormat.DEFAULT.builder()
                .setHeader() 
                .setSkipHeaderRecord(true) 
                .setDelimiter(',')
                .build()
                .parse(reader);

            for (CSVRecord rec : parser) {
                String code = rec.get("Κωδικός").trim();
                String name = rec.get("Ονομασία").trim();
                namesMap.put(code, name);

                BigDecimal val = safeNumber(rec.get("Ποσό"));
                amountsMap.put(code, amountsMap.getOrDefault(code, BigDecimal.ZERO).add(val));
            }
        }
        return amountsMap;
    }

    public String getName(String code) {
        return namesMap.getOrDefault(code, "Άγνωστο Στοιχείο (" + code + ")");
    }

    public static BigDecimal safeNumber(String s) {
        if (s == null || s.trim().isEmpty()) return BigDecimal.ZERO;
        // Αφαιρεί τελείες χιλιάδων και μετατρέπει κόμμα σε τελεία για το BigDecimal
        String clean = s.trim().replace(".", "").replace(",", ".");
        try {
            return new BigDecimal(clean);
        } catch (Exception e) {
            return BigDecimal.ZERO;
        }
    }
}