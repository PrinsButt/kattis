package prins.kattis.is_it_halloween;

// Problem url: https://open.kattis.com/problems/isithalloween
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String date;
        
        try (Scanner reader = new Scanner(System.in)) {
            date = reader.nextLine();
        }

        if (date.toUpperCase().equals("OCT 31") || date.toUpperCase().equals("DEC 25")) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}
