// Problem url: https://open.kattis.com/problems/apaxiaaans

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println(reader.nextLine().replaceAll("(.)\\1{1,}", "$1"));
    reader.close();
  }
}