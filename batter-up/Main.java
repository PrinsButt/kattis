// Problem url: https://open.kattis.com/problems/batterup

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numAtBats = Integer.parseInt(reader.nextLine());

    int sum = 0;
    double denominator = 0;

    for (int index=0; index < numAtBats; index++) {
      int atBat = reader.nextInt();

      if (atBat >= 0) {
        sum += atBat;
        denominator++;
      }
    }

    reader.close();
    System.out.println(sum / denominator);
  }
}