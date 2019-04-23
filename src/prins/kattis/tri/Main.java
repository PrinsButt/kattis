package prins.kattis.tri;

// Problem url: https://open.kattis.com/problems/tri
import java.util.Scanner;

class Main {

    private static String eval(int first, int second, int third) {
        if (first + second == third) {
            return first + "+" + second;
        } else if (first - second == third) {
            return first + "-" + second;
        } else if (first / second == third) {
            return first + "/" + second;
        } else if (first * second == third) {
            return first + "*" + second;
        }
        return "";
    }

    public static void main(String[] args) {
        int first;
        int second;
        int third;
        
        try (Scanner reader = new Scanner(System.in)) {
            first = reader.nextInt();
            second = reader.nextInt();
            third = reader.nextInt();
        }

        String result = eval(first, second, third);

        if (!result.equals("")) {
            System.out.println(result + "=" + third);
        } else {
            System.out.println(first + "=" + eval(second, third, first));
        }
    }
}
