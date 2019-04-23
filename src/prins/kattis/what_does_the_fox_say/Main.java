package prins.kattis.what_does_the_fox_say;

// Problem url: https://open.kattis.com/problems/whatdoesthefoxsay
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            int numTestCases = Integer.parseInt(reader.nextLine());
            
            for (int testCase = 0; testCase < numTestCases; testCase++) {
                String recording = reader.nextLine();
                String info = "";
                
                while (!info.equals("what does the fox say?")) {
                    info = reader.nextLine();
                    String[] parts = info.split(" ");
                    String pattern = ("\\b" + parts[2] + "\\b");
                    recording = recording.replaceAll(pattern, "");
                    recording = recording.replaceAll("\\s{2,}", " ");
                    recording = recording.trim();
                }
                
                System.out.println(recording);
            }
        }
    }
}
