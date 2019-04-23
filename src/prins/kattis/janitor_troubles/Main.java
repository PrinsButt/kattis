package prins.kattis.janitor_troubles;

// Problem url: https://open.kattis.com/problems/janitortroubles
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        double answer;
        try (Scanner reader = new Scanner(System.in)) {
            int sideA = reader.nextInt();
            int sideB = reader.nextInt();
            int sideC = reader.nextInt();
            int sideD = reader.nextInt();
            double semiPerimeter = (sideA + sideB + sideC + sideD) / 2.0;
            answer = Math.sqrt((semiPerimeter - sideA)
                    * (semiPerimeter - sideB)
                    * (semiPerimeter - sideC)
                    * (semiPerimeter - sideD));
        }
        
        System.out.print(answer);
    }
}
