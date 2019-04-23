package prins.kattis.zanzibar;

// Problem url: https://open.kattis.com/problems/zanzibar
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        
        try (Scanner reader = new Scanner(System.in)) {
            int numTestCases = Integer.parseInt(reader.nextLine());
            
            for (int testCase = 0; testCase < numTestCases; testCase++) {
                int imported = 0;
                int prevTurtles = 1;
                int totalTurtles = 0;
                
                while (totalTurtles < 1000000) {
                    int turtles = reader.nextInt();
                    
                    if (turtles == 0) {
                        break;
                    }
                    
                    if (turtles - (prevTurtles * 2) > 0) {
                        imported += (turtles - (prevTurtles * 2));
                    }
                    
                    prevTurtles = turtles;
                    totalTurtles += turtles;
                }
                
                reader.nextLine();
                output.append(imported).append("\n");
            }
        }

        System.out.print(output);
    }
}
