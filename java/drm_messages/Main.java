package prins.kattis.drm_messages;

// Problem url: https://open.kattis.com/problems/drmmessages
import java.util.Scanner;

class Main {

    private static String rotate(String text) {
        int rotationValue = 0;

        for (char letter : text.toCharArray()) {
            rotationValue += letter;
        }

        String rotated = "";

        for (char letter : text.toCharArray()) {
            int ascii = (letter + rotationValue);
            ascii = ((ascii - 65) % 26) + 65;
            rotated += (char) ascii;
        }

        return rotated;
    }

    private static String rotate(String firstText, String secondText) {
        String rotated = "";

        for (int index = 0; index < firstText.length(); index++) {
            int ascii = (firstText.charAt(index) 
                    + (secondText.charAt(index) - 65));
            ascii = ((ascii - 65) % 26) + 65;
            rotated += (char) ascii;
        }

        return rotated;
    }

    public static void main(String[] args) {
        String encrypted;
        
        try (Scanner reader = new Scanner(System.in)) {
            encrypted = reader.nextLine();
        }

        // divide
        String firstHalf = encrypted.substring(0, encrypted.length() / 2);
        String secondHalf = encrypted.substring(encrypted.length() / 2, encrypted.length());

        // rotate
        String firstRotated = rotate(firstHalf);
        String secondRotated = rotate(secondHalf);

        // merge
        String merged = rotate(firstRotated, secondRotated);

        System.out.println(merged);
    }
}
