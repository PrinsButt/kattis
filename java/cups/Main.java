package prins.kattis.cups;

// Problem url: https://open.kattis.com/problems/cups
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numTestCases = Integer.parseInt(reader.nextLine());

        Map<Double, String> coloursMap = new TreeMap<>();

        for (int testCase = 0; testCase < numTestCases; testCase++) {
            String data[] = reader.nextLine().split(" ");

            if (data[0].matches("[0-9]+")) {
                double diameter = Double.parseDouble(data[0]);
                coloursMap.put(diameter / 2.0, data[1]);
            } else {
                double radius = Double.parseDouble(data[1]);
                coloursMap.put(radius, data[0]);
            }
        }

        reader.close();

        coloursMap.entrySet().forEach((entry) -> {
            System.out.println(entry.getValue());
        });
    }
}
