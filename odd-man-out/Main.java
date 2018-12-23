// Problem url: https://open.kattis.com/problems/oddmanout

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numTestCases = Integer.parseInt(reader.nextLine());
    
    StringBuilder output = new StringBuilder();

    for (int testCase=1; testCase <= numTestCases; testCase++) {
      int numGuests = Integer.parseInt(reader.nextLine());

      Set<Integer> codes = new HashSet<Integer>();

      for (int guest=0; guest < numGuests; guest++) {
        int code = reader.nextInt();

        if (codes.contains(code)) codes.remove(code);
        else codes.add(code);
      }

      reader.nextLine();

      output.append("Case #").append(testCase).append(": ");
      output.append(codes.iterator().next()).append("\n");
    }

    reader.close();

    System.out.print(output);
  }
}