package prins.kattis.datum;

// Problem url: https://open.kattis.com/problems/datum
import java.util.Calendar;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int day;
        int month;

        try (Scanner reader = new Scanner(System.in)) {
            day = reader.nextInt();
            month = reader.nextInt();
        }

        String[] days = new String[]{"",
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"};

        Calendar calendar = Calendar.getInstance();
        calendar.set(2009, month - 1, day);
        System.out.println(days[calendar.get(Calendar.DAY_OF_WEEK)]);
    }
}
