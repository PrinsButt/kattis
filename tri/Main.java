// Problem url: https://open.kattis.com/problems/tri

import java.util.Scanner;

class Main {

  private static String eval(int first, int second, int third) {
    if (first + second == third) return first + "+" + second;
    else if (first - second == third) return first + "-" + second;
    else if (first / second == third) return first + "/" + second;
    else if (first * second == third) return first + "*" + second;
    return "";
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int first = reader.nextInt();
    int second = reader.nextInt();
    int third = reader.nextInt();
    reader.close();

    String result = eval(first, second, third);

    if (!result.equals("")) System.out.println(result + "=" + third);
    else System.out.println(first + "=" + eval(second, third, first));
  }
}