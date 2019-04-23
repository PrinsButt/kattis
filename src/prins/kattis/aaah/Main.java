package prins.kattis.aaah;

// Problem url: https://open.kattis.com/problems/aaah
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String marius;
        String doctor;

        try (Scanner reader = new Scanner(System.in)) {
            marius = reader.nextLine();
            doctor = reader.nextLine();
        }

        if (marius.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
