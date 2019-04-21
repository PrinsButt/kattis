// Problem url: https://open.kattis.com/problems/pauleigon

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int maxTurns = reader.nextInt();
    int paulScore = reader.nextInt();
    int opponentScore = reader.nextInt();
    reader.close();
    
    int completed = ((paulScore + opponentScore) / maxTurns);
    if (completed % 2 == 0) {
      System.out.println("paul");
    } else {
      System.out.println("opponent");
    }
  }
}