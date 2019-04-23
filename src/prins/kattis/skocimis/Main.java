package prins.kattis.skocimis;

// Problem url: https://open.kattis.com/problems/skocimis
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int kangarooA = reader.nextInt();
        int kangarooB = reader.nextInt();
        int kangarooC = reader.nextInt();
        reader.close();

        int moves = 0;
        int left = kangarooB - kangarooA;
        int right = kangarooC - kangarooB;

        if (left > right) {
            if (left > 1) {
                moves = left - 1;
            }
        } else if (right > left) {
            if (right > 1) {
                moves = right - 1;
            }
        } else if (left == right) {
            if (left > 1) {
                moves = left - 1;
            }
        }

        System.out.println(moves);
    }
}
