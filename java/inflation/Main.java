package prins.kattis.inflation;

// Problem url: https://open.kattis.com/problems/inflation
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        List<Integer> helium = new ArrayList<>();

        int numBalloons;
        
        try (Scanner reader = new Scanner(System.in)) {
            numBalloons = Integer.parseInt(reader.nextLine());
            for (int index = 0; index < numBalloons; index++) {
                helium.add(reader.nextInt());
            }
        }

        Collections.sort(helium);

        double min = numBalloons;
        boolean isImpossible = false;

        for (int index = 0; index < helium.size(); index++) {
            if (helium.get(index) > (index + 1)) {
                isImpossible = true;
                break;
            } else {
                double filled = helium.get(index) / (index + 1.0);
                if (filled < min) {
                    min = filled;
                }
            }
        }

        if (isImpossible) {
            System.out.println("impossible");
        } else {
            System.out.println(min);
        }
    }
}
