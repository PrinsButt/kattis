package prins.kattis.no_duplicates;

// Problem url: https://open.kattis.com/problems/nodup
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

    public static boolean search(String needle, List<String> haystack) {
        if (haystack.contains(needle)) {
            return true;
        } else {
            String next = haystack.get(0);
            haystack.remove(0);

            if (haystack.size() > 1) {
                return Main.search(next, haystack);
            } else if (haystack.size() == 1) {
                return next.equals(haystack.get(0));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String line;
        
        try (Scanner reader = new Scanner(System.in)) {
            line = reader.nextLine().toUpperCase();
        }

        List<String> haystack = new ArrayList<>(Arrays.asList(line.split(" ")));

        if (haystack.size() <= 1) {
            System.out.println("yes");
        } else {
            String needle = haystack.get(0);
            haystack.remove(0);

            if (Main.search(needle, haystack)) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}
