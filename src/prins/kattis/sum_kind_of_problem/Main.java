package prins.kattis.sum_kind_of_problem;

// Problem url: https://open.kattis.com/problems/sumkindofproblem
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        
        try (Scanner reader = new Scanner(System.in)) {
            int numDataSets = Integer.parseInt(reader.nextLine());
            
            for (int dataSet = 0; dataSet < numDataSets; dataSet++) {
                int id = reader.nextInt();
                int numN = reader.nextInt();
                reader.nextLine();
                
                int sumNaturals = (numN * (numN + 1)) / 2;
                int sumEvens = numN * (numN + 1);
                int sumOdds = (int) Math.pow(numN, 2);
                
                output.append(id);
                output.append(" ");
                output.append(sumNaturals);
                output.append(" ");
                output.append(sumOdds);
                output.append(" ");
                output.append(sumEvens);
                output.append("\n");
            }
        }

        System.out.println(output.toString());
    }
}
