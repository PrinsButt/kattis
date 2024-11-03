package prins.kattis.kleptography;

// Problem url: https://open.kattis.com/problems/kleptography
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StringBuffer word;
        String ciphertext;
        
        try (Scanner reader = new Scanner(System.in)) {
            reader.nextLine();
            word = new StringBuffer(reader.nextLine());
            ciphertext = reader.nextLine();
        }

        StringBuffer plaintext = new StringBuffer(word);

        int end = word.length();

        for (int index = ciphertext.length() - 1; index >= end; index--) {
            int c = ciphertext.charAt(index);
            int p = word.charAt(word.length() - (ciphertext.length() - index));
            int processed = (c - p) + 97;

            if ((c - p) < 0) {
                processed += 26;
            }

            plaintext.insert(0, (char) processed);
            word.insert(0, (char) processed);
        }

        System.out.println(plaintext);
    }
}
