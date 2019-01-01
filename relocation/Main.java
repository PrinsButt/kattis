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
      String parts[] = reader.nextLine().split(" ");

      if (parts[0].equals("1")) {
        locationsMap.replace(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
      }
      else {
        int firstCompany = locationsMap.get(Integer.parseInt(parts[1]));
        int secondCompany = locationsMap.get(Integer.parseInt(parts[2]));

        output.append(Math.abs(firstCompany - secondCompany)).append("\n");
      }
    }

    reader.close();
    System.out.print(output);
  }
}