package prins.kattis.alphabet_spam;

// Problem url: https://open.kattis.com/problems/alphabetspam
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String line;

        try (Scanner reader = new Scanner(System.in)) {
            line = reader.nextLine();
        }

        double length = line.length();

        System.out.println(line.replaceAll("[^_]", "").length() / length);
        System.out.println(line.replaceAll("[^a-z]", "").length() / length);
        System.out.println(line.replaceAll("[^A-Z]", "").length() / length);
        System.out.println(line.replaceAll("[_a-zA-Z]", "").length() / length);
    }
}
