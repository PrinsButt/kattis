package prins.kattis.t9spelling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * Problem URL: https://open.kattis.com/problems/t9spelling
 *
 * @author Prins Butt
 */
public class Main {

    public static void main(String[] args) {
        (new Main()).process();
    }

    private final Map<Character, List<Integer>> data;

    public Main() {
        data = new HashMap<>();
        data.put('a', new ArrayList<>(Arrays.asList(2, 1)));
        data.put('b', new ArrayList<>(Arrays.asList(2, 2)));
        data.put('c', new ArrayList<>(Arrays.asList(2, 3)));
        data.put('d', new ArrayList<>(Arrays.asList(3, 1)));
        data.put('e', new ArrayList<>(Arrays.asList(3, 2)));
        data.put('f', new ArrayList<>(Arrays.asList(3, 3)));
        data.put('g', new ArrayList<>(Arrays.asList(4, 1)));
        data.put('h', new ArrayList<>(Arrays.asList(4, 2)));
        data.put('i', new ArrayList<>(Arrays.asList(4, 3)));
        data.put('j', new ArrayList<>(Arrays.asList(5, 1)));
        data.put('k', new ArrayList<>(Arrays.asList(5, 2)));
        data.put('l', new ArrayList<>(Arrays.asList(5, 3)));
        data.put('m', new ArrayList<>(Arrays.asList(6, 1)));
        data.put('n', new ArrayList<>(Arrays.asList(6, 2)));
        data.put('o', new ArrayList<>(Arrays.asList(6, 3)));
        data.put('p', new ArrayList<>(Arrays.asList(7, 1)));
        data.put('q', new ArrayList<>(Arrays.asList(7, 2)));
        data.put('r', new ArrayList<>(Arrays.asList(7, 3)));
        data.put('s', new ArrayList<>(Arrays.asList(7, 4)));
        data.put('t', new ArrayList<>(Arrays.asList(8, 1)));
        data.put('u', new ArrayList<>(Arrays.asList(8, 2)));
        data.put('v', new ArrayList<>(Arrays.asList(8, 3)));
        data.put('w', new ArrayList<>(Arrays.asList(9, 1)));
        data.put('x', new ArrayList<>(Arrays.asList(9, 2)));
        data.put('y', new ArrayList<>(Arrays.asList(9, 3)));
        data.put('z', new ArrayList<>(Arrays.asList(9, 4)));
        data.put(' ', new ArrayList<>(Arrays.asList(0, 1)));
    }

    public void process() {
        StringBuilder output = new StringBuilder();

        try (Scanner reader = new Scanner(System.in)) {
            if (reader.hasNextLine()) {
                int numTestCases = Integer.parseInt(reader.nextLine());

                for (int index = 0; index < numTestCases; index++) {
                    String digits = messageToDigits(reader.nextLine());
                    output.append("Case #").append(index + 1).append(": ")
                            .append(digits).append("\n");
                }
            }
        }

        System.out.println(output);
    }

    private String messageToDigits(String message) {
        StringBuilder digits = new StringBuilder();

        for (char letter : message.toCharArray()) {
            List<Integer> values = data.get(letter);

            if (digits.toString().endsWith("" + values.get(0))) {
                digits.append(" ");
            }

            for (int index = 0; index < values.get(1); index++) {
                digits.append(values.get(0));
            }
        }

        return digits.toString();
    }
}