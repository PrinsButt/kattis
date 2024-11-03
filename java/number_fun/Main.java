package prins.kattis.number_fun;

// Problem url: https://open.kattis.com/problems/numberfun
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuffer output = new StringBuffer();

        try (Scanner reader = new Scanner(System.in)) {
            int numTestCases = Integer.parseInt(reader.nextLine());
            
            for (int testCase = 0; testCase < numTestCases; testCase++) {
                float numA = reader.nextFloat();
                float numB = reader.nextFloat();
                float numC = reader.nextFloat();
                reader.nextLine();
                
                if (numA + numB == numC
                        || numA - numB == numC
                        || numB - numA == numC
                        || numA * numB == numC
                        || numA / numB == numC
                        || numB / numA == numC) {
                    
                    output.append("Possible\n");
                } else {
                    output.append("Impossible\n");
                }
            }
        }

        System.out.print(output);
    }
}
