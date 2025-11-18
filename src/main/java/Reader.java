import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static void main(String[] args) {
        //  Δημιουργούμε λίστες για ΚΑΙ τις δύο στήλες
        List<String> names = new ArrayList<>();
        List<Double> incomeAmounts = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("budget.csv"))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                //  Χωρίζουμε τη γραμμή σε δύο μέρη με το comma
                String[] columns = line.split(",");
                
                //  Ελέγχουμε ότι έχουμε 2 στήλες
                if (columns.length == 2) {
                    String name = columns[0].trim();        // Πρώτη στήλη - όνομα
                    Double amount = Double.parseDouble(columns[1].trim()); // Δεύτερη στήλη - ποσό
                    
                    names.add(name);
                    incomeAmounts.add(amount);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        // ΕΚΤΥΠΩΣΗ και των δύο στηλών
        
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Όνομα: " + names.get(i) + ", Ποσό: " + incomeAmounts.get(i));
        }

    }
}


