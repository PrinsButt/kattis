// Problem url: https://open.kattis.com/problems/volim

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int player = Integer.parseInt(reader.nextLine());
    int questions = Integer.parseInt(reader.nextLine());

    int totalTime = 210;

    for (int question = 0; question < questions; question++) {
      totalTime -= reader.nextInt();
      String answer = reader.nextLine().trim();

      if (totalTime > 0) {
        if (answer.equals("T")) {
          player++;
          if (player == 9) player = 1;
        }
      }
    }

    reader.close();

    System.out.println(player);
  }
}