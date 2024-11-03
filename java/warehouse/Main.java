package prins.kattis.warehouse;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Problem URL: https://open.kattis.com/problems/warehouse
 *
 * @author Prins Butt
 */
public class Main {

    public static void main(String[] args) {
        (new Main()).process();
    }

    private final Map<String, Integer> uniqueToys;

    public Main() {
        uniqueToys = new TreeMap<>();
    }

    public void process() {
        StringBuilder output = new StringBuilder();
        int numShipments;
        int numTestCases;

        try (Scanner reader = new Scanner(System.in)) {
            numTestCases = Integer.parseInt(reader.nextLine());

            for (int testCase = 0; testCase < numTestCases; testCase++) {
                uniqueToys.clear();

                numShipments = Integer.parseInt(reader.nextLine());

                for (int shipment = 0; shipment < numShipments; shipment++) {
                    String data[] = reader.nextLine().split(" ");

                    if (uniqueToys.containsKey(data[0])) {
                        uniqueToys.put(data[0], uniqueToys.get(data[0])
                                + Integer.parseInt(data[1]));
                    } else {
                        uniqueToys.put(data[0], Integer.parseInt(data[1]));
                    }
                }

                output.append(prepareResults());
            }
        }

        System.out.println(output);
    }

    private String prepareResults() {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        uniqueToys.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        StringBuilder output = new StringBuilder();
        output.append(sortedMap.size()).append("\n");
        sortedMap.forEach((toy, quantity) -> {
            output.append(toy).append(" ").append(quantity).append("\n");
        });

        return output.toString();
    }
}
