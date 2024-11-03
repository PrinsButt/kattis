package prins.kattis.yoda;

// Problem url: https://open.kattis.com/problems/yoda
import java.util.Scanner;

class Main {

    public static String[] collide(String first, String second) {
        String firstUpdated = "";
        String secondUpdated = "";

        for (int index = 0; index < first.length(); index++) {
            int firstNum = first.charAt(index);
            int secondNum = second.charAt(index);

            if (firstNum > secondNum) {
                firstUpdated += first.charAt(index);
            } else if (secondNum > firstNum) {
                secondUpdated += second.charAt(index);
            } else {
                firstUpdated += first.charAt(index);
                secondUpdated += second.charAt(index);
            }
        }

        if (!firstUpdated.equals("")) {
            firstUpdated = "" + Integer.parseInt(firstUpdated);
        } else {
            firstUpdated = "YODA";
        }

        if (!secondUpdated.equals("")) {
            secondUpdated = "" + Integer.parseInt(secondUpdated);
        } else {
            secondUpdated = "YODA";
        }

        String[] results = {firstUpdated, secondUpdated};
        return results;
    }

    public static String zeroFill(String text, int amount) {
        String filled = text;

        for (int index = 0; index < amount; index++) {
            filled = "0" + filled;
        }

        return filled;
    }

    public static void main(String[] args) {
        String numN;
        String numM;
        
        try (Scanner reader = new Scanner(System.in)) {
            numN = reader.nextLine();
            numM = reader.nextLine();
        }

        int difference = Math.abs(numN.length() - numM.length());

        if (numN.length() < numM.length()) {
            numN = Main.zeroFill(numN, difference);
        } else {
            numM = Main.zeroFill(numM, difference);
        }

        String[] results = Main.collide(numN, numM);
        for (String result : results) {
            System.out.println(result);
        }
    }
}
