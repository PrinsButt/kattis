package prins.kattis.server;

// Problem url: https://open.kattis.com/problems/server
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int maxJobs = reader.nextInt();
        int maxTime = reader.nextInt();
        reader.nextLine();

        int totalTime = 0;
        int jobs = 0;

        for (int job = 0; job < maxJobs; job++) {
            int jobTime = reader.nextInt();

            if (totalTime + jobTime <= maxTime) {
                totalTime += jobTime;
                jobs++;
            } else {
                break;
            }
        }

        reader.close();
        System.out.println(jobs);
    }
}
