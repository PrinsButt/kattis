package prins.kattis.everywhere;

// Problem url: https://open.kattis.com/problems/everywhere
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numTestCases = Integer.parseInt(reader.nextLine());

        List<Integer> results = new ArrayList<>();

        for (int testCase = 0; testCase < numTestCases; testCase++) {
            int numTrips = Integer.parseInt(reader.nextLine());

            Set<String> distinctCities = new HashSet<>();

            for (int trip = 0; trip < numTrips; trip++) {
                distinctCities.add(reader.nextLine());
            }

            results.add(distinctCities.size());
        }

        reader.close();

        results.forEach((result) -> {
            System.out.println(result);
        });
    }
}
