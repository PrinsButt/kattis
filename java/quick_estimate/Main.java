package prins.kattis.quick_estimate;

// Problem url: https://open.kattis.com/problems/quickestimate
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuffer output = new StringBuffer();
        
        try (Scanner reader = new Scanner(System.in)) {
            int numTestCases = Integer.parseInt(reader.nextLine());
            
            
            for (int testCase = 0; testCase < numTestCases; testCase++) {
                String cost = reader.nextLine();
                
                output.append(cost.length());
                output.append("\n");
            }
        }

        System.out.print(output);
    }
}
