package prins.kattis.romans;

// Problem url: https://open.kattis.com/problems/romans
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double englishPaces = reader.nextDouble();
        reader.close();

        double romanPaces = englishPaces * (1000.0 * (5280.0 / 4854.0));

        BigDecimal bd = new BigDecimal(romanPaces);
        int length = bd.toBigInteger().toString().length();
        bd = bd.round(new MathContext(length, RoundingMode.HALF_UP));
        System.out.println(bd.intValue());
    }
}
