package prins.kattis.pot;

// Problem url: https://open.kattis.com/problems/pot
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numEntries = Integer.parseInt(reader.nextLine());

        int sum = 0;

        for (int index = 0; index < numEntries; index++) {
            String entry = reader.nextLine();
            int base = Integer.parseInt(entry.substring(0, entry.length() - 1));
            int exponent = Integer.parseInt(entry.substring(entry.length() - 1));
            sum += Math.pow(base, exponent);
        }

        reader.close();

        System.out.println(sum);
    }
}
