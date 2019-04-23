package prins.kattis.sibice;

// Problem url: https://open.kattis.com/problems/sibice
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String output = "";
        
        try (Scanner reader = new Scanner(System.in)) {
            int numMatches = reader.nextInt();
            int width = reader.nextInt();
            int height = reader.nextInt();
            reader.nextLine();
            
            for (int match = 0; match < numMatches; match++) {
                int length = Integer.parseInt(reader.nextLine());
                double longest = Math.floor(Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
                
                if (length <= longest) {
                    output += "DA";
                } else {
                    output += "NE";
                }
                
                if (match < numMatches - 1) {
                    output += "\n";
                }
            }
        }

        System.out.println(output);
    }
}
