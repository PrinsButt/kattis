// Problem url: https://open.kattis.com/problems/babybites

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int bites = Integer.parseInt(reader.nextLine());
    String words[] = reader.nextLine().split(" ");
    reader.close();

    boolean isFishy = false;

    for (int bite=1; bite <= bites; bite++) {
      if (!words[bite-1].equals(""+bite) && !words[bite-1].equals("mumble")) {
        isFishy = true;
        break;
      }
    }

    if (isFishy) System.out.println("something is fishy");
    else System.out.println("makes sense");
  }
}