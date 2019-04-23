package prins.kattis.quick_brown_fox;

// Problem url: https://open.kattis.com/problems/quickbrownfox
import java.util.Scanner;

class Main {

    private static final String ATOZ = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numLines = Integer.parseInt(reader.nextLine());
        StringBuilder output = new StringBuilder();

        for (int index = 0; index < numLines; index++) {
            String line = reader.nextLine().toLowerCase();
            StringBuilder missing = new StringBuilder();

            for (char c : ATOZ.toCharArray()) {
                if (line.indexOf(c) < 0) {
                    missing.append(c);
                }
            }

            if (missing.toString().isEmpty()) {
                output.append("pangram\n");
            } else {
                output.append("missing ").append(missing).append("\n");
            }
        }

        reader.close();
        System.out.print(output);
    }
}
