import java.util.Scanner;

public class Prediction {
        // Void μέθοδος predict
    public static void main(String[] args) {
        double[][] dapanes = { //this an array with values of main entities from 2021 up until 2026 without inflation 
            {3766000, 4097337, 3811641, 4059900, 3974293, 4146883}, //republic presidency
            {143500000, 134251607, 134030043, 140477275, 147343837, 156551972}, //hellenic parliament 
            {34251000, 40536272, 36372937, 37886945, 35723136, 38447884}, //governance presidency
            {2986769000L, 2973891093L, 3172953535L, 3245029336L, 3282162880L, 3487669947L},//interior
            {288237000, 246668455, 252308235, 357219091, 359936589, 404757288},//exterior
            {5495900000L, 5937190083L, 5103551488L, 5362408267L, 5252784805L, 5916035799L},//defence
            {4256596000L, 4276649036L, 4651583743L, 5278434922L, 6150311996L, 6568225405L},//health
            {533261000, 531100091, 506425467, 547747086, 557774970, 569191096},//justice
            {5605100000L, 5363728191L, 5436589608L, 5733987212L, 5660668349L, 5665485468L},//education
            {359100000, 383427915, 409992485, 350395832, 493075321, 546993897},//sport
            {747475497000L, 690153192000L, 669349030000L, 919467234000L, 1068139883000L, 1438513680000L}//finance
        };
        double[] years={2021,2022,2023,2024,2025,2026};
        Scanner sc = new Scanner(System.in);
        //(todo) implement ifs for different user inputs and 
        //depending on if they want to have a prediction for a year 
        //or for the value of an amount at a certain year
        

        System.out.println("Give me the year you want a prediction for!");
        int a = sc.nextInt();
        predict(years,dapanes[0],a);
        System.out.println("Give me the value you want the republic presidency to have!");
        double b = sc.nextDouble();
        predict(years,dapanes[0],b);
        


    }
    public static void predict(double[] x, double[] y, int targetYear, double desiredY) {
        int n = x.length;

        // Υπολογισμός συντελεστών a και b
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double a = (sumY - b * sumX) / n;

        System.out.printf("Η εξίσωση παλινδρόμησης είναι: y = %.4f + %.4f·x\n", a, b);

        // Πρόβλεψη για x χρόνια μπροστά
        double predictedY =Math.floor(a + b * targetYear);
        System.out.println("Πρόβλεψη για το έτος "+ targetYear);
        System.out.printf("%,.0f euro%n", predictedY);
        // Υπολογισμός x για δοσμένο y
        double estimatedX = (desiredY - a) / b;

        // Μετατροπή σε έτος + μήνα
        int yearPart = (int) estimatedX;
        double decimalPart = estimatedX - yearPart;
        int monthPart = (int) Math.round(decimalPart * 12);
        if (monthPart == 0) monthPart = 1;
        if (monthPart > 12) monthPart = 12;

        System.out.printf("Για το δοσμένο y, το αντίστοιxo χρονικό διάστημα είναι περίπου:" 
        + "  " + monthPart +"/" +yearPart);
    }
        // Void μέθοδος predict
    public static void predict(double[] x, double[] y, double desiredY) {
        int n = x.length;

        // Υπολογισμός συντελεστών a και b
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double a = (sumY - b * sumX) / n;

        System.out.printf("Η εξίσωση παλινδρόμησης είναι: y = %.4f + %.4f·x\n", a, b);

    

        // Υπολογισμός x για δοσμένο y
        double estimatedX = (desiredY - a) / b;

        // Μετατροπή σε έτος + μήνα
        int yearPart = (int) estimatedX;
        double decimalPart = estimatedX - yearPart;
        int monthPart = (int) Math.round(decimalPart * 12);
        if (monthPart == 0) monthPart = 1;
        if (monthPart > 12) monthPart = 12;

        System.out.printf("Για y = %.4f, το αντίστοιχο x είναι περίπου: %d/%d\n", desiredY, monthPart, yearPart);
    }
        // Void μέθοδος predict
    public static void predict(double[] x, double[] y, int targetYear) {
        int n = x.length;

        // Υπολογισμός συντελεστών a και b
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double a = (sumY - b * sumX) / n;

        System.out.printf("Η εξίσωση παλινδρόμησης είναι: y = %.4f + %.4f·x\n", a, b);

        // Πρόβλεψη για x χρόνια μπροστά
        double predictedY = Math.floor(a + b * targetYear);
        
        System.out.println("Πρόβλεψη για το έτος: "+targetYear);
        System.out.printf("%,.0f euro%n", predictedY);
    }
}
