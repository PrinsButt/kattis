package prins.kattis.boat_parts;

// Problem url: https://open.kattis.com/problems/boatparts
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numParts = reader.nextInt();
        int numDays = reader.nextInt();
        reader.nextLine();

        Set<String> partSet = new HashSet<>();

        int answer = 0;

        for (int day = 1; day <= numDays; day++) {
            partSet.add(reader.nextLine());
            if (answer == 0 && partSet.size() == numParts) {
                answer = day;
            }
        }

        if (answer == 0) {
            System.out.println("paradox avoided");
        } else {
            System.out.println(answer);
        }
    }
}
