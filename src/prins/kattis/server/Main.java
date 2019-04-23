package prins.kattis.server;

// Problem url: https://open.kattis.com/problems/server
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int jobs = 0;
        int totalTime = 0;

        try (Scanner reader = new Scanner(System.in)) {
            int maxJobs = reader.nextInt();
            int maxTime = reader.nextInt();
            reader.nextLine();

            for (int job = 0; job < maxJobs; job++) {
                int jobTime = reader.nextInt();

                if (totalTime + jobTime <= maxTime) {
                    totalTime += jobTime;
                    jobs++;
                } else {
                    break;
                }
            }
        }
        System.out.println(jobs);
    }
}
