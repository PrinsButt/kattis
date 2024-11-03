package prins.kattis.ladder;

// Problem url: https://open.kattis.com/problems/ladder
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int opposite;
        int theta;
        
        try (Scanner reader = new Scanner(System.in)) {
            opposite = reader.nextInt();
            theta = reader.nextInt();
        }

        double hypotenuse = opposite / (Math.sin(Math.toRadians(theta)));
        System.out.print((int) Math.ceil(hypotenuse));
    }
}
