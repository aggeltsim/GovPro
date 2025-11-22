import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class CsvBasicReader {
    private static final String RED="\u001B[31m";
    public static final String RESET="\u001B[0m";
    public static final String BOLD="\u001B[1m";
     


    public static void main(String[] args) {
        //  Create three lists to store the data
        List<String> names = new ArrayList<>();
        List<BigDecimal> IncomeAmounts = new ArrayList<>();
        List<Integer> codes = new ArrayList<>(); {
        
        try (BufferedReader reader = new BufferedReader(new FileReader("basicAmounts.csv"))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                // devide the 3 parts with a comma
                String[] columns = line.split(",");
                
                //  Check that we have 3 columns
                if (columns.length == 3) {
                    String name = columns[0].trim();        // first col -names
                    BigDecimal amount = new BigDecimal(columns[1].trim());// second col -ammounts
                    int code = Integer.parseInt(columns[2].trim()); // third col -codes
                    names.add(name);
                    IncomeAmounts.add(amount);
                    codes.add(code);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
    }
        //  print the data
        System.out.println("The information displayed below represents"
        +" briefly the most important financial data of the greek state budget.");
        System.out.println();
        for (int i = 0; i < names.size(); i++) {
            System.out.println(RED+ BOLD +
                "  Name: " +RESET+ names.get(i) +RED + BOLD +
                "\n  Amount: " +RESET+ IncomeAmounts.get(i) +" euro" +RED+BOLD+
                "\n  Code: " +RESET+ codes.get(i) +
                "\n-------------------------------------------------"
                );
        }
        }   
    } 
}    
   