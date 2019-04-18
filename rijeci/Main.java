// Problem url: https://open.kattis.com/problems/rijeci

import java.util.Iterator;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    int numPresses = Integer.parseInt(reader.nextLine());
    String letters = "A";

    for (int press=0; press < numPresses; press++) {
      StringBuffer modified = new StringBuffer();

      for (char letter : letters.toCharArray()) {
          if (letter == 'A') modified.append("B");
          else modified.append("BA");
      }

      letters = modified.toString();
    }

    int totalA = letters.replaceAll("B", "").length();
    int totalB = letters.length() - totalA;

    reader.close();
    System.out.print(totalA + " " + totalB);
  }
}