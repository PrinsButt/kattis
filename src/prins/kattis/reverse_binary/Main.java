package prins.kattis.reverse_binary;

// Problem url: https://open.kattis.com/problems/reversebinary
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int n;
        
        try (Scanner reader = new Scanner(System.in)) {
            n = Integer.parseInt(reader.nextLine());
        }

        String reversed = new StringBuilder(Integer.toBinaryString(n))
                .reverse()
                .toString();
        
        System.out.println(Integer.parseInt(reversed, 2));
    }
}
