// Problem url: https://open.kattis.com/problems/relocation

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int companies = reader.nextInt();
    int requests = reader.nextInt();
    reader.nextLine();

    Map<Integer, Integer> locationsMap = new HashMap<Integer, Integer>();

    // initial locations
    for (int company=1; company <= companies; company++) {
      locationsMap.put(company, reader.nextInt());
    }

    reader.nextLine();

    // process requests
    StringBuilder output = new StringBuilder();

    for (int request=1; request <= requests; request++) {
      if (reader.nextInt() == 1) {
        locationsMap.replace(reader.nextInt(), reader.nextInt());
      }
      else {
        int firstCompany = locationsMap.get(reader.nextInt());
        int secondCompany = locationsMap.get(reader.nextInt());

        output.append(Math.abs(firstCompany - secondCompany)).append("\n");
      }

      reader.nextLine();
    }

    reader.close();
    System.out.print(output);
  }
}