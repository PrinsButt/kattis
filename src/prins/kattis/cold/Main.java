package prins.kattis.cold;

// Problem url: https://open.kattis.com/problems/cold
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numTemps = Integer.parseInt(reader.nextLine());
        String data = reader.nextLine();
        reader.close();

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
