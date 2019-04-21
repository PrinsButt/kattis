// Problem url: https://open.kattis.com/problems/onechicken

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numPeople = reader.nextInt();
    int numPieces = reader.nextInt();
    reader.close();
    
    int difference = numPieces - numPeople;

    if (difference < 0) {
      System.out.print("Dr. Chaz needs " + (-difference) + " more ");
      System.out.print((-difference == 1) ? "piece" : "pieces");
      System.out.println(" of chicken!");
    } else {
      System.out.print("Dr. Chaz will have " + difference + " ");
      System.out.print((difference == 1) ? "piece" : "pieces");
      System.out.println(" of chicken left over!");
    }
  }
}