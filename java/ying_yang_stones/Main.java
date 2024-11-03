package prins.kattis.ying_yang_stones;

// Problem url: https://open.kattis.com/problems/yingyangstones
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String testCase;
        
        try (Scanner reader = new Scanner(System.in)) {
            testCase = reader.nextLine();
        }

        boolean hasChanged = true;

        while (hasChanged) {
            hasChanged = false;

            String pattern = "BWW|WBW|WWB";
            String updated = testCase.replaceAll(pattern, "W");

            pattern = "WBB|BWB|BBW";
            updated = updated.replaceAll(pattern, "B");

            if (updated.length() != testCase.length()) {
                hasChanged = true;
            }

            testCase = updated;
        }

        if (testCase.equals("WB") || testCase.equals("BW")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
