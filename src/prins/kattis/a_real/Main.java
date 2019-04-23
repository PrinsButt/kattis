package prins.kattis.a_real;

// Problem url: https://open.kattis.com/problems/areal

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(4 * Math.sqrt(Long.parseLong(reader.nextLine())));
        reader.close();
    }
}
