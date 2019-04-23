package prins.kattis.hanging_out;

// Problem url: https://open.kattis.com/problems/hangingout
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int peopleOnTerrace = 0;
        int groupsDenied = 0;

        try (Scanner reader = new Scanner(System.in)) {
            int limit = reader.nextInt();
            int events = reader.nextInt();
            reader.nextLine();

            for (int event = 0; event < events; event++) {
                String details[] = reader.nextLine().split(" ");
                int groupSize = Integer.parseInt(details[1]);

                if (details[0].equals("enter")) {
                    if (peopleOnTerrace + groupSize > limit) {
                        groupsDenied++;
                    } else {
                        peopleOnTerrace += groupSize;
                    }
                } else {
                    peopleOnTerrace -= groupSize;
                }
            }
        }

        System.out.println(groupsDenied);
    }
}
