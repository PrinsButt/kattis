// Problem url: https://open.kattis.com/problems/grassseed

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    double cost = Double.parseDouble(reader.nextLine());
    int lawns = Integer.parseInt(reader.nextLine());

    double surface = 0.0;

    for (int lawn=0; lawn < lawns; lawn++) {
      double width = reader.nextDouble();
      double length = reader.nextDouble();

      surface += (width * length);
    }

    reader.close();

    String formatted = String.format("%.7f", surface * cost);
    System.out.println(formatted);
  }
}