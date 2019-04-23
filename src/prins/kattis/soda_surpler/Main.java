package prins.kattis.soda_surpler;

// Problem url: https://open.kattis.com/problems/sodasurpler
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int initialBottles = reader.nextInt();
        int foundBottles = reader.nextInt();
        int requiredBottles = reader.nextInt();
        reader.close();

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
