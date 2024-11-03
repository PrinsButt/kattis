package prins.kattis.line_up;

// Problem url: https://open.kattis.com/problems/lineup
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        try (Scanner reader = new Scanner(System.in)) {
            int numPeople = Integer.parseInt(reader.nextLine());
            
            for (int index = 0; index < numPeople; index++) {
                names.add(reader.nextLine());
            }
            
            List<String> ascending = new ArrayList<>(names);
            List<String> descending = new ArrayList<>(names);
            Collections.sort(ascending);
            Collections.sort(descending, Collections.reverseOrder());
            
            if (names.equals(ascending)) {
                System.out.println("INCREASING");
            } else if (names.equals(descending)) {
                System.out.println("DECREASING");
            } else {
                System.out.println("NEITHER");
            }
        }
    }
}
