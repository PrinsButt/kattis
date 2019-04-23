package prins.kattis.exam;

// Problem url: https://open.kattis.com/problems/exam
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int numCorrect;
        String answersA;
        String answersB;
        
        try (Scanner reader = new Scanner(System.in)) {
            numCorrect = Integer.parseInt(reader.nextLine());
            answersA = reader.nextLine();
            answersB = reader.nextLine();
        }

        int total = answersA.length();
        int numDifferent = 0;

        for (int index = 0; index < total; index++) {
            if (answersA.charAt(index) != answersB.charAt(index)) {
                numDifferent++;
            }
        }

        if ((total - numCorrect) < numDifferent) {
            int overflow = numDifferent - (total - numCorrect);
            System.out.println(total - overflow);
        } else {
            System.out.println(numCorrect + numDifferent);
        }
    }
}
