package prins.kattis.bela;

// Problem url: https://open.kattis.com/problems/bela
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Map<String, Integer> dominant = new HashMap<>();
        dominant.put("A", 11);
        dominant.put("K", 4);
        dominant.put("Q", 3);
        dominant.put("J", 20);
        dominant.put("T", 10);
        dominant.put("9", 14);

        Map<String, Integer> dominated = new HashMap<>();
        dominated.put("A", 11);
        dominated.put("K", 4);
        dominated.put("Q", 3);
        dominated.put("J", 2);
        dominated.put("T", 10);

        int total = 0;

        try (Scanner reader = new Scanner(System.in)) {
            int hands = reader.nextInt();
            String suit = reader.nextLine().trim();

            for (int index = 0; index < 4 * hands; index++) {
                String card = reader.nextLine();
                String cardValue = "" + card.charAt(0);
                String cardSuit = "" + card.charAt(1);

                if (cardSuit.equals(suit)) {
                    if (dominant.containsKey(cardValue)) {
                        total += dominant.get(cardValue);
                    }
                } else {
                    if (dominated.containsKey(cardValue)) {
                        total += dominated.get(cardValue);
                    }
                }
            }
        }

        System.out.println(total);
    }
}
