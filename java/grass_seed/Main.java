package prins.kattis.grass_seed;

// Problem url: https://open.kattis.com/problems/grassseed
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        double cost;
        double surface;
        
        try (Scanner reader = new Scanner(System.in)) {
            cost = Double.parseDouble(reader.nextLine());
            int lawns = Integer.parseInt(reader.nextLine());
            surface = 0.0;
            for (int lawn = 0; lawn < lawns; lawn++) {
                double width = reader.nextDouble();
                double length = reader.nextDouble();
                
                surface += (width * length);
            }
        }

        String formatted = String.format("%.7f", surface * cost);
        System.out.println(formatted);
    }
}
