package prins.kattis.alphabet_spam;

// Problem url: https://open.kattis.com/problems/alphabetspam
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        reader.close();

        double allLength = line.length();
        System.out.println(line.replaceAll("[^_]", "").length() / allLength);
        System.out.println(line.replaceAll("[^a-z]", "").length() / allLength);
        System.out.println(line.replaceAll("[^A-Z]", "").length() / allLength);
        System.out.println(line.replaceAll("[_a-zA-Z]", "").length() / allLength);
    }
}
