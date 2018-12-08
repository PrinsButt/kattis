// Problem url: https://open.kattis.com/problems/fizzbuzz

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numX = reader.nextInt();
    int numY = reader.nextInt();
    int numN = reader.nextInt();
    reader.close();

    for (int index=1; index <= numN; index++) {
      if (index % numX == 0 && index % numY == 0) {
        System.out.println("FizzBuzz");
      }
      else if (index % numX == 0) {
        System.out.println("Fizz");
      }
      else if (index % numY == 0) {
        System.out.println("Buzz");
      }
      else System.out.println(index);
    }
  }
}