// Problem url: https://open.kattis.com/problems/railroad2

import java.util.Scanner;
import java.util.TreeSet;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int testCases = Integer.parseInt(reader.nextLine());

    StringBuilder output = new StringBuilder();

    for (int testCase=0; testCase < testCases; testCase++) {
      TreeSet<Integer> distanceSet = new TreeSet<Integer>();
      int stores = Integer.parseInt(reader.nextLine());

      for (int store=0; store < stores; store++) {
        distanceSet.add(reader.nextInt());
      }

      reader.nextLine();

      output.append(2 * (distanceSet.last() - distanceSet.first())).append("\n");
    }

    reader.close();
    
    System.out.print(output);
  }
}