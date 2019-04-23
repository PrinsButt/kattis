package prins.kattis.quadrant;

// Problem url: https://open.kattis.com/problems/quadrant
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int x;
        int y;

        try (Scanner reader = new Scanner(System.in)) {
            x = Integer.parseInt(reader.nextLine());
            y = Integer.parseInt(reader.nextLine());
        }

        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (y > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}
