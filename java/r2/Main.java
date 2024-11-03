package prins.kattis.r2;

// Problem url: https://open.kattis.com/problems/r2
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int r1;
        int s;
        
        try (Scanner reader = new Scanner(System.in)) {
            r1 = reader.nextInt();
            s = reader.nextInt();
        }

        int r2 = (2 * s) - r1;
        System.out.println(r2);
    }
}
