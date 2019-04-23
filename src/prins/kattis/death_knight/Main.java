package prins.kattis.death_knight;

// Problem url: https://open.kattis.com/problems/deathknight
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numTestCases = Integer.parseInt(reader.nextLine());
        int battlesWon = 0;

        for (int testCase = 0; testCase < numTestCases; testCase++) {
            String moves = reader.nextLine();

            if (!moves.contains("CD")) {
                battlesWon++;
            }
        }

        reader.close();

        System.out.print(battlesWon);
    }
}
