// Problem url: https://open.kattis.com/problems/freefood

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numEvents = Integer.parseInt(reader.nextLine());

    Set<Integer> days = new HashSet<Integer>();

    for (int event=0; event < numEvents; event++) {
      int startDay = reader.nextInt();
      int endDay = reader.nextInt();

      for (int day=startDay; day <= endDay; day++) days.add(day);

      reader.nextLine();
    }

    reader.close();

    System.out.println(days.size());
  }
}