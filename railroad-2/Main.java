// Problem url: https://open.kattis.com/problems/railroad2

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    reader.nextInt();
    if (reader.nextInt() % 2 == 0) System.out.println("possible");
    else System.out.println("impossible");
    reader.close();
  }
}