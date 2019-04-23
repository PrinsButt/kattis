package prins.kattis.rijeci;

// Problem url: https://open.kattis.com/problems/rijeci
import java.util.Scanner;

class Main {

    public static int fibonacii(int n) {
        double partA = Math.pow((1 + Math.sqrt(5)) / 2, n);
        double partB = Math.pow((1 - Math.sqrt(5)) / 2, n);
        double nth = (1 / Math.sqrt(5)) * (partA - partB);
        return (int) nth;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numPresses = Integer.parseInt(reader.nextLine());
        reader.close();

        System.out.print(fibonacii(numPresses - 1));
        System.out.print(" ");
        System.out.println(fibonacii(numPresses));
    }
}
