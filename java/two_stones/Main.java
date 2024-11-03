package prins.kattis.two_stones;

// Problem url: https://open.kattis.com/problems/twostones
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            int stones = reader.nextInt();

            if (stones % 2 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }
    }
}
