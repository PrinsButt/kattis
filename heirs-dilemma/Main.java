// Problem url: https://open.kattis.com/problems/heirsdilemma

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
  public static boolean isValidCombination(int number) {
    char[] digits = String.valueOf(number).toCharArray();
    Set<Integer> digitSet = new HashSet<Integer>();

    for (char digit : digits) {
      int value = Character.getNumericValue(digit);

      if (value <= 0) return false;
      if (digitSet.contains(value)) return false;
      if (number % value != 0) return false;

      digitSet.add(value);
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int min = reader.nextInt();
    int max = reader.nextInt();
    reader.close();

    int combinations = 0;

    for (int number = min; number <= max; number++) {
      if (isValidCombination(number)) {
        combinations++;
      }
    }

    System.out.println(combinations);
  }
}