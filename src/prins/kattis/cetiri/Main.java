package prins.kattis.cetiri;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Problem URL: https://open.kattis.com/problems/cetiri
 *
 * @author Prins Butt
 */
public class Main {

    private int[] retrieveNumbers() {
        int[] numbers;

        try (Scanner reader = new Scanner(System.in)) {
            numbers = Stream.of(reader.nextLine().split(" "))
                    .mapToInt(Integer::valueOf)
                    .toArray();
        }

        Arrays.sort(numbers);
        return numbers;
    }

    private int findCommonDifference(int[] numbers) {
        int firstDifference = numbers[1] - numbers[0];
        int secondDifference = numbers[2] - numbers[1];

        if (firstDifference < secondDifference) {
            return numbers[1] - numbers[0];
        }

        return numbers[2] - numbers[1];
    }

    private int findMissingTerm(int[] sortedNumbers, int commonDifference) {
        int missingTerm = sortedNumbers[sortedNumbers.length - 1]
                + commonDifference;

        for (int index = 1; index < sortedNumbers.length; index++) {
            int term = (sortedNumbers[index] - commonDifference);

            if (term != sortedNumbers[index - 1]) {
                missingTerm = term;
                break;
            }
        }

        return missingTerm;
    }

    public void process() {
        int[] data = retrieveNumbers();
        int commonDifference = findCommonDifference(data);
        System.out.println(findMissingTerm(data, commonDifference));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.process();
    }
}
