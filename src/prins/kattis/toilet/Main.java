package prins.kattis.toilet;

// Problem url: https://open.kattis.com/problems/toilet
import java.util.Scanner;

class Main {

    public static int adjustments(char initial, char[] prefs) {
        int sum = 0;
        char prevPref = initial;

        for (char pref : prefs) {
            if (pref != prevPref) {
                sum += 1;
            }
            prevPref = pref;
        }

        return sum;
    }

    public static int adjustments(char initial, char[] prefs, char policy) {
        int sum = 0;

        for (int index = 0; index < prefs.length; index++) {
            char pref = prefs[index];

            if (index == 0) {
                if (pref == policy) {
                    if (pref != initial) {
                        sum += 1;
                    }
                } else {
                    sum += 1;

                    if (pref != initial) {
                        sum += 1;
                    }
                }
            } else if (pref != policy) {
                sum += 2;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String data;
        
        try (Scanner reader = new Scanner(System.in)) {
            data = reader.nextLine();
        }

        char initial = data.charAt(0);
        char[] prefs = data.substring(1).toCharArray();

        System.out.println(adjustments(initial, prefs, 'U'));
        System.out.println(adjustments(initial, prefs, 'D'));
        System.out.println(adjustments(initial, prefs));
    }
}
