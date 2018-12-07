// Problem url: https://open.kattis.com/problems/pokerhand

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String[] cards = reader.nextLine().split(" ");
    reader.close();

    Map<Character, Integer> countMap = new HashMap<Character, Integer>();

    for (int index=0; index < cards.length; index++) {
      char rank = cards[index].charAt(0);

      if (countMap.containsKey(rank)) {
        countMap.put(rank, countMap.get(rank) + 1);
      }
      else {
        countMap.put(rank, 1);
      }
    }

    int largest = 0;

    for (int value : countMap.values()) {
      if (value > largest) largest = value;
    }

    System.out.println(largest);
  }
}