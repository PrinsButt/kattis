package prins.kattis.help_a_phd;

// Problem url: https://open.kattis.com/problems/helpaphd
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int testCases = Integer.parseInt(reader.nextLine());

        StringBuilder output = new StringBuilder();

        for (int testCase = 0; testCase < testCases; testCase++) {
            String expression = reader.nextLine();
            if (expression.equals("P=NP")) {
                output.append("skipped\n");
            } else {
                String parts[] = expression.split("\\+");
                output.append(Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]));
                output.append("\n");
            }
        }

        reader.close();
        System.out.print(output);
    }
}
