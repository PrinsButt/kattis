package prins.kattis.provinces_and_gold;

// Problem url: https://open.kattis.com/problems/provincesandgold
import java.util.Scanner;

class Main {

    private enum Victory {
        PROVINCE("Province", 8, 6),
        DUCHY("Duchy", 5, 3),
        ESTATE("Estate", 2, 1);

        private String name;
        private int cost;
        private int points;

        Victory(String name, int cost, int points) {
            this.name = name;
            this.cost = cost;
            this.points = points;
        }

        int cost() {
            return cost;
        }

        String display() {
            return name;
        }

        int points() {
            return points;
        }
    }

    private enum Treasure {
        GOLD("Gold", 6, 3),
        SILVER("Silver", 3, 2),
        COPPER("Copper", 0, 1);

        private final int cost;
        private final String name;
        private final int power;

        Treasure(String name, int cost, int power) {
            this.cost = cost;
            this.name = name;
            this.power = power;
        }

        int cost() {
            return cost;
        }

        String display() {
            return name;
        }

        int power() {
            return power;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int gold = reader.nextInt();
        int silver = reader.nextInt();
        int copper = reader.nextInt();
        reader.close();

        int power = 0;

        for (int goldIndex = 0; goldIndex < gold; goldIndex++) {
            power += Treasure.GOLD.power();
        }

        for (int silverIndex = 0; silverIndex < silver; silverIndex++) {
            power += Treasure.SILVER.power();
        }

        for (int copperIndex = 0; copperIndex < copper; copperIndex++) {
            power += Treasure.COPPER.power();
        }

        Victory bestVictory = null;
        Treasure bestTreasure = null;

        if (power >= Victory.PROVINCE.cost()) {
            bestVictory = Victory.PROVINCE;
        } else if (power >= Victory.DUCHY.cost()) {
            bestVictory = Victory.DUCHY;
        } else if (power >= Victory.ESTATE.cost()) {
            bestVictory = Victory.ESTATE;
        }

        if (power >= Treasure.GOLD.cost()) {
            bestTreasure = Treasure.GOLD;
        } else if (power >= Treasure.SILVER.cost()) {
            bestTreasure = Treasure.SILVER;
        } else if (power >= Treasure.COPPER.cost()) {
            bestTreasure = Treasure.COPPER;
        }

        if (bestVictory != null) {
            System.out.println(bestVictory.display() + " or " + bestTreasure.display());
        } else {
            System.out.println(bestTreasure.display());
        }
    }
}
