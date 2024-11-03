package prins.kattis.simon_says;

// Problem url: https://open.kattis.com/problems/simonsays
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        try (Scanner reader = new Scanner(System.in)) {
            int numSentences = Integer.parseInt(reader.nextLine());

            for (int index = 0; index < numSentences; index++) {
                String sentence = reader.nextLine();
                if (sentence.startsWith("Simon says ")) {
                    int length = "Simon says ".length();
                    String processed = sentence.substring(length);
                    output.append(processed).append("\n");
                }
            }
        }

        System.out.println(output);
    }
}
