package prins.kattis.nasty_hacks;

// Problem url: https://open.kattis.com/problems/nastyhacks
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String output = "";

        try (Scanner reader = new Scanner(System.in)) {
            int numTestCases = Integer.parseInt(reader.nextLine());
            
            for (int testCase = 0; testCase < numTestCases; testCase++) {
                int numR = reader.nextInt();
                int numE = reader.nextInt();
                int numC = reader.nextInt();
                reader.nextLine();
                
                if (numR > (numE - numC)) {
                    output += "do not advertise";
                } else if (numR == (numE - numC)) {
                    output += "does not matter";
                } else {
                    output += "advertise";
                }
                
                if (testCase != numTestCases - 1) {
                    output += "\n";
                }
            }
        }

        System.out.println(output);
    }
}
