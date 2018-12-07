// Problem url: https://open.kattis.com/problems/whatdoesthefoxsay

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numTestCases = Integer.parseInt(reader.nextLine());

    for (int testCase=0; testCase < numTestCases; testCase++) {
      String recording = reader.nextLine();

      String info = "";

      while (!info.equals("what does the fox say?")) {
        info = reader.nextLine();
        String[] parts = info.split(" ");

        recording = recording.replaceAll("\\b"+parts[2]+"\\b", "");
        recording = recording.replaceAll("\\s{2,}", " ");
        recording = recording.trim();
      }

      System.out.println(recording);
    }

    reader.close();
  }
}