package prins.kattis.trik;

// Problem url: https://open.kattis.com/problems/trik
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String line;
        
        try (Scanner reader = new Scanner(System.in)) {
            line = reader.nextLine();
        }

        int position = 1;

        for (int index = 0; index < line.length(); index++) {

            char current = line.charAt(index);

            switch (current) {
                case 'A':
                    if (position == 1) {
                        position = 2;
                    } else if (position == 2) {
                        position = 1;
                    }   break;
                case 'B':
                    if (position == 2) {
                        position = 3;
                    } else if (position == 3) {
                        position = 2;
                    }   break;
                case 'C':
                    if (position == 1) {
                        position = 3;
                    } else if (position == 3) {
                        position = 1;
                    }   break;
                default:
                    break;
            }
        }

        System.out.println(position);
    }
}
