package prins.kattis.tarifa;

// Problem url: https://open.kattis.com/problems/tarifa
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int used = 0;
        
        int numX;
        int numN;
        
        try (Scanner reader = new Scanner(System.in)) {
            numX = Integer.parseInt(reader.nextLine());
            numN = Integer.parseInt(reader.nextLine());
            for (int index = 0; index < numN; index++) {
                used += Integer.parseInt(reader.nextLine());
            }
        }

        System.out.println((numX * (numN + 1)) - used);
    }
}
