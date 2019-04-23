package prins.kattis.cetvrta;

// Problem url: https://open.kattis.com/problems/cetvrta
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();

        int lastX = 0;
        int lastY = 0;

        for (int index = 0; index < 3; index++) {
            int x = reader.nextInt();
            int y = reader.nextInt();
            reader.nextLine();

            if (xMap.containsKey(x)) {
                xMap.replace(x, xMap.get(x) + 1);
            } else {
                xMap.put(x, 1);
            }

            if (yMap.containsKey(y)) {
                yMap.replace(y, yMap.get(y) + 1);
            } else {
                yMap.put(y, 1);
            }
        }

        reader.close();

        for (int x : xMap.keySet()) {
            if (xMap.get(x) == 1) {
                lastX = x;
            }
        }

        for (int y : yMap.keySet()) {
            if (yMap.get(y) == 1) {
                lastY = y;
            }
        }

        System.out.println(lastX + " " + lastY);
    }
}
