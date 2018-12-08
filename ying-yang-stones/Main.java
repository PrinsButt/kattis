// Problem url: https://open.kattis.com/problems/yingyangstones

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String testCase = reader.nextLine();
    reader.close();

    int blackStones = 0;
    int whiteStones = 0;
    String pattern = "";
    boolean changed = true;

    while (changed) {
      changed = false;

      for (char stone : testCase.toCharArray()) {
        pattern += stone;

        if (stone == 'W') whiteStones++;
        if (stone == 'B') blackStones++;

        if (blackStones > 0 && whiteStones > 0 && Math.abs(blackStones - whiteStones) == 1) {
          if (blackStones > whiteStones) {
            testCase = testCase.replaceFirst(pattern, "B");
          }
          else {
            testCase = testCase.replaceFirst(pattern, "W");
          }

          changed = true;
          pattern = "";
          blackStones = 0;
          whiteStones = 0;
        }
      }
    }

    if (testCase.equals("WB") || testCase.equals("BW")) System.out.println(1);
    else System.out.println(0);
  }
}