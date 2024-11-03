package prins.kattis.license_to_launch;

// Problem url: https://open.kattis.com/problems/licensetolaunch
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int leastJunk = 100000;
        int daysToWait = 0;

        try (Scanner reader = new Scanner(System.in)) {
            int numOfDays = Integer.parseInt(reader.nextLine());
            
            for (int day = 0; day < numOfDays; day++) {
                int amountOfJunk = reader.nextInt();
                
                if (amountOfJunk < leastJunk) {
                    leastJunk = amountOfJunk;
                    daysToWait = day;
                }
            }
        }

        System.out.print(daysToWait);
    }
}
