// Problem url: https://open.kattis.com/problems/detaileddifferences

import java.util.Scanner;

class Main {

  public static String process(String firstLine, String secondLine) {
    StringBuffer outcome = new StringBuffer();

    for (int index=0; index < firstLine.length(); index++) {
      if (firstLine.charAt(index) == secondLine.charAt(index)) outcome.append(".");
      else outcome.append("*");
    }

    return outcome.toString();
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numTestCases = Integer.parseInt(reader.nextLine());

    StringBuffer output = new StringBuffer();

    for (int testCase=0; testCase < numTestCases; testCase++) {
      String firstLine = reader.nextLine();
      String secondLine = reader.nextLine();

      String outcome = Main.process(firstLine, secondLine);

      output.append(firstLine);
      output.append("\n");
      output.append(secondLine);
      output.append("\n");
      output.append(outcome);
      output.append("\n\n");
    }

    reader.close();

    System.out.print(output);
  }
}