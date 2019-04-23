package prins.kattis.filip;

// Problem url: https://open.kattis.com/problems/filip
import java.util.Scanner;

class Main {

    public static int reverse(int num) {
        String reversed = "";
        for (char letter : ("" + num).toCharArray()) {
            reversed = ("" + letter + reversed);
        }
        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        int numA;
        int numB;
        
        try (Scanner reader = new Scanner(System.in)) {
            numA = reader.nextInt();
            numB = reader.nextInt();
        }

        int revA = Main.reverse(numA);
        int revB = Main.reverse(numB);

        if (revA > revB) {
            System.out.println(revA);
        } else {
            System.out.println(revB);
        }
    }
}
