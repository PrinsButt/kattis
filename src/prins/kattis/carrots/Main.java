package prins.kattis.carrots;

// Problem url: https://open.kattis.com/problems/carrots
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int contestants = reader.nextInt();
        int problems = reader.nextInt();

        for (int person = 0; person <= contestants; person++) {
            reader.nextLine();
        }

        reader.close();

        System.out.println(problems);
    }
}
