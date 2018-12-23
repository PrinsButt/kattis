// Problem url: https://open.kattis.com/problems/sevenwonders

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String line = reader.nextLine();
    reader.close();

    Map<Character, Integer> cardsMap = new HashMap<Character, Integer>();
    cardsMap.put('T', 0);
    cardsMap.put('C', 0);
    cardsMap.put('G', 0);

    for (char digit : line.toCharArray()) {
      cardsMap.replace(digit, cardsMap.get(digit) + 1);
    }

    int points = 0;

    for (Map.Entry<Character, Integer> entry : cardsMap.entrySet()) {
      points += Math.pow(entry.getValue(), 2);
    }

    while (cardsMap.get('T') > 0 && cardsMap.get('C') > 0 && cardsMap.get('G') > 0) {
      points += 7;
      cardsMap.replace('T', cardsMap.get('T') - 1);
      cardsMap.replace('C', cardsMap.get('C') - 1);
      cardsMap.replace('G', cardsMap.get('G') - 1);
    }

    System.out.print(points);
  }
}