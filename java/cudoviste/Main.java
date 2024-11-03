package prins.kattis.cudoviste;

// Problem url: https://open.kattis.com/problems/cudoviste
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int rows = reader.nextInt();
        int cols = reader.nextInt();
        reader.nextLine();

        String data[] = new String[rows];

        for (int row = 0; row < rows; row++) {
            data[row] = reader.nextLine();
        }

        int cars[] = new int[5];

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                StringBuilder square = new StringBuilder();
                square.append(data[row].charAt(col));
                square.append(data[row].charAt(col + 1));
                square.append(data[row + 1].charAt(col));
                square.append(data[row + 1].charAt(col + 1));

                if (!square.toString().contains("#")) {
                    int numCars = 0;
                    for (char symbol : square.toString().toCharArray()) {
                        if (symbol == 'X') {
                            numCars++;
                        }
                    }
                    cars[numCars]++;
                }
            }
        }

        reader.close();

        for (int car = 0; car < cars.length; car++) {
            System.out.println(cars[car]);
        }
    }
}
