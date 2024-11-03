package prins.kattis.one_chicken;

// Problem url: https://open.kattis.com/problems/onechicken
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int numPeople;
        int numPieces;

        try (Scanner reader = new Scanner(System.in)) {
            numPeople = reader.nextInt();
            numPieces = reader.nextInt();
        }

        int difference = numPieces - numPeople;

        if (difference < 0) {
            System.out.print("Dr. Chaz needs " + (-difference) + " more ");
            System.out.print((-difference == 1) ? "piece" : "pieces");
            System.out.println(" of chicken!");
        } else {
            System.out.print("Dr. Chaz will have " + difference + " ");
            System.out.print((difference == 1) ? "piece" : "pieces");
            System.out.println(" of chicken left over!");
        }
    }
}
