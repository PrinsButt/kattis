// Problem url: https://open.kattis.com/problems/isithalloween

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String date = reader.nextLine();
    reader.close();

    if (date.toUpperCase().equals("OCT 31") || date.toUpperCase().equals("DEC 25")) {
      System.out.println("yup");
    }
    else System.out.println("nope");
  }
}