package prins.kattis.estimating_the_area_of_a_circle;

// Problem url: https://open.kattis.com/problems/estimatingtheareaofacircle
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        String line;

        while (!(line = reader.nextLine()).equals("0 0 0")) {
            String data[] = line.split(" ");
            double radius = Double.parseDouble(data[0]);
            double marks = Double.parseDouble(data[1]);
            double inside = Double.parseDouble(data[2]);

            Double area = Math.PI * Math.pow(radius, 2);
            Double estimate = (inside / marks) * Math.pow(2 * radius, 2);
            output.append(area + " " + estimate + "\n");
        }

        reader.close();
        System.out.println(output);
    }
}
