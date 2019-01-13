// Problem url: https://open.kattis.com/problems/racingalphabet

import java.util.Scanner;
import java.util.TreeSet;

class Main {

  private static double PICKUP_FEET = ( (2 * Math.PI * 30) / 28);
  private static double SPEED = 15.0;
    
  public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    int testCases = Integer.parseInt(reader.nextLine());

    StringBuilder output = new StringBuilder();
    TreeSet<Integer> valueSet = new TreeSet<Integer>();
            
    for (int testCase=0; testCase < testCases; testCase++) {
      char[] letters = reader.nextLine().toCharArray();

      int totalDifference = 0;

      for (int index=1; index < letters.length; index++) {
        int current = ((int) letters[index]) - 64;
        int previous = ((int) letters[index-1]) - 64;

        if (current == -25) current = 28;
        if (current == -32) current = 27;
        if (previous == -25) previous = 28;
        if (previous == -32) previous = 27;

        valueSet.add(current);
        valueSet.add(previous);

        int clockwiseDifference = valueSet.last() - valueSet.first();
        int antiClockwiseDifference = (28 - valueSet.last()) + valueSet.first();

        if (clockwiseDifference < antiClockwiseDifference) {
          totalDifference += clockwiseDifference;
        }
        else {
          totalDifference += antiClockwiseDifference;
        }
        
        valueSet.clear();
      }

      double time = ((totalDifference * PICKUP_FEET) / SPEED) + letters.length;
      output.append(time).append("\n");
    }

    reader.close();
    System.out.print(output);
  }
}