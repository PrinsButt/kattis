package prins.kattis.spavanac;

// Problem url: https://open.kattis.com/problems/spavanac
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int hours;
        int mins;

        try (Scanner reader = new Scanner(System.in)) {
            hours = reader.nextInt();
            mins = reader.nextInt();
        }

        int totalMinutes;

        if (hours == 0) {
            totalMinutes = ((24 * 60) + mins) - 45;
        } else {
            totalMinutes = ((hours * 60) + mins) - 45;
        }

        int updatedHours = totalMinutes / 60;
        int updatedMinutes = totalMinutes - (updatedHours * 60);

        if (updatedHours == 24) {
            System.out.println("" + 0 + " " + updatedMinutes);
        } else {
            System.out.println("" + updatedHours + " " + updatedMinutes);
        }
    }
}
