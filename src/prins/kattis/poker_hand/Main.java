package prins.kattis.poker_hand;

// Problem url: https://open.kattis.com/problems/pokerhand
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String[] cards;

        try (Scanner reader = new Scanner(System.in)) {
            cards = reader.nextLine().split(" ");
        }

        Map<Character, Integer> countMap = new HashMap<>();

        for (String card : cards) {
            char rank = card.charAt(0);

            if (countMap.containsKey(rank)) {
                countMap.put(rank, countMap.get(rank) + 1);
            } else {
                countMap.put(rank, 1);
            }
        }

        int largest = 0;

        for (int value : countMap.values()) {
            if (value > largest) {
                largest = value;
            }
        }

        System.out.println(largest);
    }
}
