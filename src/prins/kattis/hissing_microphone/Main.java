package prins.kattis.hissing_microphone;

// Problem url: https://open.kattis.com/problems/hissingmicrophone
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String sentence;
        
        try (Scanner reader = new Scanner(System.in)) {
            sentence = reader.nextLine();
        }

        String affected = sentence.replaceAll("s{2,}", "");

        if (affected.length() != sentence.length()) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
