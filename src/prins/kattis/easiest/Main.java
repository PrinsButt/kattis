package prins.kattis.easiest;

// Problem url: https://open.kattis.com/problems/easiest
import java.util.Scanner;

class Main {

    private static int sumDigits(int number) {
        int sum = 0;

        for (char digit : ("" + number).toCharArray()) {
            sum += Character.getNumericValue(digit);
        }

        return sum;
    }

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        
        try (Scanner reader = new Scanner(System.in)) {
            int testCase = Integer.parseInt(reader.nextLine());
            
            while (testCase != 0) {
                int number = 11;
                
                while (true) {
                    if (sumDigits(testCase) == sumDigits(testCase * number)) {
                        break;
                    }
                    
                    number++;
                }

                output.append(number).append("\n");
                testCase = Integer.parseInt(reader.nextLine());
            }
        }
        
        System.out.println(output);
    }
}
