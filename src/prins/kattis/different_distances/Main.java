package prins.kattis.different_distances;

// Problem url: https://open.kattis.com/problems/differentdistances
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        try (Scanner reader = new Scanner(System.in)) {
            String line = reader.nextLine();

            while (!line.equals("0")) {
                String parts[] = line.split(" ");
                double x1 = Double.parseDouble(parts[0]);
                double y1 = Double.parseDouble(parts[1]);
                double x2 = Double.parseDouble(parts[2]);
                double y2 = Double.parseDouble(parts[3]);
                double p = Double.parseDouble(parts[4]);

                double result = Math.pow(Math.pow(Math.abs(x1 - x2), p) 
                        + Math.pow(Math.abs(y1 - y2), p), 1 / p);
                output.append(String.format("%.10f", result)).append("\n");

                line = reader.nextLine();
            }
        }

        System.out.print(output);
    }
}
