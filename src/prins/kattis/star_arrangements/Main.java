package prins.kattis.star_arrangements;

// Problem url: https://open.kattis.com/problems/stararrangements
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        
        try (Scanner reader = new Scanner(System.in)) {
            int numStars = Integer.parseInt(reader.nextLine());

            output.append(numStars).append(":\n");

            for (int stars = 2; stars < numStars; stars++) {
                for (int minStars = stars - 1; minStars <= stars; minStars++) {

                    int sum = stars + minStars;

                    if (numStars % sum == 0 || numStars % sum == stars) {
                        output.append(stars).append(",").append(minStars).append("\n");
                    }
                }
            }
        }

        System.out.print(output);
    }
}
