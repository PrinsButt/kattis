package prins.kattis.faktor;

// Problem url: https://open.kattis.com/problems/faktor
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int numArticles;
        int impactFactor;
        
        try (Scanner reader = new Scanner(System.in)) {
            numArticles = reader.nextInt();
            impactFactor = reader.nextInt();
        }
        
        int minScientists = (numArticles * (impactFactor - 1)) + 1;
        System.out.println(minScientists);
    }
}
