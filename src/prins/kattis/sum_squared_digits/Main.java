package prins.kattis.sum_squared_digits;

// Problem url: https://open.kattis.com/problems/sumsquareddigits
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        try (Scanner reader = new Scanner(System.in)) {
            int numDataSets = Integer.parseInt(reader.nextLine());
            
            for (int index = 0; index < numDataSets; index++) {
                int id = reader.nextInt();
                int base = reader.nextInt();
                double num = reader.nextDouble();
                reader.nextLine();
                
                double quotient = num;
                int ssd = 0;
                
                while (quotient > 0) {
                    ssd += Math.pow(quotient % base, 2);
                    quotient = Math.floor(quotient / base);
                }
                
                output.append(id).append(" ").append(ssd);
                
                if (index < numDataSets - 1) {
                    output.append("\n");
                }
            }
        }

        System.out.println(output);
    }
}
