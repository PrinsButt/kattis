package prins.kattis.planetaris;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * Problem URL: https://open.kattis.com/problems/planetaris
 *
 * @author Prins Butt
 */
public class Main {

    public static void main(String[] args) {
        (new Main()).process();
    }

    private void process() {
        try (Scanner reader = new Scanner(System.in)) {
            if (reader.hasNextLine()) {
                reader.nextInt();
                int numShips = reader.nextInt();
                reader.nextLine();

                int data[] = Stream.of(reader.nextLine().split(" "))
                        .mapToInt(Integer::valueOf)
                        .toArray();

                Arrays.sort(data);

                int battlesWon = 0;

                for (int index = 0; index < data.length; index++) {
                    if (numShips >= (data[index] + 1)) {
                        numShips -= (data[index] + 1);
                        battlesWon++;
                    }
                }

                System.out.println(battlesWon);
            }
        }
    }
}
