package prins.kattis.apaxiaaans;

// Problem url: https://open.kattis.com/problems/apaxiaaans
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            String output = reader.nextLine().replaceAll("(.)\\1{1,}", "$1");
            System.out.println(output);
        }
    }
}
