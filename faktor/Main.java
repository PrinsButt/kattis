// Problem url: https://open.kattis.com/problems/faktor

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numArticles = reader.nextInt();
    int impactFactor = reader.nextInt();
    reader.close();
    int minScientists = (numArticles * (impactFactor - 1)) + 1;
    System.out.println(minScientists); 
  }
}