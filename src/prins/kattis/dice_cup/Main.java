package prins.kattis.dice_cup;

// Problem url: https://open.kattis.com/problems/dicecup
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int numN;
        int numM;
        
        try (Scanner reader = new Scanner(System.in)) {
            numN = reader.nextInt();
            numM = reader.nextInt();
        }

        Map<Integer, Integer> sumsMap = new HashMap<>();
        int highestTally = 0;

        for (int first = 1; first <= numN; first++) {
            for (int second = 1; second <= numM; second++) {
                int sum = first + second;
                int tally = 1;

                if (sumsMap.containsKey(sum)) {
                    tally = sumsMap.get(sum) + 1;
                    sumsMap.replace(sum, tally);
                } else {
                    sumsMap.put(sum, tally);
                }

                if (tally > highestTally) {
                    highestTally = tally;
                }
            }
        }

        for (int key : sumsMap.keySet()) {
            int tally = sumsMap.get(key);
            if (tally == highestTally) {
                System.out.println(key);
            }
        }
    }
}
