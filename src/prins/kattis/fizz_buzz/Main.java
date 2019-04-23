package prins.kattis.fizz_buzz;

// Problem url: https://open.kattis.com/problems/fizzbuzz
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int numX;
        int numY;
        int numN;

        try (Scanner reader = new Scanner(System.in)) {
            numX = reader.nextInt();
            numY = reader.nextInt();
            numN = reader.nextInt();
        }

        for (int index = 1; index <= numN; index++) {
            if (index % numX == 0 && index % numY == 0) {
                System.out.println("FizzBuzz");
            } else if (index % numX == 0) {
                System.out.println("Fizz");
            } else if (index % numY == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(index);
            }
        }
    }
}
