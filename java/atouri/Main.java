package prins.kattis.atouri;

// Problem url: https://open.kattis.com/problems/autori
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String longName;

        try (Scanner reader = new Scanner(System.in)) {
            longName = reader.nextLine();
        }

        String shortName = "";

        for (char letter : longName.toCharArray()) {
            if (letter < 'a' && letter != '-') {
                shortName += letter;
            }
        }

        System.out.println(shortName);
    }
}
