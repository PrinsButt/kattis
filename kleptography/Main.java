// Problem url: https://open.kattis.com/problems/kleptography

import java.util.Scanner;

class Main {

  public static String process(String plaintext, String ciphertext) {
    StringBuffer processed = new StringBuffer();
    for (int index=0; index < plaintext.length(); index++) {
      int p = plaintext.charAt(index);
      int c = ciphertext.charAt(index);
      if (c - p < 0) {
        processed.append((char) ((c - p) + 97 + 26));
      } else {
        processed.append((char) ((c - p) + 97));
      }
    }
    return processed.toString();
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String data[] = reader.nextLine().split(" ");
    String endWord = reader.nextLine();
    String ciphertext = reader.nextLine();
    reader.close();

    StringBuffer plaintext = new StringBuffer(endWord);

    while(ciphertext.length() > 0) {
      int start = ciphertext.length() - endWord.length();
      if (start < 0) {
        start = 0;
        int endWordStart = endWord.length() - ciphertext.length();
        endWord = endWord.substring(endWordStart, endWord.length());
      }

      String partial = ciphertext.substring(start, ciphertext.length());
      ciphertext = ciphertext.substring(0, start);
      endWord = process(endWord, partial);
      plaintext.insert(0, endWord);
    }

    System.out.println(plaintext.toString().substring(Integer.parseInt(data[0]), plaintext.length()));
  }
}