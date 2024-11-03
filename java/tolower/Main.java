package prins.kattis.tolower;

// Problem url: https://open.kattis.com/problems/tolower
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int problemsPassed = 0;

        try (Scanner reader = new Scanner(System.in)) {
            int numProblems = reader.nextInt();
            int numTestCases = reader.nextInt();
            reader.nextLine();

            for (int problem = 0; problem < numProblems; problem++) {
                int testCasesPassed = 0;

                for (int testCase = 0; testCase < numTestCases; testCase++) {
                    String sentence = reader.nextLine();
                    String lowerCase = sentence.toLowerCase();

                    if (sentence.equals(lowerCase)) {
                        testCasesPassed++;
                    } else {
                        String modified = lowerCase.charAt(0)
                                + sentence.substring(1, sentence.length());

                        if (modified.equals(lowerCase)) {
                            testCasesPassed++;
                        }
                    }
                }

                if (testCasesPassed == numTestCases) {
                    problemsPassed++;
                }
            }
        }

        System.out.println(problemsPassed);
    }
}
