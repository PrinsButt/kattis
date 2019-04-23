package prins.kattis.reverse_rot;

// Problem url: https://open.kattis.com/problems/reverserot
import java.util.Scanner;

class Main {

    public static final String REF = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        try (Scanner reader = new Scanner(System.in)) {
            String line = reader.nextLine();
            
            while (!line.equals("0")) {
                String parts[] = line.split(" ");
                int rotations = Integer.parseInt(parts[0]);
                StringBuilder encrypted = new StringBuilder(parts[1]);
                
                encrypted.reverse();
                
                for (char character : encrypted.toString().toCharArray()) {
                    int initial = REF.indexOf(character);
                    int shifted = (initial + rotations) % REF.length();
                    output.append(REF.charAt(shifted));
                }
                
                output.append("\n");
                line = reader.nextLine();
            }
            
            System.out.println(output);
        }
    }
}
