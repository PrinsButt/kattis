// Problem url: https://open.kattis.com/problems/skener

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int rows = reader.nextInt();
    int cols = reader.nextInt();
    int zr = reader.nextInt();
    int zc = reader.nextInt();
    reader.nextLine();

    StringBuffer output = new StringBuffer();

    for (int rowIndex=0; rowIndex < rows; rowIndex++) {
      String inLine = reader.nextLine();
      String outLine = "";

      for (char digit : inLine.toCharArray()) {
        for (int zcIndex=0; zcIndex < zc; zcIndex++) {
          outLine += digit;
        }
      }

      for (int zrIndex=0; zrIndex < zr; zrIndex++) {      
		output.append(outLine).append("\n");
      }
    }

    reader.close();

    System.out.print(output);
  }
}