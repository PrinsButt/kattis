package prins.kattis.run_length_encoding_run;

// Problem url: https://open.kattis.com/problems/runlengthcodingrun
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String[] parts;
        
        try (Scanner reader = new Scanner(System.in)) {
            parts = reader.nextLine().split(" ");
        }

        if (parts[0].equals("E")) {
            // encrypt message
            Pattern pattern = Pattern.compile("(.)\\1*");
            Matcher matcher = pattern.matcher(parts[1]);

            StringBuffer output = new StringBuffer();

            while (matcher.find()) {
                int length = matcher.end() - matcher.start();
                matcher.appendReplacement(output, "$1" + length);
            }

            matcher.appendTail(output);
            System.out.print(output);
        } else {
            // decrypt message
            Pattern pattern = Pattern.compile("(.)([0-9])+");
            Matcher matcher = pattern.matcher(parts[1]);

            StringBuffer output = new StringBuffer();

            while (matcher.find()) {
                int repetitions = Integer.parseInt(matcher.group(2));
                matcher.appendReplacement(output, new String(new char[repetitions]).replace("\0", "$1"));
            }

            matcher.appendTail(output);
            System.out.print(output);
        }
    }
}
