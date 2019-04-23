package prins.kattis.harshad_numbers;

// Problem url: https://open.kattis.com/problems/harshadnumbers
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int number;

        try (Scanner reader = new Scanner(System.in)) {
            number = Integer.parseInt(reader.nextLine());
        }

        boolean foundHarshard = false;

        while (!foundHarshard) {
            String digits = String.valueOf(number);
            int sum = 0;

            for (char digit : digits.toCharArray()) {
                sum += Character.getNumericValue(digit);
            }

            if (number % sum == 0) {
                foundHarshard = true;
            } else {
                number++;
            }
        }

        System.out.print(number);
    }
}
