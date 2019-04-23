package prins.kattis.trik;

// Problem url: https://open.kattis.com/problems/trik
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        reader.close();

        int position = 1;

        for (int index = 0; index < line.length(); index++) {

            char current = line.charAt(index);

            if (current == 'A') {
                if (position == 1) {
                    position = 2;
                } else if (position == 2) {
                    position = 1;
                }
            } else if (current == 'B') {
                if (position == 2) {
                    position = 3;
                } else if (position == 3) {
                    position = 2;
                }
            } else if (current == 'C') {
                if (position == 1) {
                    position = 3;
                } else if (position == 3) {
                    position = 1;
                }
            }
        }

        System.out.println(position);
    }
}
