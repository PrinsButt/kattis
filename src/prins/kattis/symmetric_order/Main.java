package prins.kattis.symmetric_order;

// Problem url: https://open.kattis.com/problems/symmetricorder
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        int setId = 0;

        try (Scanner reader = new Scanner(System.in)) {
            while (true) {
                int numNames = Integer.parseInt(reader.nextLine());
                
                if (numNames == 0) {
                    break;
                }
                
                StringBuilder firstHalf = new StringBuilder();
                StringBuilder secondHalf = new StringBuilder();
                
                setId++;
                
                for (int index = 0; index < numNames; index++) {
                    String name = reader.nextLine();
                    
                    if (index % 2 == 0) {
                        firstHalf.append(name);
                        firstHalf.append("\n");
                    } else {
                        secondHalf.insert(0, "\n");
                        secondHalf.insert(0, name);
                    }
                }
                
                output.append("SET ");
                output.append(setId);
                output.append("\n");
                output.append(firstHalf.toString());
                output.append(secondHalf.toString());
            }
        }

        System.out.print(output);
    }
}
