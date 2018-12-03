// Problem url: https://open.kattis.com/problems/tarifa

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numX = Integer.parseInt(reader.nextLine());
    int numN = Integer.parseInt(reader.nextLine());

    int used = 0;

    for (int index=0; index < numN; index++) {
      used += Integer.parseInt(reader.nextLine());
    }

    reader.close();

    System.out.println( (numX * (numN + 1)) - used);
  }
}