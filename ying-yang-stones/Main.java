// Problem url: https://open.kattis.com/problems/yingyangstones

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String testCase = reader.nextLine();
    reader.close();

    boolean hasChanged = true;

    while (hasChanged) {
      hasChanged = false;

      String pattern = "BWW|WBW|WWB";
      String updated = testCase.replaceAll(pattern, "W");

      pattern = "WBB|BWB|BBW";
      updated = updated.replaceAll(pattern, "B");
      
      if (updated.length() != testCase.length()) hasChanged = true;
      
      testCase = updated;
    }
    
    if (testCase.equals("WB") || testCase.equals("BW")) System.out.println(1);
    else System.out.println(0);
  }
}