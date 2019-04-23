package prins.kattis.batter_up;

// Problem url: https://open.kattis.com/problems/batterup
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int sum = 0;
        double denominator = 0;

        try (Scanner reader = new Scanner(System.in)) {
            int numAtBats = Integer.parseInt(reader.nextLine());

            for (int index = 0; index < numAtBats; index++) {
                int atBat = reader.nextInt();

                if (atBat >= 0) {
                    sum += atBat;
                    denominator++;
                }
            }
        }

        System.out.println(sum / denominator);
    }
}
