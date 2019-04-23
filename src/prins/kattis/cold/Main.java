package prins.kattis.cold;

// Problem url: https://open.kattis.com/problems/cold
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String data;
        
        try (Scanner reader = new Scanner(System.in)) {
            reader.nextLine();
            data = reader.nextLine();
        }

        String temps[] = data.split(" ");

        int days = 0;

        for (String temp : temps) {
            if (Integer.parseInt(temp) < 0) {
                days++;
            }
        }

        System.out.println(days);
    }
}
