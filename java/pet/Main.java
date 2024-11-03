package prins.kattis.pet;

// Problem url: https://open.kattis.com/problems/pet
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int highestPoints = 0;
        int winner = 0;
        
        try (Scanner reader = new Scanner(System.in)) {
            for (int grader = 1; grader <= 5; grader++) {
                int sum = 0;
                
                for (int index = 0; index < 4; index++) {
                    sum += reader.nextInt();
                }
                
                if (sum > highestPoints) {
                    highestPoints = sum;
                    winner = grader;
                }
                
                reader.nextLine();
            }
        }
        
        System.out.println(winner + " " + highestPoints);
    }
}
