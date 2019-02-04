// Problem url: https://open.kattis.com/problems/simonsays

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numSentences = Integer.parseInt(reader.nextLine());
    
    StringBuilder output = new StringBuilder();

    for (int index=0; index < numSentences; index++) {
      String sentence = reader.nextLine();
      if (sentence.startsWith("Simon says ")) {
        String processed = sentence.substring("Simon says ".length());
        output.append(processed).append("\n");
      }
    }
    
    reader.close();
    System.out.println(output);
  }
}