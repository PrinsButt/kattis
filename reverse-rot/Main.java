// Problem url: https://open.kattis.com/problems/reverserot

import java.util.Scanner;

class Main {

  public static final String REF = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String line = "";
    StringBuilder output = new StringBuilder();
    
    while (!(line = reader.nextLine()).equals("0")){
      String parts[] = line.split(" ");
      int rotations = Integer.parseInt(parts[0]);
      StringBuilder encrypted = new StringBuilder(parts[1]);
      
      encrypted.reverse();

      for (char character : encrypted.toString().toCharArray()) {
        int initial = REF.indexOf(character);
        int shifted = (initial + rotations) % REF.length();
        output.append(REF.charAt(shifted));
      }

      output.append("\n");
    }
    
    System.out.println(output);
    reader.close();
  }
}