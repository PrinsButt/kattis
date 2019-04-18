// Problem url: https://open.kattis.com/problems/hydrasheads

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    StringBuilder output = new StringBuilder();
    String line = "";
    
    while (!(line = reader.nextLine()).equals("0 0")) {
      String parts[] = line.split(" ");
      int heads = Integer.parseInt(parts[0]);
      int tails = Integer.parseInt(parts[1]);
      int moves = 0;

      boolean isRunning = true;
      boolean hasChanged = false;

      while (isRunning) {
        if (heads == 0 && tails == 0) {
          isRunning = false;
        }
        else {
          hasChanged = false;

          if (heads > 0 && heads % 2 == 0) {
            heads -= 2;
            hasChanged = true;
          }
          else if (heads > 0 && tails >= 2) {
            tails -= 2;
            heads++;
            hasChanged = true;
          }
          else if (tails >= 4) {
            tails -= 2;
            heads++;
            hasChanged = true;
          }
          else if (tails > 0) {
            tails++;
            hasChanged = true;
          }

          if (hasChanged == true) moves++;
          else break;
        }
      }

      if (hasChanged) {
        output.append(moves).append("\n");
      } else {
        output.append("-1\n");
      }

    }
    
    reader.close();
    System.out.print(output);
  }
}