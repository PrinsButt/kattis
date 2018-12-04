// Problem url: https://open.kattis.com/problems/qaly

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int qualityPeriods = Integer.parseInt(reader.nextLine());

    float qaly = 0;

    for (int period=0; period < qualityPeriods; period++) {
      float quality = reader.nextFloat();
      float years = reader.nextFloat();
      qaly += (quality * years);

      reader.nextLine();
    }
    
    reader.close();

    System.out.println(qaly);
  }
}