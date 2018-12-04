// Problem url: https://open.kattis.com/problems/filip

import java.util.Scanner;

class Main {
  public static int reverse(int num) {
    String reversed = "";
    for (char letter : ("" + num).toCharArray()) {
      reversed = ("" + letter + reversed);
    }
    return Integer.parseInt(reversed);
  }
  
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numA = reader.nextInt();
    int numB = reader.nextInt();
    reader.close();

    int revA = Main.reverse(numA);
    int revB = Main.reverse(numB);

    if (revA > revB) System.out.println(revA);
    else System.out.println(revB);
  }
}