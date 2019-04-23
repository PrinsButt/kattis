package prins.kattis.estimating_the_area_of_a_circle;

// Problem url: https://open.kattis.com/problems/estimatingtheareaofacircle
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        
        try (Scanner reader = new Scanner(System.in)) {
            String line = reader.nextLine();
            
            while (!line.equals("0 0 0")) {
                String data[] = line.split(" ");
                double radius = Double.parseDouble(data[0]);
                double marks = Double.parseDouble(data[1]);
                double inside = Double.parseDouble(data[2]);
                
                Double area = Math.PI * Math.pow(radius, 2);
                Double estimate = (inside / marks) * Math.pow(2 * radius, 2);
                output.append(area).append(" ").append(estimate).append("\n");
                line = reader.nextLine();
            }
        }
        
        System.out.println(output);
    }
}
