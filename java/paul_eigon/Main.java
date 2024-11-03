package prins.kattis.paul_eigon;

// Problem url: https://open.kattis.com/problems/pauleigon
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int maxTurns;
        int paulScore;
        int opponentScore;
        
        try (Scanner reader = new Scanner(System.in)) {
            maxTurns = reader.nextInt();
            paulScore = reader.nextInt();
            opponentScore = reader.nextInt();
        }

        int completed = ((paulScore + opponentScore) / maxTurns);
        if (completed % 2 == 0) {
            System.out.println("paul");
        } else {
            System.out.println("opponent");
        }
    }
}
