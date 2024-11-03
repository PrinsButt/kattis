package prins.kattis.provinces_and_gold;

// Problem url: https://open.kattis.com/problems/provincesandgold
import java.util.Scanner;

class Main {

    private enum Victory {
        PROVINCE("Province", 8, 6),
        DUCHY("Duchy", 5, 3),
        ESTATE("Estate", 2, 1),
        NONE("", 0, 0);

        private final String name;
        private final int cost;
        private final int points;

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
        COPPER("Copper", 0, 1),
        NONE("", 0, 0);

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
        int gold;
        int silver;
        int copper;
        
        try (Scanner reader = new Scanner(System.in)) {
            gold = reader.nextInt();
            silver = reader.nextInt();
            copper = reader.nextInt();
        }

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

        Victory bestVictory = Victory.NONE;
        Treasure bestTreasure = Treasure.NONE;

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

        if (bestVictory != Victory.NONE) {
            System.out.println(bestVictory.display() + " or " + bestTreasure.display());
        } else {
            System.out.println(bestTreasure.display());
        }
    }
}
