// Problem url: https://open.kattis.com/problems/herman

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int radius = Integer.parseInt(reader.nextLine());
    reader.close();

    System.out.printf("%.6f\n", Math.PI * Math.pow(radius, 2));
    System.out.printf("%.6f\n", 4 * Math.pow(radius, 2) / 2);
  }
}