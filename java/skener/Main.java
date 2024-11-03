package prins.kattis.skener;

// Problem url: https://open.kattis.com/problems/skener
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        StringBuilder output = new StringBuilder();
        
        try (Scanner reader = new Scanner(System.in)) {
            int rows = reader.nextInt();
            int cols = reader.nextInt();
            int zr = reader.nextInt();
            int zc = reader.nextInt();
            reader.nextLine();
             
            for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
                String inLine = reader.nextLine();
                String outLine = "";
                
                for (char digit : inLine.toCharArray()) {
                    for (int zcIndex = 0; zcIndex < zc; zcIndex++) {
                        outLine += digit;
                    }
                }
                
                for (int zrIndex = 0; zrIndex < zr; zrIndex++) {
                    output.append(outLine).append("\n");
                }
            }
        }

        System.out.print(output);
    }
}
