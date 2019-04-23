package prins.kattis.conundrum;

// Problem url: https://open.kattis.com/problems/conundrum
import java.util.Scanner;

class Main {

    private static final String NAME = "PER";

    public static void main(String[] args) {
        String cipher;
        
        try (Scanner reader = new Scanner(System.in)) {
            cipher = reader.nextLine().toUpperCase();
        }

        int days = 0;

        for (int index = 0; index < cipher.length(); index++) {
            if (cipher.charAt(index) != NAME.charAt(index % 3)) {
                days++;
            }
        }

        System.out.println(days);
    }
}
