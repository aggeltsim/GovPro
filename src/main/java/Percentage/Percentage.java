package Percentage;

import org.apache.commons.csv.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.math.BigDecimal;
import java.util.*;

public class Percentage {

    // args: code1 code2 pathToCsv
    public static void main(String[] args) throws Exception {

        if (args.length < 3) {
            System.out.println("Usage: java app.Percentage <codeA> <codeB> <csvFile>");
            return;
        }

        String codeA = args[0];
        String codeB = args[1];
        String csvFile = args[2];

        // διαβάζω το CSV
        Map<String, BigDecimal> amounts = readAmounts(csvFile);

        BigDecimal a = amounts.getOrDefault(codeA, BigDecimal.ZERO);
        BigDecimal b = amounts.getOrDefault(codeB, BigDecimal.ZERO);

        System.out.println("Amount A (" + codeA + ") = " + a);
        System.out.println("Amount B (" + codeB + ") = " + b);

        if (b.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("Cannot divide. B is zero.");
            return;
        }

         BigDecimal result = a.multiply(BigDecimal.valueOf(100))
                     .divide(b, 4, java.math.RoundingMode.HALF_UP);


        System.out.println("Percentage = " + result + " %");
    }

    // διαβάζει ποσά από το csv
    private static Map<String, BigDecimal> readAmounts(String csvPath) throws Exception {
        Map<String, BigDecimal> map = new HashMap<>();

        try (Reader reader = new InputStreamReader(new FileInputStream(csvPath), StandardCharsets.UTF_8)) {

            CSVParser parser = CSVFormat.DEFAULT
            .builder()
            .setHeader()
            .setSkipHeaderRecord(true)
            .setDelimiter(',')
            .build()
            .parse(reader);

            List<String> headers = parser.getHeaderNames();

            String codeHeader = findCodeHeader(headers);

            for (CSVRecord rec : parser) {
                String code = rec.get(codeHeader).trim();
                BigDecimal sum = BigDecimal.ZERO;

                // προσπαθώ να κάνω parse όλα τα numeric columns (πολύ απλά)
                for (String h : headers) {
                    if (h.equals(codeHeader)) continue;
                    sum = sum.add(safeNumber(rec.get(h)));
                }

                map.put(code, map.getOrDefault(code, BigDecimal.ZERO).add(sum));
            }
        }
        return map;
    }

    private static BigDecimal safeNumber(String s) {
        if (s == null) return BigDecimal.ZERO;
        s = s.trim();
        if (s.isEmpty()) return BigDecimal.ZERO;

        // απλή μετατροπή ελληνικού format
        s = s.replace(".", "").replace(",", ".");
        try {
            return new BigDecimal(s);
        } catch (Exception e) {
            return BigDecimal.ZERO;
        }
    }

    private static String findCodeHeader(List<String> headers) {
        for (String h : headers) {
            String low = h.toLowerCase();
            if (low.contains("κωδ")) return h;
            if (low.equals("code")) return h;
        }
        return headers.get(0); // fallback
    }
}
