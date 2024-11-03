package prins.kattis.encoded_message;

// Problem url: https://open.kattis.com/problems/encodedmessage
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        
        try (Scanner reader = new Scanner(System.in)) {
            int numTestCases = Integer.parseInt(reader.nextLine());
            
            for (int testCase = 0; testCase < numTestCases; testCase++) {
                String encoded = reader.nextLine();
                int length = (int) Math.sqrt(encoded.length());
                
                char[][] decoded = new char[length][length];
                
                int index = 0;
                
                for (int col = 0; col < length; col++) {
                    for (int row = length - 1; row >= 0; row--) {
                        decoded[row][col] = encoded.charAt(index);
                        index++;
                    }
                }
                
                for (int row = 0; row < length; row++) {
                    for (int col = 0; col < length; col++) {
                        output.append(decoded[row][col]);
                    }
                }
                
                output.append("\n");
            }
        }

        System.out.print(output);
    }
}
