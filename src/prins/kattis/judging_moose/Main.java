package prins.kattis.judging_moose;

// Problem url: https://open.kattis.com/problems/judgingmoose
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int leftTines = reader.nextInt();
        int rightTines = reader.nextInt();
        reader.close();

        if (leftTines == 0 && rightTines == 0) {
            System.out.println("Not a moose");
        } else if (leftTines > rightTines) {
            System.out.println("Odd " + (2 * leftTines));
        } else if (rightTines > leftTines) {
            System.out.println("Odd " + (2 * rightTines));
        } else {
            System.out.println("Even " + (leftTines + rightTines));
        }
    }
}
