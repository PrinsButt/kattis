// Problem url: https://open.kattis.com/problems/sibice

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int num_matches = reader.nextInt();
    int width = reader.nextInt();
    int height = reader.nextInt();
    reader.nextLine();
    
    String output = "";

    for (int match=0; match < num_matches; match++) {
      int length = Integer.parseInt(reader.nextLine());
      double longest = Math.floor(Math.sqrt( Math.pow(width, 2) + Math.pow(height, 2)));
      
      if (length <= longest) output += "DA";
      else output += "NE";

      if (match < num_matches - 1) output += "\n";
    }

    reader.close();

    System.out.println(output);
  }
}