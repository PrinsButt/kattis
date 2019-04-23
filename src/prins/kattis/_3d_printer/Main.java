package prins.kattis._3d_printer;

// Problem url: https://open.kattis.com/problems/3dprinter
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numStatues = Integer.parseInt(reader.nextLine());
        reader.close();

        int minDays = numStatues;

        for (int days = 1; days < numStatues; days++) {
            double numPrinters = Math.pow(2, days);

            int answer = days + ((int) Math.ceil(numStatues / numPrinters));

            if (answer < minDays) {
                minDays = answer;
            } else {
                break;
            }
        }

        System.out.println(minDays);
    }
}
