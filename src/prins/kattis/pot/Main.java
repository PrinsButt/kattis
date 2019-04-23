package prins.kattis.pot;

// Problem url: https://open.kattis.com/problems/pot
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int sum = 0;

        try (Scanner reader = new Scanner(System.in)) {
            int numEntries = Integer.parseInt(reader.nextLine());
            
            for (int index = 0; index < numEntries; index++) {
                String entry = reader.nextLine();
                int base = Integer.parseInt(entry.substring(0, entry.length() - 1));
                int exponent = Integer.parseInt(entry.substring(entry.length() - 1));
                sum += Math.pow(base, exponent);
            }
        }

        System.out.println(sum);
    }
}
