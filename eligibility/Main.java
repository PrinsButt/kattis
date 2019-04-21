// Problem url: https://open.kattis.com/problems/eligibility

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numStudents = Integer.parseInt(reader.nextLine());

    StringBuilder output = new StringBuilder();
    Calendar calendar = Calendar.getInstance();
    String pattern = "yyyy/MM/dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    for (int index=0; index < numStudents; index++) {
      try {
        String parts[] = reader.nextLine().split(" ");
        calendar.setTime(simpleDateFormat.parse(parts[1]));

        if (calendar.get(Calendar.YEAR) >= 2010 ) {
          output.append(parts[0]).append(" ").append("eligible\n");
        } else {
          calendar.setTime(simpleDateFormat.parse(parts[2]));

          if (calendar.get(Calendar.YEAR) >= 1991 ) {
            output.append(parts[0]).append(" ").append("eligible\n");
          }             
          else if (Integer.parseInt(parts[3]) > 40) {
            output.append(parts[0]).append(" ").append("ineligible\n");
          }
          else {
            output.append(parts[0]).append(" ").append("coach petitions\n");
          }
        }
      } catch(Exception e) {
        System.out.println(e);
      }
    }

    reader.close();
    System.out.println(output);
  }
}