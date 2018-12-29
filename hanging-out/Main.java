// Problem url: https://open.kattis.com/problems/hangingout

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int limit = reader.nextInt();
    int events = reader.nextInt();
    reader.nextLine();

    int peopleOnTerrace = 0;
    int groupsDenied = 0;

    for (int event=0; event < events; event++) {
      String details[] = reader.nextLine().split(" ");
      int groupSize = Integer.parseInt(details[1]);

      if (details[0].equals("enter")) {
        if (peopleOnTerrace + groupSize > limit) groupsDenied++;
        else peopleOnTerrace += groupSize;
      }
      else {
        peopleOnTerrace -= groupSize;
      }
    }

    reader.close();

    System.out.println(groupsDenied);
  }
}