package prins.kattis.just_a_minute;

// Problem url: https://open.kattis.com/problems/justaminute
import java.util.Scanner;

class Main {

    private static final double SECONDS_IN_MINUTE = 60.0;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numObservations = Integer.parseInt(reader.nextLine());

        int minutes = 0;
        int seconds = 0;

        for (int index = 0; index < numObservations; index++) {
            minutes += reader.nextInt();
            seconds += reader.nextInt();
            reader.nextLine();
        }

        reader.close();
        double slMinute = seconds / (minutes * SECONDS_IN_MINUTE);

        if (slMinute <= 1) {
            System.out.println("measurement error");
        } else {
            System.out.println(slMinute);
        }
    }
}
