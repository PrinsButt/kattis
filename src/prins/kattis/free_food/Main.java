package prins.kattis.free_food;

// Problem url: https://open.kattis.com/problems/freefood
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {

    public static void main(String[] args) {
        Set<Integer> days;
        
        try (Scanner reader = new Scanner(System.in)) {
            int numEvents = Integer.parseInt(reader.nextLine());
            days = new HashSet<>();
            for (int event = 0; event < numEvents; event++) {
                int startDay = reader.nextInt();
                int endDay = reader.nextInt();
                
                for (int day = startDay; day <= endDay; day++) {
                    days.add(day);
                }
                
                reader.nextLine();
            }
        }

        System.out.println(days.size());
    }
}
