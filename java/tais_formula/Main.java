package prins.kattis.tais_formula;

// Problem url: https://open.kattis.com/problems/taisformula
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String prevData[] = null;
        double totalArea = 0.0;

        try (Scanner reader = new Scanner(System.in)) {
            int numLines = Integer.parseInt(reader.nextLine());
            
            for (int index = 0; index < numLines; index++) {
                String data[] = reader.nextLine().split(" ");
                
                if (index > 0) {
                    double baseA = Double.parseDouble(prevData[1]);
                    double baseB = Double.parseDouble(data[1]);
                    double timeA = Double.parseDouble(prevData[0]);
                    double timeB = Double.parseDouble(data[0]);
                    double width = timeB - timeA;
                    double area = (((baseA + baseB) / 2.0) * width) / 1000.0;
                    totalArea += area;
                }
                
                prevData = data;
            }
        }
        
        System.out.print(totalArea);
    }
}
