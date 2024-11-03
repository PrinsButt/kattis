package prins.kattis.heliocentric;

import java.util.Scanner;

/**
 *
 * Problem URL: https://open.kattis.com/problems/heliocentric
 *
 * @author Prins Butt
 */
public class Main {

    public static void main(String[] args) {
        (new Main()).process();
    }

    public void process() {
        StringBuilder output = new StringBuilder();

        try (Scanner reader = new Scanner(System.in)) {
            int caseId = 1;
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                if (!line.isEmpty()) {
                    String parts[] = line.split(" ");
                    
                    if (parts.length == 2) {
                        int earthDay = Integer.parseInt(parts[0]);
                        int marsDay = Integer.parseInt(parts[1]);
                        int days = 0;

                        while (earthDay != 0 || marsDay != 0) {
                            earthDay = (earthDay + 1) % 365;
                            marsDay = (marsDay + 1) % 687;
                            days++;
                        }

                        output.append("Case ").append(caseId).append(": ")
                                .append(days).append("\n");
                    }
                }
                else {
                    break;
                }
                
                caseId++;
            }

            System.out.println(output);
        }
    }
}
