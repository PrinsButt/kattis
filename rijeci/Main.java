// Problem url: https://open.kattis.com/problems/rijeci

import java.util.Scanner;

class Main {

  public static int fibonacii(int n) {
    if (n <= 1) return n;
    else return fibonacii(n - 1) + fibonacii(n - 2);
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