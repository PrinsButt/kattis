package prins.kattis.exam;

// Problem url: https://open.kattis.com/problems/exam
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numCorrect = Integer.parseInt(reader.nextLine());
        String answersA = reader.nextLine();
        String answersB = reader.nextLine();
        reader.close();

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
