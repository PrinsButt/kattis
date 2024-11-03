package prins.kattis.conquest_campaign;

// Problem url: https://open.kattis.com/problems/conquestcampaign
import java.util.Scanner;

class Main {

    private static boolean allOccupied(boolean[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (!grid[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int rows = reader.nextInt();
        int cols = reader.nextInt();
        int n = reader.nextInt();
        reader.nextLine();

        boolean[][] grid = new boolean[rows][cols];

        // initialise grid
        for (int index = 0; index < n; index++) {
            grid[reader.nextInt() - 1][reader.nextInt() - 1] = true;
            reader.nextLine();
        }

        reader.close();

        // mutate grid
        int days = 1;

        while (!allOccupied(grid)) {
            boolean[][] mutatedGrid = new boolean[rows][cols];

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (grid[row][col] == true) {
                        mutatedGrid[row][col] = true;
                        try {
                            mutatedGrid[row - 1][col] = true;
                        } catch (Exception e) {
                        }
                        try {
                            mutatedGrid[row + 1][col] = true;
                        } catch (Exception e) {
                        }
                        try {
                            mutatedGrid[row][col - 1] = true;
                        } catch (Exception e) {
                        }
                        try {
                            mutatedGrid[row][col + 1] = true;
                        } catch (Exception e) {
                        }
                    }
                }
            }

            grid = mutatedGrid;
            days++;
        }

        System.out.println(days);
    }
}
