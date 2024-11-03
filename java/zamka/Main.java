package prins.kattis.zamka;

// Problem url: https://open.kattis.com/problems/zamka
import java.util.Scanner;

class Main {

    public static int find(int value, int target, boolean isMin) {
        int result = value;

        while (true) {
            int sum = 0;

            for (char digit : ("" + result).toCharArray()) {
                sum += Integer.parseInt("" + digit);
            }

            if (sum == target) {
                break;
            }

            if (isMin) {
                result++;
            } else {
                result--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int numL;
        int numD;
        int numX;
        
        try (Scanner reader = new Scanner(System.in)) {
            numL = Integer.parseInt(reader.nextLine());
            numD = Integer.parseInt(reader.nextLine());
            numX = Integer.parseInt(reader.nextLine());
        }

        System.out.println(Main.find(numL, numX, true));
        System.out.println(Main.find(numD, numX, false));
    }
}
