package Percentage;

import org.apache.commons.csv.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.math.BigDecimal;
import java.util.*;

/**
 * CsvLoader: Handles all file I/O operations and data parsing (CSV, number formats).
 * It reads the CSV file as a resource from the classpath (src/main/resources).
 */
public class Loader {

    public static final String CSV_FILE = "liga2025.csv"; 

    /**
     * Loads and processes the CSV data, summing amounts for each unique code.
     * * @return A map where the key is the code (String) and the value is the total amount (BigDecimal).
     * @throws Exception if file not found or parsing issues occur.
     */
    public Map<String, BigDecimal> loadAmounts() throws Exception {
        Map<String, BigDecimal> map = new HashMap<>();

        // Use ClassLoader to find the resource in the Maven classpath
        InputStream is = getClass().getClassLoader().getResourceAsStream(CSV_FILE);
        if (is == null) {
            throw new FileNotFoundException("Resource not found: " + CSV_FILE + ". Check src/main/resources folder.");
        }

        try (Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {
            
            // CSV Format configuration (comma delimiter, skip header, UTF-8 encoding)
            CSVParser parser = CSVFormat.DEFAULT
                .builder()
                .setHeader()
                .setSkipHeaderRecord(true)
                .setDelimiter(',')
                .build()
                .parse(reader);

            List<String> headers = parser.getHeaderNames();
            String codeHeader = findCodeHeader(headers);

            // Iterate over each record to sum amounts per code
            for (CSVRecord rec : parser) {
                String code = rec.get(codeHeader).trim();
                BigDecimal sum = BigDecimal.ZERO;
                
                // Sum all numeric columns (excluding the code column itself)
                for (String h : headers) {
                    if (h.equals(codeHeader)) continue;
                    sum = sum.add(safeNumber(rec.get(h)));
                }
                
                // Accumulate sum for the current code in the map
                map.put(code, map.getOrDefault(code, BigDecimal.ZERO).add(sum));
            }
        }
        return map;
    }

    /**
     * Safely converts a string from Greek/European number format (dot=thousands, comma=decimal) to BigDecimal.
     */
    public static BigDecimal safeNumber(String s) {
        if (s == null || s.trim().isEmpty()) return BigDecimal.ZERO;
        
        // Remove dots (thousands separator) and replace comma (decimal separator) with dot.
        s = s.trim().replace(".", "").replace(",", ".");
        try {
            return new BigDecimal(s);
        } catch (Exception e) {
            // Log error or return zero if parsing fails unexpectedly
            return BigDecimal.ZERO; 
        }
    }

    /**
     * Finds the code header (e.g., "Κωδικός" or "Code") in a case-insensitive way.
     */
    public static String findCodeHeader(List<String> headers) {
        for (String h : headers) {
            String low = h.toLowerCase();
            if (low.contains("κωδ")) return h;
            if (low.equals("code")) return h;
        }
        // Fallback to the first column name
        return headers.get(0);
    }
}