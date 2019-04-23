package prins.kattis.zamka;

// Problem url: https://open.kattis.com/problems/zamka
import java.util.Scanner;

class Main {

    public static int find(int value, int target, boolean isMin) {
        while (true) {
            int sum = 0;

            for (char digit : ("" + value).toCharArray()) {
                sum += Integer.parseInt("" + digit);
            }

            if (sum == target) {
                break;
            }

            if (isMin) {
                value++;
            } else {
                value--;
            }
        }

        return value;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numL = Integer.parseInt(reader.nextLine());
        int numD = Integer.parseInt(reader.nextLine());
        int numX = Integer.parseInt(reader.nextLine());
        reader.close();

        System.out.println(Main.find(numL, numX, true));
        System.out.println(Main.find(numD, numX, false));
    }
}
