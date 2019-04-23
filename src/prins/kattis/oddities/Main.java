package prins.kattis.oddities;

// Problem url: https://open.kattis.com/problems/oddities
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String output = "";

        try (Scanner reader = new Scanner(System.in)) {
            int numTestCases = Integer.parseInt(reader.nextLine());
            
            for (int testCase = 0; testCase < numTestCases; testCase++) {
                int numX = Integer.parseInt(reader.nextLine());
                
                if (numX % 2 == 0) {
                    output += (numX + " is even");
                } else {
                    output += (numX + " is odd");
                }
                
                if (testCase != numTestCases - 1) {
                    output += "\n";
                }
            }
        }

        System.out.println(output);
    }
}
