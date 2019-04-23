package prins.kattis.pizza_2;

// Problem url: https://open.kattis.com/problems/pizza2
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int radius;
        int crust;
        
        try (Scanner reader = new Scanner(System.in)) {
            radius = reader.nextInt();
            crust = reader.nextInt();
        }

        double pizzaArea = Math.PI * Math.pow(radius, 2);
        double cheeseArea = Math.PI * Math.pow(radius - crust, 2);

        double percentage = (cheeseArea / pizzaArea) * 100;
        System.out.println(String.format("%.7f", percentage));
    }
}
