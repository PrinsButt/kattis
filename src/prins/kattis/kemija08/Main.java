package prins.kattis.kemija08;

// Problem url: https://open.kattis.com/problems/kemija08
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println(reader.nextLine().replaceAll("([aeiou])[p]\\1", "$1"));
        }
    }
}
