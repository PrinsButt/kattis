package prins.kattis.heart_rate;

// Problem url: https://open.kattis.com/problems/heartrate
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        List<String> results = new ArrayList<>();

        try (Scanner reader = new Scanner(System.in)) {
            int numTestCases = Integer.parseInt(reader.nextLine());

            for (int testCase = 0; testCase < numTestCases; testCase++) {
                int beats = reader.nextInt();
                float seconds = reader.nextFloat();

                float bpm = (beats / seconds) * 60;
                float minABPM = bpm - (60 / seconds);
                float maxABPM = bpm + (60 / seconds);

                String formatted = String.format("%.4f %.4f %.4f",
                        minABPM, bpm, maxABPM);

                results.add(formatted);
            }
        }

        results.forEach((result) -> {
            System.out.println(result);
        });
    }
}
