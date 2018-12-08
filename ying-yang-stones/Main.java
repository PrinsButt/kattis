// Problem url: https://open.kattis.com/problems/yingyangstones

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String testCase = reader.nextLine();
    reader.close();

    char[] stones = testCase.toCharArray();
    int blackStones = 0;
    int whiteStones = 0;
    String pattern = "";

    for (int index=0; index < stones.length; index++) {
      if (stones[index] == 'W') whiteStones++;
      if (stones[index] == 'B') blackStones++;
      pattern += stones[index];

      if (blackStones > 0 && whiteStones > 0 && Math.abs(blackStones - whiteStones) == 1) {
        if (blackStones > whiteStones) {
          testCase = testCase.replaceFirst(pattern, "B");
        }
        else {
          testCase = testCase.replaceFirst(pattern, "W");
        }

        stones = testCase.toCharArray();
        pattern = "";
        blackStones = 0;
        whiteStones = 0;
        index = -1;
      }
    }

    if (testCase.equals("WB") || testCase.equals("BW")) System.out.println(1);
    else System.out.println(0);
  }
}