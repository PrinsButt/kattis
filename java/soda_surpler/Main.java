package prins.kattis.soda_surpler;

// Problem url: https://open.kattis.com/problems/sodasurpler
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int initialBottles;
        int foundBottles;
        int requiredBottles;

        try (Scanner reader = new Scanner(System.in)) {
            initialBottles = reader.nextInt();
            foundBottles = reader.nextInt();
            requiredBottles = reader.nextInt();
        }

        int emptyBottles = initialBottles + foundBottles;

        int total = 0;

        while (emptyBottles >= requiredBottles) {
            int fullBottles = emptyBottles / requiredBottles;
            int spareBottles = emptyBottles % requiredBottles;
            total += fullBottles;
            emptyBottles = fullBottles + spareBottles;
        }

        System.out.println(total);
    }
}
