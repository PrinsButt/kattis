package prins.kattis.planina;

// Problem url: https://open.kattis.com/problems/planina
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int iterations;
        
        try (Scanner reader = new Scanner(System.in)) {
            iterations = Integer.parseInt(reader.nextLine());
        }

        int numSquares = (int) Math.pow(4, iterations);
        int pointsPerOuterSide = 1 + (int) Math.sqrt(numSquares);
        int points = (int) Math.pow(pointsPerOuterSide, 2);

        System.out.println(points);
    }
}
