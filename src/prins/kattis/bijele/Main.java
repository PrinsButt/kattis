package prins.kattis.bijele;

// Problem url: https://open.kattis.com/problems/bijele
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        List<Integer> idealList = Arrays.asList(1, 1, 2, 2, 2, 8);
        StringBuilder output = new StringBuilder();

        try (Scanner reader = new Scanner(System.in)) {
            for (int index = 0; index < 6; index++) {
                output.append(idealList.get(index) - reader.nextInt())
                        .append(" ");
            }
        }

        System.out.println(output.toString().trim());
    }
}
