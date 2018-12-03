// Problem url: https://open.kattis.com/problems/r2

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int r1 = reader.nextInt();
    int s = reader.nextInt();
    reader.close();

    int r2 = (2 * s) - r1;
    System.out.println(r2);
  }
}