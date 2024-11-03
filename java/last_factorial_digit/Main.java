package prins.kattis.last_factorial_digit;

// Problem url: https://open.kattis.com/problems/lastfactorialdigit
import java.util.Scanner;

class Main {

    public static int factorial(int digit) {
        int factorial = 1;

        for (int i = 1; i <= digit; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        String output = "";

        try (Scanner reader = new Scanner(System.in)) {
            int testCases = Integer.parseInt(reader.nextLine());

            for (int testCase = 0; testCase < testCases; testCase++) {
                int digit = Integer.parseInt(reader.nextLine());
                String digitAsString = "" + Main.factorial(digit);
                String lastDigit = digitAsString.substring(digitAsString.length() - 1);
                output += lastDigit;

                if (testCase < testCases - 1) {
                    output += "\n";
                }
            }
        }

        System.out.println(output);
    }
}
