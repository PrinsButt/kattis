// Problem url: https://open.kattis.com/problems/kornislav

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> sides = new ArrayList<Integer>();
    Scanner reader = new Scanner(System.in);
    for (int side=0; side < 4; side++) sides.add(reader.nextInt());
    reader.close();
    Collections.sort(sides);
    System.out.println(sides.get(0) * sides.get(2));
  }
}