package prins.kattis.volim;

// Problem url: https://open.kattis.com/problems/volim
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int totalTime = 210;
        int player;
        
        try (Scanner reader = new Scanner(System.in)) {
            player = Integer.parseInt(reader.nextLine());
            int questions = Integer.parseInt(reader.nextLine());
            
            for (int question = 0; question < questions; question++) {
                totalTime -= reader.nextInt();
                String answer = reader.nextLine().trim();
                
                if (totalTime > 0) {
                    if (answer.equals("T")) {
                        player++;
                        if (player == 9) {
                            player = 1;
                        }
                    }
                }
            }
        }

        System.out.println(player);
    }
}
