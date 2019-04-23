package prins.kattis.qaly;

// Problem url: https://open.kattis.com/problems/qaly
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        float qaly = 0;
        
        try (Scanner reader = new Scanner(System.in)) {
            int qualityPeriods = Integer.parseInt(reader.nextLine());
            
            for (int period = 0; period < qualityPeriods; period++) {
                float quality = reader.nextFloat();
                float years = reader.nextFloat();
                qaly += (quality * years);
                
                reader.nextLine();
            }
        }

        System.out.println(qaly);
    }
}
