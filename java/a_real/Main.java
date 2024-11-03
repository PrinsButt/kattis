package prins.kattis.a_real;

// Problem url: https://open.kattis.com/problems/areal
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println(4 * Math.sqrt(reader.nextLong()));
        }
    }
}
