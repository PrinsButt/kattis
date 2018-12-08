// Problem url: https://open.kattis.com/problems/modulo

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    Set<Integer> distinctSet = new HashSet<Integer>();

    for (int index=0; index < 10; index++) {
      int num = Integer.parseInt(reader.nextLine());

      distinctSet.add(num % 42);
    }

    reader.close();

    System.out.println(distinctSet.size());
  }
}