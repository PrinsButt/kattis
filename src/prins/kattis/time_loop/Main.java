package prins.kattis.time_loop;

// Problem url: https://open.kattis.com/problems/timeloop
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int magicNumber;
        
        try (Scanner reader = new Scanner(System.in)) {
            magicNumber = reader.nextInt();
        }

        for (int i = 1; i <= magicNumber; i++) {
            System.out.println("" + i + " Abracadabra");
        }
    }
}
