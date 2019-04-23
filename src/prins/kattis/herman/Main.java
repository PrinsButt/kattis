package prins.kattis.herman;

// Problem url: https://open.kattis.com/problems/herman
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int radius;
        
        try (Scanner reader = new Scanner(System.in)) {
            radius = Integer.parseInt(reader.nextLine());
        }

        System.out.printf("%.6f\n", Math.PI * Math.pow(radius, 2));
        System.out.printf("%.6f\n", 4 * Math.pow(radius, 2) / 2);
    }
}
