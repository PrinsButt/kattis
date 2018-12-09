// Problem url: https://open.kattis.com/problems/ptice

import java.util.Scanner;

class Main {
  public static int calculate(String answers, String pattern) {
    int numCorrect = 0;

    for (int index=0; index < answers.length(); index++) {
      char actualAnswer = answers.charAt(index);
      char patternAnswer = pattern.charAt(index % pattern.length());

      if (actualAnswer == patternAnswer) numCorrect++;
    }

    return numCorrect;
  }
  
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numQuestions = Integer.parseInt(reader.nextLine());
    String answers = reader.nextLine().toUpperCase();
    reader.close();

    int adrian = calculate(answers, "ABC");
    int bruno = calculate(answers, "BABC");
    int goran = calculate(answers, "CCAABB");

    int highest = adrian;
    if (bruno > highest) highest = bruno;
    if (goran > highest) highest = goran;

    System.out.println(highest);

    if (adrian == highest) System.out.println("Adrian");
    if (bruno == highest) System.out.println("Bruno");
    if (goran == highest) System.out.println("Goran");
  }
}