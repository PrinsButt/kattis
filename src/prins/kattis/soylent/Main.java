package prins.kattis.soylent;

// Problem url: https://open.kattis.com/problems/soylent
import java.util.Scanner;

class Main {

    private static final double CALORIES_PER_BOTTLE = 400.0;

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        try (Scanner reader = new Scanner(System.in)) {
            int numTestCases = Integer.parseInt(reader.nextLine());
            
            for (int testCase = 0; testCase < numTestCases; testCase++) {
                int calories = Integer.parseInt(reader.nextLine());
                int bottles = (int) Math.ceil(calories / CALORIES_PER_BOTTLE);
                
                output.append(bottles);
                output.append("\n");
            }
        }

        System.out.print(output);
    }
}
