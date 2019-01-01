// Problem url: https://open.kattis.com/problems/relocation

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int companies = reader.nextInt();
    int requests = reader.nextInt();
    reader.nextLine();

    // initial locations
    String locations[] = reader.nextLine().split(" ");

    // process requests
    StringBuilder output = new StringBuilder();

    for (int request=0; request < requests; request++) {
      String parts[] = reader.nextLine().split(" ");

      if (parts[0].equals("1")) locations[Integer.parseInt(parts[1]) - 1] = parts[2];
      else {
        int firstCompany = Integer.parseInt(locations[Integer.parseInt(parts[1]) - 1]);
        int secondCompany = Integer.parseInt(locations[Integer.parseInt(parts[2]) - 1]);

        output.append(Math.abs(firstCompany - secondCompany)).append("\n");
      }
    }

    reader.close();
    System.out.print(output);
  }
}