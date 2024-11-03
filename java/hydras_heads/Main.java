package prins.kattis.hydras_heads;

// Problem url: https://open.kattis.com/problems/hydrasheads
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        
        try (Scanner reader = new Scanner(System.in)) {
            String line = reader.nextLine();
            
            while (!line.equals("0 0")) {
                String parts[] = line.split(" ");
                int heads = Integer.parseInt(parts[0]);
                int tails = Integer.parseInt(parts[1]);
                int moves = 0;
                
                boolean hasChanged = true;
                
                while (true) {
                    if (heads == 0 && tails == 0) {
                        break;
                    } else {
                        if (heads > 0 && heads % 2 == 0) {
                            heads -= 2;
                        } else if ((heads > 0 && tails >= 2) || tails >= 4) {
                            tails -= 2;
                            heads++;
                        } else if (tails > 0) {
                            tails++;
                        } else {
                            hasChanged = false;
                            break;
                        }
                        
                        moves++;
                    }
                }
                
                if (hasChanged) {
                    output.append(moves).append("\n");
                } else {
                    output.append("-1\n");
                }
                
                line = reader.nextLine();
            }
        }
        
        System.out.print(output);
    }
}
