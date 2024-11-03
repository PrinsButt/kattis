package prins.kattis.goat_rope;

// Problem url: https://open.kattis.com/problems/goatrope
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        double data[] = new double[6];
        
        try (Scanner reader = new Scanner(System.in)) {
            for (int index = 0; index < 6; index++) {
                data[index] = reader.nextDouble();
            }
        }

        double squared = 0.0;

        if (data[0] < data[2]) {
            squared += Math.pow(data[2] - data[0], 2);
        } else if (data[0] > data[4]) {
            squared += Math.pow(data[4] - data[0], 2);
        }

        if (data[1] < data[3]) {
            squared += Math.pow(data[3] - data[1], 2);
        } else if (data[1] > data[5]) {
            squared += Math.pow(data[5] - data[1], 2);
        }

        System.out.println(Math.sqrt(squared));
    }
}
