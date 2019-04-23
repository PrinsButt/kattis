package prins.kattis.pizza_2;

// Problem url: https://open.kattis.com/problems/pizza2
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int radius = reader.nextInt();
        int crust = reader.nextInt();
        reader.close();

        double pizzaArea = Math.PI * Math.pow(radius, 2);
        double cheeseArea = Math.PI * Math.pow(radius - crust, 2);

        double percentage = (cheeseArea / pizzaArea) * 100;
        System.out.println(String.format("%.7f", percentage));
    }
}
