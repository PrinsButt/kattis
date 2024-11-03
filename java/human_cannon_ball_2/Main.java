package prins.kattis.human_cannon_ball_2;

// Problem url: https://open.kattis.com/problems/humancannonball2
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        try (Scanner reader = new Scanner(System.in)) {
            int numTestCases = Integer.parseInt(reader.nextLine());
            
            for (int testCase = 0; testCase < numTestCases; testCase++) {
                double v0 = reader.nextDouble();
                double theta = reader.nextDouble();
                double x1 = reader.nextDouble();
                double h1 = reader.nextDouble();
                double h2 = reader.nextDouble();
                reader.nextLine();
                
                double t = x1 / (v0 * Math.cos(Math.toRadians(theta)));
                double y = (v0 * t * Math.sin(Math.toRadians(theta))) - (0.5 * 9.81 * Math.pow(t, 2));
                
                if (y >= h1 + 1 && y <= h2 - 1) {
                    output.append("Safe\n");
                } else {
                    output.append("Not Safe\n");
                }
            }
        }

        System.out.print(output);
    }
}
