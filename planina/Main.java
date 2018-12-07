// Problem url: https://open.kattis.com/problems/planina

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int iterations = Integer.parseInt(reader.nextLine());
    reader.close();

    int numSquares = (int) Math.pow(4, iterations);
    int pointsPerOuterSide = 1 + (int) Math.sqrt(numSquares);
    int points = (int) Math.pow(pointsPerOuterSide, 2);

    System.out.println(points);
  }
}