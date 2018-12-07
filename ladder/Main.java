// Problem url: https://open.kattis.com/problems/ladder

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int opposite = reader.nextInt();
    int theta = reader.nextInt();
    reader.close();

    double hypotenuse = opposite / (Math.sin(Math.toRadians(theta)));
    System.out.print((int) Math.ceil(hypotenuse));
  }
}