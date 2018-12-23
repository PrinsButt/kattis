// Problem url: https://open.kattis.com/problems/reversebinary

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int n = Integer.parseInt(reader.nextLine());
    reader.close();

    String reversed = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
    System.out.println(Integer.parseInt(reversed, 2));
  }
}