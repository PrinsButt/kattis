package prins.kattis.mixed_fractions;

// Problem url: https://open.kattis.com/problems/mixedfractions
import java.math.BigInteger;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        try (Scanner reader = new Scanner(System.in)) {
            while (true) {
                try {
                    BigInteger numerator = reader.nextBigInteger();
                    BigInteger denominator = reader.nextBigInteger();
                    reader.nextLine();
                    
                    if (numerator.compareTo(new BigInteger("0")) == 0
                            && denominator.compareTo(new BigInteger("0")) == 0) {
                        break;
                    }
                    
                    if (denominator.compareTo(new BigInteger("0")) == 0) {
                        break;
                    }
                    
                    output.append(numerator.divide(denominator));
                    output.append(" ");
                    output.append(numerator.mod(denominator));
                    output.append(" / ");
                    output.append(denominator);
                    output.append("\n");
                } catch (Exception e) {
                    break;
                }
            }
        }

        System.out.print(output);
    }
}
