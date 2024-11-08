package prins.kattis.chanukah;

// Problem url: https://open.kattis.com/problems/chanukah
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        Scanner reader = new Scanner(System.in);
        int dataSets = Integer.parseInt(reader.nextLine());

        for (int dataSet = 0; dataSet < dataSets; dataSet++) {
            int id = reader.nextInt();
            int days = reader.nextInt();
            reader.nextLine();

            int candles = days;
            for (int day = 1; day <= days; day++) {
                candles += day;
            }

            output.append(id).append(" ").append(candles).append("\n");
        }

        System.out.print(output);
    }
}
