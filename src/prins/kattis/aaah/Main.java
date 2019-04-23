package prins.kattis.aaah;

// Problem url: https://open.kattis.com/problems/aaah

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String marius = reader.nextLine();
        String doctor = reader.nextLine();
        reader.close();

        if (marius.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
